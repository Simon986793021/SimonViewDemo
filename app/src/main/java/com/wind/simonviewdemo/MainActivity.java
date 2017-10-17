package com.wind.simonviewdemo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
*@author Simon
**/
public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Boolean isLike=false;
    private ImageView topImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.iv_like);
        topImageView= (ImageView) findViewById(R.id.iv_top);
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

        new SimonLikeView(MainActivity.this);
        imageView.setImageResource(R.drawable.likesel);
        topImageView.setVisibility(View.VISIBLE);
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imageView,"scaleY",1,2,1);
        objectAnimator.setDuration(1000);
        objectAnimator.start();
    }
}
