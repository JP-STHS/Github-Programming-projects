extends CanvasLayer

@onready var anim: AnimationPlayer = $CircleTransition/AnimationPlayer
@onready var rect: ColorRect = $CircleTransition
var next_scene: String = ""

func start_transition(scene_path: String) -> void:
	next_scene = scene_path
	rect.mouse_filter = Control.MOUSE_FILTER_STOP   # block input during transition
	anim.play("FadeToBlack")

func _ready() -> void:
	anim.animation_finished.connect(_on_anim_finished)
	rect.set_anchors_preset(Control.PRESET_FULL_RECT)
	rect.mouse_filter = Control.MOUSE_FILTER_IGNORE   # allow clicks through by default

func _on_anim_finished(anim_name: String) -> void:
	if anim_name == "FadeToBlack":
		get_tree().change_scene_to_file(next_scene)
		anim.play("FadeFromBlack")
	elif anim_name == "FadeFromBlack":
		rect.mouse_filter = Control.MOUSE_FILTER_IGNORE   # release input after transition
