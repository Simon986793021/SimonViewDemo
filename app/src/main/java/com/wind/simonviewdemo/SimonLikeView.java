package com.wind.simonviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @Author:zhangcong
 * @Time:2017/10/17
 * @Description:This is SimonLikeView
 */
public class SimonLikeView extends View {
    public SimonLikeView(Context context) {
        super(context);
    }

    public SimonLikeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SimonLikeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
