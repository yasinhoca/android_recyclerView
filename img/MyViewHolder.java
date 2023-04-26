package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iv;
    TextView n,e;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.imageView);
        n = itemView.findViewById(R.id.name);
        e = itemView.findViewById(R.id.email);
    }
}
