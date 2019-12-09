package com.example.dependentlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DependentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependent);
    }
}
