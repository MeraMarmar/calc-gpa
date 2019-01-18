package com.example.allinone.gpa_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.droidsonroids.gif.GifDrawable;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
       // GifDrawable gifFromPath = new GifDrawable( "/path/gif.gif" );
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(8000);
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
    }

