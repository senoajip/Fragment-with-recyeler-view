package com.example.tugaspertemuan5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView myTextView1 , myTextView2;
    ImageView myImageView;
    ViewHolder(View itemView){
        super(itemView);
        myTextView1 = itemView.findViewById(R.id.name);
        myTextView2 = itemView.findViewById(R.id.tag);
        myImageView = itemView.findViewById(R.id.ilustration);
    }
}
