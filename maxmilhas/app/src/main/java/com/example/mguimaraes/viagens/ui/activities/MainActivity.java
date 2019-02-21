package com.example.mguimaraes.viagens.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mguimaraes.viagens.R;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
