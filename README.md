# Description

主要用来为按钮设置selector,正常使用xml，不够灵活，而且代码量大，使用起来比较麻烦，定义这个类，使用Builder模式，使用起来比较灵活，可以设置圆角、描边，按下颜色，禁用颜色等，而且不需要太多的代码。

# Captures
![][image-1]

# Use

## Gradle:
	compile 'com.yuan.library.selector:selectordrawable-release:1.0.1'

## Maven

\`\`\`xml
 <dependency>
   <groupId>com.yuan.library.selector</groupId>
   <artifactId>selectordrawable-release</artifactId>
   <version>1.0.1</version>
   <type>pom</type>
 </dependency>
 \`\`\`


# Example

\`\`\`java
Button button1 = (Button) findViewById(R.id.button1);
Drawable drawable1 = SelectorFactory.create(newSelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
button1.setBackground(drawable1);

Button button2 = (Button) findViewById(R.id.button2);
Drawable drawable2 = SelectorFactory.create(new SelectorDrawable.SelectorBuilder().normalDrawable(getDrawable(R.mipmap.test\_normal)).pressDrawable(getDrawable(R.mipmap.test\_press)).build());
button2.setBackground(drawable2);

Button button3 = (Button) findViewById(R.id.button3);
Drawable drawable3 = new Shape.ShapeBuilder().strokeColor(Color.RED).strokeWidth(4).corner(30).build().createGradientDrawable(Color.RED);
button3.setBackground(drawable3);
 
TextView textView = (TextView) findViewById(R.id.textView);
Drawable drawable4 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
textView.setBackground(drawable4);
  \`\`\`

如果非Button控件使用，那么要加上clickable=“true”属性。
# 
# About me
- Mail：[wenbing1007@163.com][1]
- QQ：11026979



[1]:	mailto:wenbing1007@163.com

[image-1]:	https://raw.githubusercontent.com/yuanwenbing/SelectorDrawable/master/captures/2016-11-29%2023_49_02.gif