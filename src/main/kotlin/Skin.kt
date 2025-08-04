import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

enum class SkinFace(
    val part: String,   // 部位名，如 head、body、left_arm 等
    val face: String,   // 面名称，如 front、back、left、right、top、bottom
    val x: Int,         // 起始 x 坐标
    val y: Int,         // 起始 y 坐标
    val width: Int,     // 宽度
    val height: Int     // 高度
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


enum class OuterSkinFace(
    val part: String,   // 部位名，如 head、body、left_arm 等
    val face: String,   // 面名称，如 front、back、left、right、top、bottom
    val x: Int,         // 起始 x 坐标
    val y: Int,         // 起始 y 坐标
    val width: Int,     // 宽度
    val height: Int     // 高度
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

fun getFacesByPart(part: String, isOuter: Boolean = false): List<Enum<*>> {
    return if(isOuter)
        OuterSkinFace.entries.filter { it.part == part } +
                SkinFace.entries.filter { it.part == part }
    else
        SkinFace.entries.filter { it.part == part }
}
fun editSkinFace(x: Int, y: Int, width: Int, height: Int) {
    image.createGraphics().apply { color = Color.BLUE; fillRect(x, y,width,height) }
}
fun editOuterSkinFace(x: Int, y: Int, width: Int, height: Int) {
    image.createGraphics().apply {
            color = Color.RED
            fillRect(x, y, width, height) // 使用指定颜色填充整个矩形区域
        }
}
fun List<Enum<*>>.editFacesByPart() {
    for(face in this) {
        when(face) {
           is SkinFace -> {
               editSkinFace(face.x, face.y, face.width, face.height)
           }
           is OuterSkinFace -> {
               editOuterSkinFace(face.x, face.y, face.width, face.height)
           }
        }
    }
}

class SkinEditor {
    private val edits = mutableListOf<() -> Unit>()
    fun body(edit: Boolean = true) {
        edits.add { getFacesByPart("body", edit).editFacesByPart() }
    }

    fun head(edit: Boolean = true) {
        edits.add { getFacesByPart("head", edit).editFacesByPart() }
    }

    fun leftArm(edit: Boolean = true) {
        edits.add {getFacesByPart("left_arm", edit).editFacesByPart() }
    }

    fun rightArm(edit: Boolean = true) {
        edits.add {getFacesByPart("right_arm", edit).editFacesByPart() }
    }

    fun leftLeg(edit: Boolean = true) {
        edits.add { getFacesByPart("left_leg",edit).editFacesByPart() }
    }
    fun rightLeg(edit: Boolean = true) {
        edits.add { getFacesByPart("right_leg",edit).editFacesByPart() }
    }

    // 可以根据需要添加其他部分

    fun applyEdits(image: BufferedImage) {
        edits.forEach { it() }
        ImageIO.write(image, "PNG", File("test.png"))
    }
}


val image = BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB)
fun main() {
    val editor = SkinEditor()
    editor.apply {
        body(false)
        head(true)
        leftArm(true)
        rightArm(true)
        leftLeg(true)
        rightLeg(true)
        applyEdits(image)
    }
}