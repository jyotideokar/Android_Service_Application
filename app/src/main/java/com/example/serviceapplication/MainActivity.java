package com.example.serviceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button startButton,stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stopButton = findViewById(R.id.stopButton);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == startButton){
            startService(new Intent(this,ServiceComponent.class));
        }
        else if (view==stopButton){
            stopService(new Intent(this,ServiceComponent.class));
        }

    }
}