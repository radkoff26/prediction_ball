package com.example.ballofpredictions;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EnglishBall extends AppCompatActivity {

    ImageView iv;
    Eng_TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_ball);

        iv = (ImageView) findViewById(R.id.ball);
        tv = (Eng_TextView) findViewById(R.id.prediction);

        tv.generate();

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.generate();
            }
        });
    }
}