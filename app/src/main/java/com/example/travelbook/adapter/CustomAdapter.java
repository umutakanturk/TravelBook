package com.example.travelbook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.travelbook.R;
import com.example.travelbook.model.Place;

import java.util.ArrayList;

import static com.example.travelbook.R.*;

public class CustomAdapter extends ArrayAdapter<Place> {

    ArrayList<Place> placeList;
    Context context;

    public CustomAdapter(@NonNull Context context, ArrayList<Place> placeList) {
        super(context, layout.custom_list_row,placeList);
        this.placeList = placeList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View customView = layoutInflater.inflate(R.layout.custom_list_row,parent,false);
        TextView nameTextView = customView.findViewById(id.nameTextView);
        nameTextView.setText(placeList.get(position).name);

        return customView;
    }
}
