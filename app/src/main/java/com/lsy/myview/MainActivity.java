package com.lsy.myview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lsy.viewlib.weight.likeview.LikeImageView;
import com.lsy.viewlib.weight.likeview.LikeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LikeView ztv = findViewById(R.id.zanTextview);
    }
}
