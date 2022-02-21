package com.example.midterm1mohammedalalem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("You are in Activity 3");
        setContentView(R.layout.activity_main3);
        final Button backmain3 = (Button) findViewById(R.id.button2);
        final Button backact2 = (Button) findViewById(R.id.act2);
        final Button backact1 = (Button) findViewById(R.id.actmain);
        backmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }
        });
        backact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });
        backact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }
        });

    }
}