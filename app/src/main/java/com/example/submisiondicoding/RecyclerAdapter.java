package com.example.submisiondicoding;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.HeroViewHolder> {

    private ArrayList<model> dataList;

    public RecyclerAdapter(ArrayList<model> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_recy, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.HeroViewHolder holder, int position) {

        holder.nama.setText(dataList.get(position).getNama());
        holder.lahir.setText(dataList.get(position).getUmur());
        holder.img.setImageResource(dataList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        TextView nama,lahir;
        ImageView img;

        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tv_title);
            lahir = itemView.findViewById(R.id.tv_lahir);
            img = itemView.findViewById(R.id.img);
        }
    }
}
