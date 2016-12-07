package com.yuan.library.selector;

import android.graphics.drawable.Drawable;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorDrawable implements ISelector{

    private Drawable mNormalDrawable;

    private Drawable mPressedDrawable;

    private Drawable mDisableDrawable;

    private Drawable mSelectDrawable;

    SelectorDrawable() {

    }

    private SelectorDrawable(SelectorBuilder builder) {
        this.mNormalDrawable = builder.normalDrawable;
        this.mPressedDrawable = builder.pressDrawable;
        this.mDisableDrawable = builder.disableDrawable;
        this.mSelectDrawable = builder.selectDrawable;
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

    @Override
    public Drawable getSelectDrawable() {
        return mSelectDrawable;
    }

    public static class SelectorBuilder {

        Drawable normalDrawable;

        Drawable pressDrawable;

        Drawable disableDrawable;

        Drawable selectDrawable;


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

        public SelectorBuilder selectDrawable(Drawable selectDrawable) {
            this.selectDrawable = selectDrawable;
            return this;
        }

        public SelectorDrawable build() {
            return new SelectorDrawable(this);
        }
    }
}
