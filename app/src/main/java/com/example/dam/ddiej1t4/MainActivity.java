package com.example.dam.ddiej1t4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private android.widget.EditText editText;
    private android.widget.Button changeText;
    private android.widget.Button switchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.switchActivity = (Button) findViewById(R.id.switchActivity);
        this.changeText = (Button) findViewById(R.id.changeText);
        this.editText = (EditText) findViewById(R.id.inputField);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.changeText:
                editText.setText("La la la");
                break;
            case R.id.switchActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("input", editText.getText().toString());
                startActivity(intent);
                break;
        }
    }

}
