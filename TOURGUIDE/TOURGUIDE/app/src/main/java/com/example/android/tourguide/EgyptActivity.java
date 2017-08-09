package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EgyptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egypt);
        ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(getString(R.string.egy), R.drawable.spix, getString(R.string.egy1) +
                getString(R.string.egy2) +
                getString(R.string.egy3) +
                getString(R.string.egy4) +
                getString(R.string.egy5) +
                getString(R.string.egy6) +
                getString(R.string.egy7) +
                getString(R.string.egy8) +
                getString(R.string.egy9)));
        TourAdapter adapter = new TourAdapter(this, tours);
        ListView listView = (ListView) findViewById(R.id.list4);
        listView.setAdapter(adapter);
    }
}
