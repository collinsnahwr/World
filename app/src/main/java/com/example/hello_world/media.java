package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;

public class media extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.chaka);
        mediaPlayer.start();
    }
}
