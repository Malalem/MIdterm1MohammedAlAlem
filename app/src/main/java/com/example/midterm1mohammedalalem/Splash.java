package com.example.midterm1mohammedalalem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView counter = (TextView) findViewById(R.id.counter);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this,MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,9000);
        for (int i =0; i<10;i++){
        Double Num = Double.parseDouble(counter.getText().toString());
        counter.setText(i);
        }
    }
}
