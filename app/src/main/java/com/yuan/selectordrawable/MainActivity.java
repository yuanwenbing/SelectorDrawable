package com.yuan.selectordrawable;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.yuan.library.selector.SelectorDrawable;
import com.yuan.library.selector.SelectorFactory;
import com.yuan.library.selector.SelectorShape;
import com.yuan.library.selector.Shape;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Drawable drawable1 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).disableColor(Color.BLUE).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
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

    }
}
