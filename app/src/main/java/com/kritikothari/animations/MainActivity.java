package com.kritikothari.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView doraemon = (ImageView)findViewById(R.id.doraemon);
        doraemon.animate().scaleXBy(0.5f).scaleYBy(-0.5f).setDuration(2000);
        //ImageView nobita = (ImageView)findViewById(R.id.nobita);
        //nobita.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView doraemon = (ImageView)findViewById(R.id.doraemon);
//        doraemon.setTranslationX(-1000f);
    }
}
