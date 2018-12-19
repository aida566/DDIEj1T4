package com.example.dam.ddiej1t4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private android.widget.Button pressmebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.pressmebutton = (Button) findViewById(R.id.press_me_button);

        //Robolectric.buildActivity(HomeActivity.class).create().get();
    }
}
