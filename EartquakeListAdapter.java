package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EartquakeListAdapter extends ArrayAdapter {


    public EartquakeListAdapter(Activity context, ArrayList<Eartquake> eartquakes) {
        super(context, 0, eartquakes);
    }

//definisanje  GETVIEW metode i punjenje Layouta
    public View getView (int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake,parent,false);





        }


Eartquake  e =  (Eartquake) getItem(position);
        TextView tv_magnitude =  (TextView)listItemView.findViewById(R.id.tv_magnitude);
        TextView tv_date = (TextView)listItemView.findViewById(R.id.tv_date);
        TextView tv_location = (TextView)listItemView.findViewById(R.id.tv_location);

        tv_magnitude.setText(" " +  e.getMagnitude());
        tv_date.setText(e.getDate());
        tv_location.setText(e.getLocation());

        return listItemView;


    }
}
