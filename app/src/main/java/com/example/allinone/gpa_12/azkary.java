package com.example.allinone.gpa_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class azkary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkary);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] item = getResources().getStringArray(R.array.index);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_azkary, R.id.textView, item);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(azkary.this,webhtml.class);
                intent.putExtra("page",i);
                startActivity(intent);
            }
        });
    }
    }

