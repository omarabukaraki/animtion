package com.example.ch10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotation));
    }
}