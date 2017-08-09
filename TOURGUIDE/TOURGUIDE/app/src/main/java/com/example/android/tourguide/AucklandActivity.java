package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AucklandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auckland);
        ArrayList<Tour> tours=new ArrayList<>();

        tours.add(new Tour(getString(R.string.auck),R.drawable.auckland,getString(R.string.auck1) +
                getString(R.string.auck2) +
                getString(R.string.auck3) +
                getString(R.string.auck4) +
                getString(R.string.auck5) +
                getString(R.string.auck6) +
                getString(R.string.auck7) +
                getString(R.string.auck8) +
                getString(R.string.auck9) +
                getString(R.string.auck10)));
        TourAdapter adapter=new TourAdapter(this ,tours);
        ListView listView =(ListView)findViewById(R.id.LIST2);
        listView.setAdapter(adapter);
    }
}
