package com.wind.simonviewdemo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * @author:zhangcong
 * @Time:2017/10/18
 * @Deacription: CicleView
 **/
public class CircleView extends View {
    private Paint paint;
    private ImageView imageView;
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GRAY);
        canvas.drawCircle(getWidth()/2,75,40,paint);


//        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imageView,"scaleX",1,2,1);
//        objectAnimator.setDuration(500);
//        objectAnimator.start();
    }
}
