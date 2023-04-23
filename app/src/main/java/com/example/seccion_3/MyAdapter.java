package com.example.seccion_3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
  private List<String> name;
  private int layout;
  private OnItemClickListener;

  @NonNull
  @androidx.annotation.NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull @androidx.annotation.NonNull ViewHolder viewHolder, int i) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    public TextView name;

    public ViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
      super(itemView);
      this.name = (TextView) itemView.findViewById(R.id.textViewName);
    }
  }

  public interface OnItemClickListener{
    void onItemClick(String name, int position);
  }
}
