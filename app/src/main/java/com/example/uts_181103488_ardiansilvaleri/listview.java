package com.example.uts_181103488_ardiansilvaleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView list = (ListView)  findViewById(R.id.listView);
        String[] makul = {"Bisnis Proses Manajemen", "Tata Kelola TI","Pemograman Mobile", "Pemograman Lanjutan", "Pemograman Berorientasi Objek", "Enterprise Arsitektur", "Metodologi Penelitian", "Customer Relatioship Management", "Manajemen Lanjutan", "Manajemen Sistem Informasi Korporat", "Algoritma dan Pemograman"};
        ArrayAdapter <String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, makul);
        list.setAdapter(myAdapter);
    }
}