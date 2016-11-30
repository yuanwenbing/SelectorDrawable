# Description

主要用来为按钮设置selector,正常使用xml，不够灵活，而且代码量大，使用起来比较麻烦，定义这个类，使用Builder模式，使用起来比较灵活，可以设置圆角、描边，按下颜色，禁用颜色等，而且不需要太多的代码。

# Captures
![][image-1]

# Use

## Gradle

	compile 'com.yuan.library.selector:selectordrawable-release:1.0.2'

## Maven

	<dependency>
	  <groupId>~com.yuan.library.selector</groupId>
	  <artifactId>selectordrawable-release</artifactId>
	  <version>1.0.2</version>
	  <type>pom</type>
	</dependency>

# Example

	Button button1 = (Button) findViewById(R.id.button1);
	Drawable drawable1 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).disableColor(Color.BLUE).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
	button1.setBackgroundDrawable(drawable1);
	
	Button button2 = (Button) findViewById(R.id.button2);
	Drawable drawable2 = SelectorFactory.create(new SelectorDrawable.SelectorBuilder().normalDrawable(getResources().getDrawable(R.mipmap.button_normal)).pressDrawable(getResources().getDrawable(R.mipmap.button_press)).build());
	button2.setBackgroundDrawable(drawable2);
	
	Button button3 = (Button) findViewById(R.id.button3);
	Drawable drawable3 = new Shape.ShapeBuilder().strokeColor(Color.RED).strokeWidth(4).build().createGradientDrawable(Color.RED);
	button3.setBackgroundDrawable(drawable3);
	
	// 如果非Button控件，请加上clickable=“true”属性。
	TextView textView = (TextView) findViewById(R.id.textView);
	Drawable drawable4 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.BLUE).pressColor(Color.GRAY).shapeBuilder(new Shape.ShapeBuilder().corner(15)).build());
	textView.setBackgroundDrawable(drawable4);
	
	Button button5 = (Button) findViewById(R.id.button5);
	Drawable drawable5 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).disableColor(Color.GRAY).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
	button5.setBackgroundDrawable(drawable5);
	button5.setEnabled(false);



# About me
- Mail：[wenbing1007@163.com][1]
- QQ：11026979



[1]:	mailto:wenbing1007@163.com

[image-1]:	https://raw.githubusercontent.com/yuanwenbing/SelectorDrawable/master/captures/demo.gif