package com.yuan.selectordrawable;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yuan.library.selector.SelectorDrawable;
import com.yuan.library.selector.SelectorFactory;
import com.yuan.library.selector.SelectorShape;
import com.yuan.library.selector.Shape;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Drawable drawable1 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).disableColor(Color.BLUE).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
        button1.setBackgroundDrawable(drawable1);

        Button button2 = (Button) findViewById(R.id.button2);
        Drawable drawable2 = SelectorFactory.create(new SelectorDrawable.SelectorBuilder().normalDrawable(getResources().getDrawable(R.mipmap.button_normal)).pressDrawable(getResources().getDrawable(R.mipmap.button_press)).build());
        button2.setBackgroundDrawable(drawable2);

        Button button3 = (Button) findViewById(R.id.button3);
        Drawable drawable3 = new Shape.ShapeBuilder().strokeColor(Color.RED).strokeWidth(4).build().createGradientDrawable(Color.RED);
        button3.setBackgroundDrawable(drawable3);

        TextView textView = (TextView) findViewById(R.id.textView);
        Drawable drawable4 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.BLUE).pressColor(Color.GRAY).shapeBuilder(new Shape.ShapeBuilder().corner(15)).build());
        textView.setBackgroundDrawable(drawable4);

        Button button5 = (Button) findViewById(R.id.button5);
        Drawable drawable5 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.GREEN).disableColor(Color.GRAY).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
        button5.setBackgroundDrawable(drawable5);
        button5.setEnabled(false);

        Button button6 = (Button) findViewById(R.id.button_select_0);
        Drawable drawable6 = SelectorFactory.create(new SelectorShape.SelectorBuilder().normalColor(Color.RED).pressColor(Color.BLUE).selectColor(Color.BLUE).shapeBuilder(new Shape.ShapeBuilder().corner(30)).build());
        button6.setBackgroundDrawable(drawable6);
        button6.setSelected(true);
        // 用颜色设置按钮


    }

    public void onClick(View view) {
        view.setSelected(!view.isSelected());
    }
}
