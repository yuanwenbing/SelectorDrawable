package com.yuan.library;

import android.graphics.drawable.StateListDrawable;
import android.icu.util.IslamicCalendar;

/**
 * Created by yuan on 25/11/2016.
 */

public class SelectorFactory {

    public static StateListDrawable create(ISelector selector) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-android.R.attr.state_pressed}, selector.getNormalDrawable());
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, selector.getPressedDrawable());
        return stateListDrawable;
    }

}
