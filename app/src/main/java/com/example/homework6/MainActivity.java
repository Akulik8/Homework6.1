package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("test", "MainActivity onCreate");

        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test", "MainActivity onDestroy");
    }
}