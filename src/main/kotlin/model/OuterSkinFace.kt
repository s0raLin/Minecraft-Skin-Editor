package model

/**
 * 外部皮肤面枚举类，表示皮肤的外部层面
 * @param part 部位名，如 head、body、left_arm 等
 * @param face 面名称，如 front、back、left、right、top、bottom
 * @param x 起始 x 坐标
 * @param y 起始 y 坐标
 * @param width 宽度
 * @param height 高度
 */
enum class OuterSkinFace(
    val part: String,
    val face: String,
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int
) {
    // ---- 头部 (Head) ----
    HEAD_TOP("head", "top", 40, 0, 8, 8),
    HEAD_BOTTOM("head", "bottom", 48, 0, 8, 8),
    HEAD_LEFT("head", "left", 48, 8, 8, 8),
    HEAD_FRONT("head", "front", 40, 8, 8, 8),
    HEAD_RIGHT("head", "right", 32, 8, 8, 8),
    HEAD_BACK("head", "back", 56, 8, 8, 8),

    // ---- 身体 (Body) ----
    BODY_TOP("body", "top", 20, 32, 8, 4),
    BODY_BOTTOM("body", "bottom", 28, 32, 8, 4),
    BODY_LEFT("body", "left", 28, 36, 4, 12),
    BODY_FRONT("body", "front", 20, 36, 8, 12),
    BODY_RIGHT("body", "right", 16, 36, 4, 12),
    BODY_BACK("body", "back", 32, 36, 8, 12),

    // ---- 左臂 (Left Arm) ----
    LEFT_ARM_TOP("left_arm", "top", 52, 48, 4, 4),
    LEFT_ARM_BOTTOM("left_arm", "bottom", 56, 48, 4, 4),
    LEFT_ARM_LEFT("left_arm", "left", 56, 52, 4, 12),
    LEFT_ARM_FRONT("left_arm", "front", 52, 52, 4, 12),
    LEFT_ARM_RIGHT("left_arm", "right", 48, 52, 4, 12),
    LEFT_ARM_BACK("left_arm", "back", 60, 52, 4, 12),

    // ---- 右臂 (Right Arm) ----
    RIGHT_ARM_TOP("right_arm", "top", 44, 32, 4, 4),
    RIGHT_ARM_BOTTOM("right_arm", "bottom", 48, 32, 4, 4),
    RIGHT_ARM_LEFT("right_arm", "left", 48, 36, 4, 12),
    RIGHT_ARM_FRONT("right_arm", "front", 44, 36, 4, 12),
    RIGHT_ARM_RIGHT("right_arm", "right", 40, 36, 4, 12),
    RIGHT_ARM_BACK("right_arm", "back", 52, 36, 4, 12),

    // ---- 左腿 (Left Leg) ----
    LEFT_LEG_TOP("left_leg", "top", 4, 48, 4, 4),
    LEFT_LEG_BOTTOM("left_leg", "bottom", 8, 48, 4, 4),
    LEFT_LEG_LEFT("left_leg", "left", 8, 52, 4, 12),
    LEFT_LEG_FRONT("left_leg", "front", 4, 52, 4, 12),
    LEFT_LEG_RIGHT("left_leg", "right", 0, 52, 4, 12),
    LEFT_LEG_BACK("left_leg", "back", 12, 52, 4, 12),

    // ---- 右腿 (Right Leg) ----
    RIGHT_LEG_TOP("right_leg", "top", 4, 32, 4, 4),
    RIGHT_LEG_BOTTOM("right_leg", "bottom", 8, 32, 4, 4),
    RIGHT_LEG_LEFT("right_leg", "left", 8, 36, 4, 12),
    RIGHT_LEG_FRONT("right_leg", "front", 4, 36, 4, 12),
    RIGHT_LEG_RIGHT("right_leg", "right", 0, 36, 4, 12),
    RIGHT_LEG_BACK("right_leg", "back", 12, 36, 4, 12),
}