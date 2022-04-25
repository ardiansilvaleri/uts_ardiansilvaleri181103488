package com.example.uts_181103488_ardiansilvaleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void register(View view) {
        Intent intent = new Intent(register.this,MainActivity2.class);
        startActivity(intent);
    }
}