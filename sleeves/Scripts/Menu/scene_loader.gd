extends Node


func _on_start_button_pressed() -> void:
	Transition.start_transition("res://Scenes/Level_select/level_select.tscn")
