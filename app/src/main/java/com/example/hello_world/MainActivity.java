package com.example.hello_world;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListView();
            }
        });
        }
        public void openListView(){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);

        }




    public void sendMsg (View view){

        EditText msg = findViewById(R.id.name);
        Intent intent = new Intent(this,displaymsg.class);
        intent.putExtra ("MESSAGE", msg.getText().toString());
        startActivity(intent);
        msg.setText("");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.earth_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.europe:
            startActivity(new Intent(this, media.class));
            return true;
            case R.id.asia:
                Toast.makeText(this,"Asia selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.china:
                Toast.makeText(this,"China selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.india:
                Toast.makeText(this,"India selected", Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }

    }


}
