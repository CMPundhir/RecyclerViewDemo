package com.example.myapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Data;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Viewholder> {

    Activity context;
    List<Data> list;
    public RecyclerAdapter(Activity context, List<Data> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = context.getLayoutInflater().inflate(R.layout.recycler_design,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Data data = list.get(position);
        holder.img.setImageDrawable(context.getDrawable(data.getImg()));
        holder.pName.setText(data.getpName());
        holder.bName.setText(data.getbName());
        holder.price.setText("\u20b9 "+data.getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView pName,bName,price;
        ImageView img;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView2);
            pName = itemView.findViewById(R.id.textView6);
            bName = itemView.findViewById(R.id.textView7);
            price = itemView.findViewById(R.id.textView8);
        }
    }
}
