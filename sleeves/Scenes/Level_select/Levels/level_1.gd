extends Node2D

@onready var marker_2d: Marker2D = $Marker2D
@onready var character_body_2d: CharacterBody2D = $CharacterBody2D
#@onready var meep: CollisionShape2D

func _on_character_body_2d_respawned() -> void:
	#character_body_2d.set_physics_process(true)
	#meep = character_body_2d.get_node("CollisionShape2D")
	#meep.disabled = false
	character_body_2d.global_position = marker_2d.global_position
	
