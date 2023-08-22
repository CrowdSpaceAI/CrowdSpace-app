package com.cookandroid.crowd_space;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.crowd_space.CrossroadActivity;
import com.cookandroid.crowd_space.MenyaActivity;
import com.cookandroid.crowd_space.PhoandActivity;
import com.cookandroid.crowd_space.R;
import com.cookandroid.crowd_space.SulbingActivity;
import com.cookandroid.crowd_space.ThreeWayRoadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton sulbingButton = findViewById(R.id.sulbing);
        ImageButton crossroadButton = findViewById(R.id.crossroad);
        ImageButton threeWayRoadButton = findViewById(R.id.three_way_road);
        ImageButton menyaButton = findViewById(R.id.menya);
        ImageButton phoandButton = findViewById(R.id.phoand);

        // 각 버튼 클릭 리스너 설정
        sulbingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity("sulbing");
            }
        });

        crossroadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity("crossroad");
            }
        });

        threeWayRoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity("three_way_road");
            }
        });

        menyaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity("menya");
            }
        });

        phoandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity("phoand");
            }
        });
    }

    private void openNextActivity(String buttonName) {
        Class<?> destinationActivity;

        switch (buttonName) {
            case "sulbing":
                destinationActivity = SulbingActivity.class; // 여기에 실제 각 버튼마다 이동할 Activity 클래스를 지정해야 합니다.
                break;
            case "crossroad":
                destinationActivity = CrossroadActivity.class;
                break;
            case "three_way_road":
                destinationActivity = ThreeWayRoadActivity.class;
                break;
            case "menya":
                destinationActivity = MenyaActivity.class;
                break;
            case "phoand":
                destinationActivity = PhoandActivity.class;
                break;
            default:
                return;
        }

        Intent intent = new Intent(MainActivity.this, destinationActivity);
        startActivity(intent);
    }
}
