import editor.SkinEditor
import java.awt.image.BufferedImage

/**
 * 程序主入口
 * 创建一个64x64的空白图片，并对各个身体部位进行编辑操作
 */
fun main() {
    // 创建一个64x64的ARGB图片
    val image = BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB)
    
    // 创建皮肤编辑器实例
    val editor = SkinEditor()
    
    // 对各个身体部位进行编辑操作
    editor.apply {
        body(false)
        head(true)
        leftArm(true)
        rightArm(true)
        leftLeg(true)
        rightLeg(true)
        applyEdits(image)
    }.also { 
        println("图片已生成") 
    }
}