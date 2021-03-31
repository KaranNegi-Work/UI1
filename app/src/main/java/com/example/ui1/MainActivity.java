package com.example.ui1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ui1.Adapters.Recycler1Adapter;
import com.example.ui1.Adapters.Recycler2Adapter;
import com.example.ui1.models.NamenImage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview1;
    RecyclerView recyclerview2;
    String[] name = {"Rohan", "Arun", "Saloni", "Muskan", "Mohit", "Sahil"};
    int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview1 = findViewById(R.id.recyclerview1);
        recyclerview2 = findViewById(R.id.recyclerview2);
        recyclerview1.setAdapter(new Recycler1Adapter(name, images));
        recyclerview2.setAdapter(new Recycler2Adapter(name,images));

    }
}