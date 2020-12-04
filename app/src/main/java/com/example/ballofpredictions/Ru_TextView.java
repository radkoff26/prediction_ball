package com.example.ballofpredictions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class Ru_TextView extends TextView {

    private String[] predictions = {
            "Сегодня вы обретёте новые знакомства!",
            "Будьте осторожны! Опасности ждут вас за каждым углом!",
            "Сегодня вас ждёт замечательный день!",
            "Будьте терепеливыми, в конце дня вас ждёт сюрприз!",
            "За окном зима, наслаждайтесь погодой, ведь сегодня вас ждёт много приятных моментов!"
    };

    public Ru_TextView(Context context) {
        super(context);
    }

    public Ru_TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Ru_TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Ru_TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void generate() {
        int random = (int) (Math.random() * predictions.length);
        this.setText(predictions[random]);
    }
}
