package com.example.seccion_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private List<String> names;
  private RecyclerView mRecyclerView;
  private RecyclerView.Adapter mAdapter;
  private RecyclerView.LayoutManager mLayoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    names = this.getAllNames();

    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    mLayoutManager = new LinearLayoutManager(this);
    mAdapter = new MyAdapter(names, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener() {
      @Override
      public void onItemClick(String name, int position) {
        Toast.makeText(MainActivity.this, name+" - "+position, Toast.LENGTH_SHORT).show();
      }
    });

    mRecyclerView.setLayoutManager(mLayoutManager);
    mRecyclerView.setAdapter(mAdapter);
  }

  private List<String> getAllNames(){
    return new ArrayList<String>(){
      {
        add("Alejandro");
        add("Jose");
        add("Barrera");
        add("Ruben");
        add("Antonio");
      }
    };
  }
}