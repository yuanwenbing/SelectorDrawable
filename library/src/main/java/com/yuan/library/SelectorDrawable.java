package com.yuan.library;

import android.graphics.drawable.Drawable;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorDrawable implements ISelector{

    private Drawable mNormalDrawable;

    private Drawable mPressedDrawable;

    private Drawable mDisableDrawable;

    SelectorDrawable() {

    }

    SelectorDrawable(SelectorBuilder builder) {
        this.mNormalDrawable = builder.normalDrawable;
        this.mPressedDrawable = builder.pressDrawable;
        this.mDisableDrawable = builder.disableDrawable;
    }


    @Override
    public Drawable getNormalDrawable() {
        return mNormalDrawable;
    }

    @Override
    public Drawable getPressedDrawable() {
        return mPressedDrawable;
    }

    @Override
    public Drawable getDisableDrawable() {
        return mDisableDrawable;
    }


    public static class SelectorBuilder {

        Drawable normalDrawable;

        Drawable pressDrawable;

        Drawable disableDrawable;


        public SelectorBuilder normalDrawable(Drawable normalDrawable) {
            this.normalDrawable = normalDrawable;
            return this;
        }

        public SelectorBuilder pressDrawable(Drawable pressDrawable) {
            this.pressDrawable = pressDrawable;
            return this;
        }

        public SelectorBuilder disableDrawable(Drawable disableDrawable) {
            this.disableDrawable = disableDrawable;
            return this;
        }

        public SelectorDrawable build() {
            return new SelectorDrawable(this);
        }
    }
}
