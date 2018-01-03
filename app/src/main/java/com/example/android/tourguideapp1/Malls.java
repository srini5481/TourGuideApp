package com.example.android.tourguideapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by qze713 on 1/3/18.
 */

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MallsFragment())
                .commit();

    }
}
