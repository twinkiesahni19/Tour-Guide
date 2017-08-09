package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris);
        ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(getString(R.string.par), R.drawable.eiffeltower, getString(R.string.par1) +
                getString(R.string.par2) +
                getString(R.string.par3) +
                getString(R.string.par4) +
                getString(R.string.par5) +
                getString(R.string.par6) +
                getString(R.string.par7) +
                getString(R.string.par8)));
        TourAdapter adapter = new TourAdapter(this, tours);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }
}
