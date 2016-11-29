package com.yuan.library.selector;

import android.graphics.drawable.StateListDrawable;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorFactory {

    public static StateListDrawable create(ISelector selector) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-android.R.attr.state_enabled}, selector.getDisableDrawable());
        stateListDrawable.addState(new int[]{-android.R.attr.state_pressed}, selector.getNormalDrawable());
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, selector.getPressedDrawable());
        return stateListDrawable;
    }

}
