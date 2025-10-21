class_name HurtBox
extends Area2D


signal recieved_damage(damage: int)

@export var health: Health
@onready var pain: Sprite2D = $"../Pain"

func _ready():
	connect("area_entered", _on_area_entered)

func _on_area_entered(hitbox: HitBox) -> void:
	if hitbox != null:
		health.health -= hitbox.damage
		recieved_damage.emit(hitbox.damage)
		if health.health > 0:
			pain.visible = true
			await get_tree().create_timer(0.5).timeout
			pain.visible = false
