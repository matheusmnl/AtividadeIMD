package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    SystemClock.sleep(3000);
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }).start();


    }
}