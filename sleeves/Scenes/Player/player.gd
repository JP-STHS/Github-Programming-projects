extends CharacterBody2D


const SPEED = 300.0
const JUMP_VELOCITY = -300.0
const ACCELERATION = 0.1
const DECELERATION = 0.1

signal respawned()
signal rehealth()
#@onready var gc := $GrappleController

var arm1: Sprite2D
var arm2: Sprite2D
@onready var shooted_arm1 := get_node("GrappleController/Line2D")
@onready var shooted_arm2 := get_node("GrappleController2/Line2D")
@onready var anim: AnimatedSprite2D = $AnimatedSprite2D
@onready var grapple1 = $GrappleController
@onready var grapple2 = $GrappleController2
@onready var collision2d: CollisionShape2D = $CollisionShape2D
@onready var death: Sprite2D = $Death
@onready var pain: Sprite2D = $Pain
#@onready var death_2: Sprite2D = $Death2


var is_shooting = false

func _ready():
	grapple1.launchedsig.connect(_on_grapple_launched)
	grapple1.retractedsig.connect(_on_grapple_retracted)
	grapple2.launchedsig.connect(_on_grapple_launched)
	grapple2.retractedsig.connect(_on_grapple_retracted)

func _on_grapple_launched():
	is_shooting = true
	anim.play("Shoot")

func _on_grapple_retracted():
	is_shooting = false
func _on_health_health_depleted():
	# fade out
	set_physics_process(false)
	var tween := create_tween()
	tween.tween_property(self, "modulate:a", 0.0, 0.4) # fade out over 0.4s
	await tween.finished
	set_physics_process(false)
	respawned.emit()
	rehealth.emit()
	# wait before respawn
	await get_tree().create_timer(0.2).timeout
	# fade in
	set_physics_process(true)
	var tween2 := create_tween()
	tween2.tween_property(self, "modulate:a", 1.0, 0.4) # fade back in
	set_physics_process(true)

func _physics_process(delta: float) -> void:
	arm1 = get_node("Arm1")
	arm2 = get_node("Arm2")
	# Add the gravity.
	if not is_on_floor():
		velocity += get_gravity() * delta

	# Handle jump.
	if Input.is_action_pressed("charup") and is_on_floor():
		velocity.y = JUMP_VELOCITY

	if Input.is_action_just_pressed("chardown") and not is_on_floor():
		velocity.y = -JUMP_VELOCITY *2
		
	
	# Get the input direction and handle the movement/deceleration.
	var direction := Input.get_axis("charleft", "charright")
	if direction:
		velocity.x = lerp(velocity.x, direction * SPEED, ACCELERATION)
	else:
		velocity.x = lerp(velocity.x, 0.0, DECELERATION)
	if velocity.x:
		if velocity.x > 0:
			arm1.scale.y = abs(arm1.scale.y)   # facing right
			arm2.scale.y = abs(arm2.scale.y)
		else:
			arm1.scale.y = -abs(arm1.scale.y)  # facing left
			arm2.scale.y = -abs(arm2.scale.y)
		#arm1.flip_v = velocity.x < 0
		#arm2.flip_v = velocity.x < 0
		arm1.z_index = 2 if velocity.x < 0 else 0
		arm2.z_index = 0 if velocity.x < 0 else 2
		shooted_arm1.z_index = 8 if velocity.x < 0 else 7
		shooted_arm2.z_index = 7 if velocity.x < 0 else 8
		anim.flip_h = velocity.x > 0
		death.flip_h = velocity.x > 0
		#death_2.flip_h = velocity.x > 0
		pain.flip_h = velocity.x > 0
	
	#play anims
	if not is_shooting:
		if is_on_floor():
			if direction:
				anim.play("Run")
			else:
				anim.play("Idle")
		else:
			if velocity.y < 0:
				anim.play("Jump")
			elif velocity.y > 400:
				anim.play("Fall")
	

	#circling arms
	move_and_slide()
