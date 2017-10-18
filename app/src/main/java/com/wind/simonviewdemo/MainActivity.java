package com.wind.simonviewdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
*@author Simon
**/
public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Boolean isLike=false;
    private ImageView topImageView;
    private ImageView circleImageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.iv_like);
        topImageView= (ImageView) findViewById(R.id.iv_top);
        circleImageView= (ImageView) findViewById(R.id.iv_circle);
        textView= (TextView) findViewById(R.id.tv_like_count);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLike==false)
                {

                    startLikeAnimation();
                    isLike=true;
                }
                else {
                    startUnLikeAnimation();
                    isLike=false;
                }

            }
        });
    }

    private void startUnLikeAnimation() {
        topImageView.setVisibility(View.INVISIBLE);
        imageView.setImageResource(R.drawable.like);
    }

    private void startLikeAnimation() {

        imageView.setImageResource(R.drawable.likesel);
        topImageView.setVisibility(View.VISIBLE);
        circleImageView.setVisibility(View.VISIBLE);
        int count=Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(count+"");

        String changNum=(count+"").substring(0,1);

        /*
        手指动画
         */
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imageView,"scaleY",1,1.1f,1);
        objectAnimator.setDuration(500);
        objectAnimator.start();
        /*
        点动画
         */
        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(topImageView,"scaleX",0,1);
        ObjectAnimator objectAnimator2=ObjectAnimator.ofFloat(topImageView,"scaleY",0,1);
        objectAnimator1.setDuration(500);
        objectAnimator2.setDuration(500);
        ObjectAnimator objectAnimator3=ObjectAnimator.ofFloat(topImageView,"alpha",0,1);
        objectAnimator3.setDuration(500);

        /*
        圆动画
         */
        ObjectAnimator objectAnimator4=ObjectAnimator.ofFloat(circleImageView,"scaleX",0,1);
        ObjectAnimator objectAnimator5=ObjectAnimator.ofFloat(circleImageView,"scaleY",0,1);
        objectAnimator4.setDuration(500);
        objectAnimator5.setDuration(500);
        ObjectAnimator objectAnimator6=ObjectAnimator.ofFloat(circleImageView,"scaleX",1,0);
        ObjectAnimator objectAnimator7=ObjectAnimator.ofFloat(circleImageView,"scaleY",1,0);
        objectAnimator6.setDuration(100);
        objectAnimator7.setDuration(100);

        /*
        数字动画
         */
        ObjectAnimator objectAnimator8=ObjectAnimator.ofFloat(textView,"scaleX",0,1);
        ObjectAnimator objectAnimator9=ObjectAnimator.ofFloat(textView,"scaleY",0,1);
        objectAnimator8.setDuration(500);
        objectAnimator9.setDuration(500);


        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.play(objectAnimator1).with(objectAnimator2).with(objectAnimator3).with(objectAnimator).with(objectAnimator4)
                .with(objectAnimator5).before(objectAnimator6).before(objectAnimator7).with(objectAnimator8).with(objectAnimator9);
        animatorSet.start();






    }
}
