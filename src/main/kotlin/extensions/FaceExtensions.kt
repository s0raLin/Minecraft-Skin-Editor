package extensions

import editor.ImageEditor
import model.SkinFace
import model.OuterSkinFace
import java.awt.image.BufferedImage

/**
 * 面部扩展函数，用于编辑特定部位的皮肤面
 */
fun List<Enum<*>>.editFacesByPart(image: BufferedImage) {
    for (face in this) {
        when (face) {
            is SkinFace -> {
                ImageEditor.editSkinFace(image, face.x, face.y, face.width, face.height)
            }
            is OuterSkinFace -> {
                ImageEditor.editOuterSkinFace(image, face.x, face.y, face.width, face.height)
            }
        }
    }
}