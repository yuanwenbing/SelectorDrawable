package com.yuan.library.selector;

import android.graphics.drawable.Drawable;

/**
 * Created by yuan on 25/11/2016.
 */

public interface ISelector {

    Drawable getNormalDrawable();

    Drawable getPressedDrawable();

    Drawable getDisableDrawable();
}
