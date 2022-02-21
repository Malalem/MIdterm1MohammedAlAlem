package com.example.midterm1mohammedalalem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp1;
    ImageView img;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You are in Activity 1");
        img = (ImageView) findViewById(R.id.imageView2);
        img.setOnClickListener(music1);
        mp1 = new MediaPlayer();
        mp1 = MediaPlayer.create(this, R.raw.track2);
        final Button toAct2 = (Button) findViewById(R.id.toAct2);
        final Button toAct3 = (Button) findViewById(R.id.toAct3);

        toAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        toAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });


    }
    ImageView.OnClickListener music1 = new ImageView.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (playing) {
                case 0:
                    mp1.start();
                    playing = 1;
                    //b1.setText("Pause song");
                    //b1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mp1.pause();
                    playing = 0;
                    //b1.setText("Play Song");
                    //b1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}