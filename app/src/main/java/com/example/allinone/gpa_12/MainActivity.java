package com.example.allinone.gpa_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button calc,keep,azkary,schedule,exit,help,setting;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc=(Button)findViewById(R.id.calculate);
        keep=(Button)findViewById(R.id.keep);
        azkary=(Button)findViewById(R.id.azkary);
        schedule=(Button)findViewById(R.id.schedule);
        help=(Button)findViewById(R.id.help);
        exit=(Button)findViewById(R.id.exit);
        setting=(Button)findViewById(R.id.setting);

    }

    public void calc_gpa(View view) {
        Intent intent=new Intent(MainActivity.this,calc_gpa.class);
        startActivity(intent);
    }

    public void keep_gpa(View view) {
    }

    public void azkary(View view) {
        Intent intent=new Intent(MainActivity.this,azkary.class);
        startActivity(intent);
    }

    public void schedule(View view) {
    }

    public void setting(View view) {
    }

    public void help(View view) {
    }

    public void exit(View view) {
    }
}
