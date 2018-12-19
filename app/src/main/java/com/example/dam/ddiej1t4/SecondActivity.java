package com.example.dam.ddiej1t4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private android.widget.TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.textView = (TextView) findViewById(R.id.resultView);

        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("input");
    }
}
