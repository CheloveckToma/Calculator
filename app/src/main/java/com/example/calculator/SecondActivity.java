package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Intent intent;
    TextView textView;
    double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intent = getIntent();
        num = intent.getDoubleExtra("sum", 0.0);
        textView = findViewById(R.id.textViewSecondActivity);
        textView.setText("Ответ: " + num);
    }
}
