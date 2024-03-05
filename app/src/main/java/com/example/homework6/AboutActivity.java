package com.example.homework6;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Log.d("test", "AboutActivity onCreate");

        Button closeButton = findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test", "AboutActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test", "AboutActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test", "AboutActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test", "AboutActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test", "AboutActivity onDestroy");
    }
}

