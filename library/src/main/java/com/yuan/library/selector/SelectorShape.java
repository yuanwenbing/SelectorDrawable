package com.yuan.library.selector;

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

    private Shape.ShapeBuilder mShapeBuilder;

    private SelectorShape(SelectorBuilder builder) {
        this.mNormalColor = builder.normalColor;
        this.mPressedColor = builder.pressedColor;
        this.mDisableColor = builder.disableColor;
        this.mShapeBuilder = builder.shapeBuilder;
    }

    @Override
    public Drawable getNormalDrawable() {
        return mShapeBuilder.build().createGradientDrawable(mNormalColor);
    }

    @Override
    public Drawable getPressedDrawable() {
        return mShapeBuilder.build().createGradientDrawable(mPressedColor);
    }

    @Override
    public Drawable getDisableDrawable() {
        return mShapeBuilder.build().createGradientDrawable(mDisableColor);
    }

    public static class SelectorBuilder {

        private int normalColor = Color.BLUE;

        private int pressedColor = Color.GRAY;

        private int disableColor = Color.DKGRAY;

        private Shape.ShapeBuilder shapeBuilder = new Shape.ShapeBuilder();


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
