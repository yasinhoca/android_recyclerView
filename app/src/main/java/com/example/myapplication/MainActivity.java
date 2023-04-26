package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.recyclerViewer);

        List<Item> items = new ArrayList<Item>();

        items.add(new Item("ali","a@a.com", R.drawable.a));
        items.add(new Item("betül","a@a.com",R.drawable.b));
        items.add(new Item("cihan","a@a.com",R.drawable.c));
        items.add(new Item("deniz","a@a.com",R.drawable.d));
        items.add(new Item("ali","a@a.com", R.drawable.a));
        items.add(new Item("betül","a@a.com",R.drawable.b));
        items.add(new Item("cihan","a@a.com",R.drawable.c));
        items.add(new Item("deniz","a@a.com",R.drawable.d));
        items.add(new Item("ali","a@a.com", R.drawable.a));
        items.add(new Item("betül","a@a.com",R.drawable.b));
        items.add(new Item("cihan","a@a.com",R.drawable.c));
        items.add(new Item("deniz","a@a.com",R.drawable.d));

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MyAdaptor(getApplicationContext(),items));

    }
}