package com.example.tugaspertemuan5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PemainAdapter extends RecyclerView.Adapter<ViewHolder> {
    List<PemainModel> listPemain;
    Context context;

    public PemainAdapter(List<PemainModel> listData, Context context) {
        this.listPemain = listData;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pemain,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.myTextView1.setText(listPemain.get(position).getName());
        holder.myTextView2.setText(listPemain.get(position).getTag());
        holder.myImageView.setImageResource(listPemain.get(position).getImage());
        holder.myTextView1.setOnClickListener(v-> {
            Intent description = new Intent(context,DetailPemain.class);
            description.putExtra("name" , listPemain.get(position).getName());
            description.putExtra("tag" , listPemain.get(position).getTag());
            description.putExtra("description" , listPemain.get(position).getDescription());
            description.putExtra("image",listPemain.get(position).getImage());
            context.startActivity(description);
        });
    }

    @Override
    public int getItemCount() {
        return listPemain.size();
    }
}
