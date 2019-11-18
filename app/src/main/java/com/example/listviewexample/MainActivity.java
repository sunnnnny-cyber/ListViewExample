package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    List<Player> listPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo reference listview
        //  Todo       ListView listView = findViewById();
        ListView ListView = findViewById(R.id.listview);
        // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
      //  listPlayers = new ArrayList<Player>();
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);
        getPlayers();
        MyAdapter arrayAdapter = new MyAdapter(this,R.layout.single_item,listPlayers);
        ListView.setAdapter(arrayAdapter);


    }
    public void getPlayers() {
        listPlayers = new ArrayList<>();
        listPlayers.add(new Player("Usain St Leo Bolt",33,90000000,"Track and Field",(ImageView) findViewById(R.id.)));
        listPlayers.add(new Player());
        listPlayers.add(new Player());
        listPlayers.add(new Player());
        listPlayers.add(new Player());
        listPlayers.add(new Player());
        listPlayers.add(new Player());
        listPlayers.add(new Player());
    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting

}
