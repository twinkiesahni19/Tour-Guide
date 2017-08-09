package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BulgariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulgaria);
        ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(getString(R.string.bulg), R.drawable.alender, getString(R.string.bulg1) +
                getString(R.string.bulg2) +
                getString(R.string.bulg3) +
                getString(R.string.bulg4) +
                getString(R.string.bulg5) +
                getString(R.string.bulg6) +
                getString(R.string.bulg7) +
                getString(R.string.bulg8) +
                getString(R.string.bulg9)));
        TourAdapter adapter = new TourAdapter(this, tours);
        ListView listView = (ListView) findViewById(R.id.List3);
        listView.setAdapter(adapter);
    }
}
