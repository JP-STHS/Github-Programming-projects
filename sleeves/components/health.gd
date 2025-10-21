class_name Health
extends Node


signal max_health_changed(diff: int)
signal health_changed(diff: int)
signal health_depleted


@export var max_health: int = 3 : set = set_max_health, get = get_max_health
@export var immortality: bool = false :  set = set_immortality, get = get_immortality
@onready var character_body_2d: CharacterBody2D = $".."
@onready var death: Sprite2D = $"../Death"
#@onready var death_2: Sprite2D = $"../Death2"

var immortality_timer: Timer = null

@onready var health: int = max_health :  set = set_health, get = get_health

func set_max_health(value: int):
	var clamped_value = 1 if value <=0 else value
	
	if not clamped_value == max_health:
		var difference = clamped_value - max_health
		max_health = clamped_value
		max_health_changed.emit(difference)
		
		if health > max_health:
			health = max_health
		
func get_max_health() -> int:
	return max_health

func set_immortality(value: bool):
	immortality = value
func get_immortality() -> bool:
	return immortality
func set_temporary_immortality(time: float):
	if immortality_timer == null:
		immortality_timer = Timer.new()
		immortality_timer.one_shot = true
		add_child(immortality_timer)
		
	if immortality_timer.timeout.is_connected(set_immortality):
		immortality_timer.timeout.disconnect(set_immortality)
		
	immortality_timer.set_wait_time(time)
	immortality_timer.timeout.connect(set_immortality.bind(false))
	immortality = true
	immortality_timer.start()
	
func set_health(value: int):
	if value < health and immortality:
		return
	
	var clamped_value = clampi(value, 0, max_health)
	
	if clamped_value != health:
		var difference = clamped_value - health
		health = clamped_value
		health_changed.emit(difference)
		
		if health == 0:
			death.visible = true
			#death_2.visible = true
			health_depleted.emit()
			await get_tree().create_timer(0.5).timeout
			death.visible = false
			#death_2.visible = false
func get_health() -> int:
	return health


func _on_character_body_2d_rehealth() -> int:
	health = max_health
	return health
