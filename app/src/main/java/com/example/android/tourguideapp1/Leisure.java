package com.example.android.tourguideapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Leisure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LeisureFragment())
                .commit();

    }
}
