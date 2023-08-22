package com.cookandroid.crowd_space;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        if (intent != null) {
            String buttonName = intent.getStringExtra("button_name");

            if (buttonName != null) {
                String message = "You clicked the " + buttonName + " button!";
                textView.setText(message);
            }
        }
    }
}