# Description

主要用来为按钮设置selector,正常使用xml，不够灵活，而且代码量大，使用起来比较麻烦，定义这个类，使用Builder模式，使用起来比较灵活，可以设置圆角、描边，按下颜色，禁用颜色，选中颜色等，而且不需要太多的代码。

# Captures
![][image-1]

# Use

## Gradle

	compile 'com.yuan.library.selector:selectordrawable-release:1.0.3'

## Maven

	<dependency>
	  <groupId>~com.yuan.library.selector</groupId>
	  <artifactId>selectordrawable-release</artifactId>
	  <version>1.0.3</version>
	  <type>pom</type>
	</dependency>

# Example

    // 使用颜色
    SelectorFactory.create(new SelectorShape.SelectorBuilder()
                                        .normalColor() // 正常颜色
                                        .pressColor() // 按下颜色
                                        .disableColor() // 禁用颜色
                                        .selectColor() // 选择颜色
                                        .shapeBuilder(new Shape.ShapeBuilder()
                                        .corner() // 全部圆角
                                        .leftTopCorner() // 左上圆角
                                        .leftBottomCorner() // 左下圆角
                                        .rightTopCorner() //右上圆角
                                        .rightBottomCorner() // 右下圆角
                                        .strokeColor() // 描边颜色
                                        .strokeWidth()).build()) // 描边size
    // 使用按钮                                    
    SelectorFactory.create(new SelectorDrawable.SelectorBuilder()
                                        .normalDrawable()
                                        .pressDrawable()
                                        .disableDrawable()
                                        .selectDrawable().build())


# About me
- Mail：[wenbing1007@163.com][1]
- QQ：11026979



[1]:	mailto:wenbing1007@163.com

[image-1]:	https://raw.githubusercontent.com/yuanwenbing/SelectorDrawable/master/captures/demo.gif

