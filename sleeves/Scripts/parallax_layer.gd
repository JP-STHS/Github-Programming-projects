extends ParallaxLayer

@export var cloud_speed: Vector2 = Vector2(-20, 0)

func _process(delta: float) -> void:
	motion_offset += cloud_speed * delta
