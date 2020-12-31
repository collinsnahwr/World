package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class displaymsg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymsg);


        Intent intent = getIntent();
        String message = intent.getStringExtra("MESSAGE");
        TextView messageView =	(TextView)findViewById(R.id.message);
        messageView.setText(message);


    }


    public void onClose(View view) {super.finish();}
}
