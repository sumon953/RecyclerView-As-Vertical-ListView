package com.shoedazzle.m.recyclerviewex2;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{

    ArrayList personNames;
    ArrayList personImages;
    Context context;

    public CustomAdapter(Context context,ArrayList personNames, ArrayList personImages) {

        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;

    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // infalte the item Layout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rawlayout,viewGroup,false);
        // set the view's size, margins, paddings and layout parameters
        CustomViewHolder CH = new CustomViewHolder(v);
        return CH;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int i) {

        customViewHolder.name.setText(""+personNames.get(i));
        customViewHolder.image.setImageResource((Integer) personImages.get(i));

        // implement setOnClickListener event on item view;
        customViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, " "+ personNames.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return personNames.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView image;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
        }
    }

}

