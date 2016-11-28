package com.yuan.library;

import android.graphics.drawable.Drawable;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorDrawable implements ISelector{

    private Drawable mNormalDrawable;

    private Drawable mPressedDrawable;

    SelectorDrawable() {

    }

    SelectorDrawable(SelectorBuilder builder) {
        this.mNormalDrawable = builder.normalDrawable;
        this.mPressedDrawable = builder.pressDrawable;
    }


    @Override
    public Drawable getNormalDrawable() {
        return mNormalDrawable;
    }

    @Override
    public Drawable getPressedDrawable() {
        return mPressedDrawable;
    }


    public static class SelectorBuilder {

        Drawable normalDrawable;

        Drawable pressDrawable;


        public SelectorBuilder normalDrawable(Drawable normalDrawable) {
            this.normalDrawable = normalDrawable;
            return this;
        }

        public SelectorBuilder pressDrawable(Drawable pressDrawable) {
            this.pressDrawable = pressDrawable;
            return this;
        }

        public SelectorDrawable build() {
            return new SelectorDrawable(this);
        }
    }
}
