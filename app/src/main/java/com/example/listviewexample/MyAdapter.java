package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Player> {
    List<Player> listOfPlayers;


    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        listOfPlayers = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View single_item_view = convertView;
        //Using this inflated view, we can get the access to the various UI widgets present in the row item XML file.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (single_item_view == null)
            single_item_view = inflater.inflate(R.layout.single_item, null);
        //Todo get single player using position and listOfPlayers
        // get references to views in single_item.xml , for example
        // TextView name = single_item_view.findViewById(R.id.name);
        return  single_item_view;
    }
}
