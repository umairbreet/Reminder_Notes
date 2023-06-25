package com.example.remindernotes;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class Splashscreen extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        lottieAnimationView = findViewById(R.id.lottieAnimation);
        ValueAnimator animator = ValueAnimator.ofFloat(0f,1f);
        animator.addUpdateListener(animation -> {
            lottieAnimationView.setProgress((Float) animation.getAnimatedValue());
        });
        animator.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },1500);


    }
}