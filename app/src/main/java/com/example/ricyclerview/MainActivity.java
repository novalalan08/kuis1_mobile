package com.example.ricyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Misnari", "Ayah", getDrawable(R.drawable.ayah)));
        keluargaArrayList.add(new Keluarga("Lilik Muslika", "Mama", getDrawable(R.drawable.mama)));
        keluargaArrayList.add(new Keluarga("Satya Bayu Utama", "Kakak1", getDrawable(R.drawable.bayu)));
        keluargaArrayList.add(new Keluarga("Okky Bhaskoro Setiawan", "Kakak2", getDrawable(R.drawable.okky)));
        keluargaArrayList.add(new Keluarga("Noval Alan Pambudi", "Adik", getDrawable(R.drawable.noval)));
    }
}
