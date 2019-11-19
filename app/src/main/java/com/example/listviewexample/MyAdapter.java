package com.example.listviewexample;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Player> {
    List<Player> listOfPlayers;
    Context context;


    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        listOfPlayers = objects;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View single_item_view = convertView;
        //Using this inflated view, we can get the access to the various UI widgets present in the row item XML file.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (single_item_view == null)
            single_item_view = inflater.inflate(R.layout.single_item, null);
        TextView name=(TextView) single_item_view.findViewById(R.id.name);
        TextView age=(TextView) single_item_view.findViewById(R.id.age);
        TextView money=(TextView) single_item_view.findViewById(R.id.money);
        TextView sport=(TextView) single_item_view.findViewById(R.id.sport);
        ImageView ima=(ImageView) single_item_view.findViewById(R.id.ima);
        name.setText("name: "+listOfPlayers.get(position).name);
        age.setText("age: "+listOfPlayers.get(position).age);
        money.setText("money: "+listOfPlayers.get(position).worth);
        sport.setText("sport: "+listOfPlayers.get(position).main_sport);
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /*
    * final Intent intent = new Intent();
intent.setAction(Intent.ACTION_VIEW);
intent.setData(searchUri);
intent.setPackage("org.wikipedia");*/
            }
        });
        int i=listOfPlayers.get(position).image;
        ima.setImageResource(i);
        return  single_item_view;
    }



}
