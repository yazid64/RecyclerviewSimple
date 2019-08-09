package com.example.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<model> itemList = new ArrayList<>();
    private RecyclerView recyclerview;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = (RecyclerView) findViewById(R.id.recycler);
        mAdapter = new RecyclerAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(mLayoutManger);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter);

prepareItem();
    }

    private void prepareItem() {
//        model item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
//        item = new model(R.drawable.two, "", "");
//        itemList.add(item);
        mAdapter.notifyDataSetChanged();
        recyclerview.setAdapter(mAdapter);
    }
}