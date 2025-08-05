package editor

import extensions.editFacesByPart
import service.SkinPartService
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * 皮肤编辑器主类
 * 负责管理皮肤编辑操作和应用编辑结果
 */
class SkinEditor {
    private val edits = mutableListOf<(BufferedImage) -> Unit>()
    
    /**
     * 添加身体部位编辑操作
     * @param edit 是否执行编辑操作
     */
    fun body(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("body", edit).editFacesByPart(image) 
        }
    }

    /**
     * 添加头部编辑操作
     * @param edit 是否执行编辑操作
     */
    fun head(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("head", edit).editFacesByPart(image) 
        }
    }

    /**
     * 添加左臂编辑操作
     * @param edit 是否执行编辑操作
     */
    fun leftArm(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("left_arm", edit).editFacesByPart(image) 
        }
    }

    /**
     * 添加右臂编辑操作
     * @param edit 是否执行编辑操作
     */
    fun rightArm(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("right_arm", edit).editFacesByPart(image) 
        }
    }

    /**
     * 添加左腿编辑操作
     * @param edit 是否执行编辑操作
     */
    fun leftLeg(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("left_leg", edit).editFacesByPart(image) 
        }
    }
    
    /**
     * 添加右腿编辑操作
     * @param edit 是否执行编辑操作
     */
    fun rightLeg(edit: Boolean = true) {
        edits.add { image -> 
            SkinPartService.getFacesByPart("right_leg", edit).editFacesByPart(image) 
        }
    }

    /**
     * 应用所有编辑操作到图片并保存
     * @param image 目标图片
     */
    fun applyEdits(image: BufferedImage) {
        edits.forEach { it(image) }
        ImageIO.write(image, "PNG", File("output/test.png"))
    }
}