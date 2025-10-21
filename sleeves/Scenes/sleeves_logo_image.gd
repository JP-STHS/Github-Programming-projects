extends Sprite2D

@onready var frame1 = get_parent().get_node("SleevesLogoImage")
@onready var frame3 = get_parent().get_node("SleevesLogoImage3")
@onready var scales = [frame1.scale, frame3.scale]
@onready var n = 1

func wait(seconds: float):
	await get_tree().create_timer(seconds).timeout

func _ready() -> void:
	while true:
		if n == 1:
			await wait(0.3)
			frame1.scale = scales[0]
			frame3.visible = false
			frame1.visible = true
			var tw = get_tree().create_tween()
			tw.set_trans(Tween.TRANS_BOUNCE)
			tw.set_ease(Tween.EASE_OUT)
			tw.tween_property(frame1, "scale", scales[1], 1)
			await tw.finished
			n += 1
		elif n == 2:
			await wait(0.3)
			frame3.scale = scales[1]
			frame3.visible = true
			frame1.visible = false
			var tw = get_tree().create_tween()
			tw.set_trans(Tween.TRANS_CUBIC)
			tw.set_ease(Tween.EASE_OUT)
			tw.tween_property(frame3, "scale", scales[0], 1)
			await tw.finished
			n-=1
