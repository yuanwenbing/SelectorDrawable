package com.yuan.library;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorShape extends SelectorDrawable{

    private int mNormalColor;

    private int mPressedColor;

    private int mDisableColor;

    private Shape.ShapeBuilder mSingleBuilder;

    private SelectorShape(SelectorBuilder builder) {
        this.mNormalColor = builder.normalColor;
        this.mPressedColor = builder.pressedColor;
        this.mDisableColor = builder.disableColor;
        this.mSingleBuilder = builder.shapeBuilder;
    }

    @Override
    public Drawable getNormalDrawable() {
        if (mSingleBuilder == null) {
            mSingleBuilder = new Shape.ShapeBuilder();
        }
        return mSingleBuilder.build().createGradientDrawable(mNormalColor);
    }

    @Override
    public Drawable getPressedDrawable() {
        if (mSingleBuilder == null) {
            mSingleBuilder = new Shape.ShapeBuilder();
        }
        return mSingleBuilder.build().createGradientDrawable(mPressedColor);
    }

    @Override
    public Drawable getDisableDrawable() {
        if (mSingleBuilder == null) {
            mSingleBuilder = new Shape.ShapeBuilder();
        }
        return mSingleBuilder.build().createGradientDrawable(mDisableColor);
    }

    public static class SelectorBuilder {

        int normalColor = Color.BLUE;

        int pressedColor = Color.GRAY;

        int disableColor = Color.DKGRAY;

        Shape.ShapeBuilder shapeBuilder;


        public SelectorBuilder normalColor(@ColorInt int normalColor) {
            this.normalColor = normalColor;
            return this;
        }

        public SelectorBuilder normalColorRes(@ColorRes int normalColor) {
            return this;
        }

        public SelectorBuilder pressColor(@ColorInt int pressColor) {
            this.pressedColor = pressColor;
            return this;
        }

        public SelectorBuilder disableColor(@ColorInt int disableColor) {
            this.disableColor = disableColor;
            return this;
        }


        public SelectorBuilder shapeBuilder(Shape.ShapeBuilder shapeBuilder) {
            this.shapeBuilder = shapeBuilder;
            return this;
        }



        public SelectorShape build() {
            return new SelectorShape(this);
        }
    }
}
