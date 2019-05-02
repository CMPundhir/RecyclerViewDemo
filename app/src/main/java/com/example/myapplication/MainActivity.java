package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapter.RecyclerAdapter;
import com.example.myapplication.model.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    double[] prices = {1,2,3,4,5,6,7};
    String[] pNames = {"eye liner","mousse","lakme lipstic","huda beauty lipstic","lakme primer","blue heaven kajal","fair and lovely"};
    String[] bNames = {"Lakme`","Blue Heaven","Lotus","Mavley","Fair and lovely","Huda beauty","L18"};
    int[] imgs = {R.drawable.eyeliner,R.drawable.mouss,R.drawable.lakme_lipstick,R.drawable.huda,R.drawable.primer,R.drawable.blue_kajal,R.drawable.eyes};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this,getDataList());
        recyclerView.setAdapter(adapter);
    }

    public List<Data> getDataList(){
        List<Data> list = new ArrayList<>();
        for(int i=0;i<pNames.length && i<bNames.length && i<imgs.length;i++){
            Data data = new Data();
            data.setpName(pNames[i]);
            data.setbName(bNames[i]);
            data.setImg(imgs[i]);
            data.setPrice(prices[i]);
            list.add(data);
        }
        return list;
    }
}
