package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        textView = findViewById(R.id.splash);


        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                    Intent ss =  new Intent(getBaseContext(),MainActivity.class);
                    startActivity(ss);
                    finish();
                } catch (Exception e){

                }
            }
        };
        background.start();
    }
}
