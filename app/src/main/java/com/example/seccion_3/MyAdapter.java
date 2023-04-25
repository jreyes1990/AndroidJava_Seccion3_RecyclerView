package com.example.seccion_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
  private List<String> names;
  private int layout;
  private OnItemClickListener itemClickListener;

  public MyAdapter(List<String> names, int layout, OnItemClickListener itemClickListener) {
    this.names = names;
    this.layout = layout;
    this.itemClickListener = itemClickListener;
  }

  @androidx.annotation.NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
    ViewHolder vh = new ViewHolder(v);

    return vh;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(names.get(position), itemClickListener);
  }

  @Override
  public int getItemCount() {
    return names.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textViewName;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
    }

    public void bind(final String names, final OnItemClickListener listener){
      this.textViewName.setText(names);

      itemView.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
          listener.onItemClick(names, getAdapterPosition());
        }
      });
    }
  }

  public interface OnItemClickListener{
    void onItemClick(String name, int position);
  }
}
