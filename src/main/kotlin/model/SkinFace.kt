package model

/**
 * 皮肤面枚举类，表示皮肤的基本面
 * @param part 部位名，如 head、body、left_arm 等
 * @param face 面名称，如 front、back、left、right、top、bottom
 * @param x 起始 x 坐标
 * @param y 起始 y 坐标
 * @param width 宽度
 * @param height 高度
 */
enum class SkinFace(
    val part: String,
    val face: String,
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int
) {
    // ---- 头部 (Head) ----
    HEAD_TOP("head", "top", 8, 0, 8, 8),
    HEAD_BOTTOM("head", "bottom", 16, 0, 8, 8),
    HEAD_LEFT("head", "left", 16, 8, 8, 8),
    HEAD_FRONT("head", "front", 8, 8, 8, 8),
    HEAD_RIGHT("head", "right", 0, 8, 8, 8),
    HEAD_BACK("head", "back", 24, 8, 8, 8),

    // ---- 身体 (Body) ----
    BODY_TOP("body", "top", 20, 16, 8, 4),
    BODY_BOTTOM("body", "bottom", 28, 16, 8, 4),
    BODY_LEFT("body", "left", 16, 20, 4, 12),
    BODY_FRONT("body", "front", 20, 20, 8, 12),
    BODY_RIGHT("body", "right", 28, 20, 4, 12),
    BODY_BACK("body", "back", 32, 20, 8, 12),

    // ---- 左臂 (Left Arm) ----
    LEFT_ARM_TOP("left_arm", "top", 36, 48, 4, 4),
    LEFT_ARM_BOTTOM("left_arm", "bottom", 40, 48, 4, 4),
    LEFT_ARM_LEFT("left_arm", "left", 40, 52, 4, 12),
    LEFT_ARM_FRONT("left_arm", "front", 36, 52, 4, 12),
    LEFT_ARM_RIGHT("left_arm", "right", 32, 52, 4, 12),
    LEFT_ARM_BACK("left_arm", "back", 44, 52, 4, 12),

    // ---- 右臂 (Right Arm) ----
    RIGHT_ARM_TOP("right_arm", "top", 44, 16, 4, 4),
    RIGHT_ARM_BOTTOM("right_arm", "bottom", 48, 16, 4, 4),
    RIGHT_ARM_LEFT("right_arm", "left", 48, 20, 4, 12),
    RIGHT_ARM_FRONT("right_arm", "front", 44, 20, 4, 12),
    RIGHT_ARM_RIGHT("right_arm", "right", 40, 20, 4, 12),
    RIGHT_ARM_BACK("right_arm", "back", 52, 20, 4, 12),

    // ---- 左腿 (Left Leg) ----
    LEFT_LEG_TOP("left_leg", "top", 20, 48, 4, 4),
    LEFT_LEG_BOTTOM("left_leg", "bottom", 24, 48, 4, 4),
    LEFT_LEG_LEFT("left_leg", "left", 24, 52, 4, 12),
    LEFT_LEG_FRONT("left_leg", "front", 20, 52, 4, 12),
    LEFT_LEG_RIGHT("left_leg", "right", 16, 52, 4, 12),
    LEFT_LEG_BACK("left_leg", "back", 28, 52, 4, 12),

    // ---- 右腿 (Right Leg) ----
    RIGHT_LEG_TOP("right_leg", "top", 4, 16, 4, 4),
    RIGHT_LEG_BOTTOM("right_leg", "bottom", 8, 16, 4, 4),
    RIGHT_LEG_LEFT("right_leg", "left", 8, 20, 4, 12),
    RIGHT_LEG_FRONT("right_leg", "front", 4, 20, 4, 12),
    RIGHT_LEG_RIGHT("right_leg", "right", 0, 20, 4, 12),
    RIGHT_LEG_BACK("right_leg", "back", 12, 20, 4, 12),
}