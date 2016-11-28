package com.yuan.library;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by yuan on 25/11/2016.
 */

public class Shape {

    private int mCorner;

    private int mStrokeColor;

    private int mStrokeWidth;

    private int mLeftTopCorner;

    private int mRightTopCorner;

    private int mLeftBottomCorner;

    private int mRightBottomCorner;

    Shape(ShapeBuilder builder) {
        mCorner = builder.corner;
        mStrokeColor = builder.strokeColor;
        mStrokeWidth = builder.strokeWidth;
        mLeftTopCorner = builder.leftTopCorner;
        mRightTopCorner = builder.rightTopCorner;
        mLeftBottomCorner = builder.leftBottomCorner;
        mRightBottomCorner = builder.rightBottomCorner;
    }

    public GradientDrawable createGradientDrawable(@ColorInt int color) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(mCorner);
        drawable.setColor(color);
        drawable.setStroke(mStrokeWidth, mStrokeColor);
        if (mCorner == 0) {
            drawable.setCornerRadii(new float[]{mLeftTopCorner, mLeftTopCorner, mRightTopCorner, mRightTopCorner, mRightBottomCorner, mRightBottomCorner, mLeftBottomCorner, mLeftBottomCorner});
        }
        return drawable;
    }

    public static class ShapeBuilder {

        DisplayMetrics displayMetrics;

        private int corner = 0;

        private int strokeColor = Color.TRANSPARENT;

        private int strokeWidth = 0;

        private int unit;

        private int leftTopCorner;

        private int rightTopCorner;

        private int leftBottomCorner;

        private int rightBottomCorner;



        public ShapeBuilder corner(int corner) {
            this.corner = corner;
            return this;
        }

        public ShapeBuilder strokeColor(@ColorInt int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        public ShapeBuilder leftTopCorner(int leftTopCorner) {
            this.leftTopCorner = leftTopCorner;
            return this;
        }

        public ShapeBuilder rightTopCorner(int rightTopCorner) {
            this.rightTopCorner = rightTopCorner;
            return this;
        }

        public ShapeBuilder leftBottomCorner(int leftBottomCorner) {
            this.leftBottomCorner = leftBottomCorner;
            return this;
        }

        public ShapeBuilder rightBottomCorner(int rightBottomCorner) {
            this.rightBottomCorner = rightBottomCorner;
            return this;
        }

        public ShapeBuilder strokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        public Shape build() {
            return new Shape(this);
        }

    }

}
