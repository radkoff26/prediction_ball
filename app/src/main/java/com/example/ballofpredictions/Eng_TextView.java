package com.example.ballofpredictions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class Eng_TextView extends TextView {

    private String[] predictions = {
            "You will got lucky today!",
            "Pleasant moments are waiting for you!",
            "You will have an opportunity to be happy today!",
            "What's about to drink some coffee with interesting person!",
            "Be careful! Today is not the best day to hurry!"
    };

    public Eng_TextView(Context context) {
        super(context);
    }

    public Eng_TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Eng_TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Eng_TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void generate() {
        int random = (int) (Math.random() * predictions.length);
        this.setText(predictions[random]);
    }
}
