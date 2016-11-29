# SelectorDrawable
# Use

		Button button1 = (Button) findViewById(R.id.button1);
	        Drawable drawable1 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
	        button1.setBackground(drawable1);
	
	        Button button2 = (Button) findViewById(R.id.button2);
	        Drawable drawable2 = SelectorFactory.create(new SelectorDrawable.SelectorBuilder().normalDrawable(getDrawable(R.mipmap.test_normal)).pressDrawable(getDrawable(R.mipmap.test_press)).build());
	        button2.setBackground(drawable2);
	
	        Button button3 = (Button) findViewById(R.id.button3);
	        Drawable drawable3 = new Shape.ShapeBuilder().strokeColor(Color.RED).strokeWidth(4).corner(30).build().createGradientDrawable(Color.RED);
	        button3.setBackground(drawable3);
	
	        TextView textView = (TextView) findViewById(R.id.textView);
	        Drawable drawable4 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
	        textView.setBackground(drawable4);

