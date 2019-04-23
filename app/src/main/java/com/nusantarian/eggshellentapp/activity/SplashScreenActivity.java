package com.nusantarian.eggshellentapp.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nusantarian.eggshellentapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
    @Override
    protected void onResume(){
        super.onResume();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoMain();
            }
        }, 1000);
    }
    private void gotoMain(){
        startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
        finish();
    }
}