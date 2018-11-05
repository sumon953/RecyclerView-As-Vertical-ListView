package com.shoedazzle.m.recyclerviewex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList personName = new ArrayList<>(Arrays.asList("Person1","Person2","Person3","Person4","Person5","Person6","Person7","Person8","Person9","Person10"));
    ArrayList personImage = new ArrayList<>(Arrays.asList(R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6,R.drawable.im7,R.drawable.im8,R.drawable.im9,R.drawable.im10));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        recyclerView = findViewById(R.id.recyclerview);

        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        // call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdepter = new CustomAdapter(MainActivity.this,personName,personImage);
         recyclerView.setAdapter(customAdepter);

    }
}
