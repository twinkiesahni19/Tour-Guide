package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IndiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(getString(R.string.ind), R.drawable.akshardhamm, getString(R.string.ind1) +
                getString(R.string.ind2) +
                getString(R.string.ind3) +
                getString(R.string.ind4) +
                getString(R.string.ind5) +
                getString(R.string.ind6) +
                getString(R.string.ind7) +
                getString(R.string.ind8)));
        TourAdapter adapter = new TourAdapter(this, tours);
        ListView listView = (ListView) findViewById(R.id.list5);
        listView.setAdapter(adapter);
    }
}
