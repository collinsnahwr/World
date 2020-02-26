package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);



        listview = findViewById(R.id.listview);

       final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("MUSIC");
        arrayList.add("SPORTS");
        arrayList.add("DRAMA");
        arrayList.add("ENTERTAINMENT");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int b, long id) {
                Toast.makeText(ListViewActivity.this,"checkered"+b+" " +arrayList.get(b).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
