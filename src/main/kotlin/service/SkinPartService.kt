package service

import model.SkinFace
import model.OuterSkinFace

/**
 * 根据身体部位获取对应的皮肤面列表
 */
object SkinPartService {
    
    /**
     * 根据部位名称获取皮肤面列表
     * @param part 部位名称
     * @param isOuter 是否包含外部皮肤面
     * @return 对应部位的皮肤面列表
     */
    fun getFacesByPart(part: String, isOuter: Boolean = false): List<Enum<*>> {
        return if (isOuter)
            OuterSkinFace.entries.filter { it.part == part } +
                    SkinFace.entries.filter { it.part == part }
        else
            SkinFace.entries.filter { it.part == part }
    }
}