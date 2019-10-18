package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;

    Intent intent;

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.numberOne);
        num2 = findViewById(R.id.numberTwo);

        btn = findViewById(R.id.sum);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, SecondActivity.class);

        switch (v.getId()) {
            case R.id.sum:
                intent.putExtra("sum", sum(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString())));
                startActivity(intent);
                break;
        }
    }

    public double sum(double x, double y) {
        return x + y;
    }
}
