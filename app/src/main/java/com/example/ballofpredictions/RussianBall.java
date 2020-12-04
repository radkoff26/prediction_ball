package com.example.ballofpredictions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RussianBall extends AppCompatActivity {

    ImageView iv;
    Ru_TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russian_ball);

        iv = (ImageView) findViewById(R.id.ball);
        tv = (Ru_TextView) findViewById(R.id.prediction);

        tv.generate();

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.generate();
            }
        });
    }
}