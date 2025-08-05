package editor

import java.awt.Color
import java.awt.image.BufferedImage

/**
 * 图片编辑工具类
 */
object ImageEditor {
    
    /**
     * 编辑皮肤面
     * @param image 目标图片
     * @param x 起始x坐标
     * @param y 起始y坐标
     * @param width 宽度
     * @param height 高度
     */
    fun editSkinFace(image: BufferedImage, x: Int, y: Int, width: Int, height: Int) {
        image.createGraphics().apply { 
            color = Color.BLUE
            fillRect(x, y, width, height) 
        }
    }
    
    /**
     * 编辑外部皮肤面
     * @param image 目标图片
     * @param x 起始x坐标
     * @param y 起始y坐标
     * @param width 宽度
     * @param height 高度
     */
    fun editOuterSkinFace(image: BufferedImage, x: Int, y: Int, width: Int, height: Int) {
        image.createGraphics().apply {
            color = Color.RED
            fillRect(x, y, width, height)
        }
    }
}