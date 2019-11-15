package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo reference listview
        //  Todo       ListView listView = findViewById();
        ListView ListView = findViewById(R.id.listview);
        // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);
        MyAdapter arrayAdapter = new MyAdapter(this,R.layout.custom_item, myImageNameList);
        ListView.setAdapter(arrayAdapter);


    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting

}
