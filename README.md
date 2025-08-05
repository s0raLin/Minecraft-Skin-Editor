# Skin Editor

一个使用 Kotlin 编写的皮肤编辑器，可以对 Minecraft 皮肤进行编辑和处理。

## 项目结构

```
src/
├── main/
│   └── kotlin/
│       ├── Main.kt                 # 程序入口点
│       ├── model/                  # 数据模型
│       │   ├── SkinFace.kt         # 基础皮肤面枚举
│       │   └── OuterSkinFace.kt    # 外部皮肤面枚举
│       ├── service/                # 业务逻辑服务
│       │   └── SkinPartService.kt  # 皮肤部位服务
│       ├── editor/                 # 编辑器相关
│       │   ├── SkinEditor.kt       # 主编辑器
│       │   └── ImageEditor.kt      # 图像编辑工具
│       └── extensions/             # 扩展函数
│           └── FaceExtensions.kt   # 面部处理扩展函数
└── test/
    └── kotlin/                     # 测试代码
```

## 功能说明

本项目可以对 Minecraft 皮肤的各个部位进行编辑，包括：

- 头部 (Head)
- 身体 (Body)
- 左臂 (Left Arm)
- 右臂 (Right Arm)
- 左腿 (Left Leg)
- 右腿 (Right Leg)

每个部位都有多个面（front、back、left、right、top、bottom）可以单独处理。

## 使用方法

1. 构建项目：
   ```bash
   ./gradlew build
   ```

2. 运行项目：
   ```bash
   ./gradlew run
   ```

3. 生成的图片将保存为output目录下的 `test.png` 文件

## 代码说明

### 核心类和组件

- `SkinFace` 和 `OuterSkinFace`：枚举类，定义了皮肤各部位面的坐标和尺寸信息
- `SkinPartService`：根据部位名称获取对应的皮肤面列表
- `ImageEditor`：提供基础的图像编辑功能，如填充矩形区域
- `SkinEditor`：主编辑器类，管理各个部位的编辑操作
- `FaceExtensions`：扩展函数，用于批量处理面部编辑操作

### 工作流程

1. 程序从 [Main.kt](src/main/kotlin/Main.kt) 入口开始执行
2. 创建一个 64x64 的空白图像
3. 初始化 [SkinEditor](src/main/kotlin/editor/SkinEditor.kt) 实例
4. 通过 [SkinEditor](src/main/kotlin/editor/SkinEditor.kt) 指定需要编辑的皮肤部位
5. 调用 `applyEdits` 方法应用所有编辑操作并保存图像

## 依赖库

- Kotlin 标准库
- Java AWT/Swing (用于图像处理)
- Gradle 构建工具

## 开发环境

- Kotlin 2.2.0
- JDK 17
- Gradle 8.x

## 优化说明

相比原始版本，优化后的代码具有以下特点：

1. **清晰的包结构**：按照功能将代码分为 model、service、editor 和 extensions 包
2. **明确的命名**：类名和方法名更加明确地表达了其用途
3. **详细的注释**：为关键类和方法添加了说明性注释
4. **合理的职责分离**：每个类和函数都有明确的职责
5. **扩展性**：易于添加新的皮肤部位或编辑功能
