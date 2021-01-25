package com.example.lesson4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    public List<Print> list;
    public Context context;

    public MainAdapter(List<Print> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_item,parent,false);
        return new MainViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Print t=list.get(position);
        holder.textView.setText(t.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtView);
        }
    }
}
