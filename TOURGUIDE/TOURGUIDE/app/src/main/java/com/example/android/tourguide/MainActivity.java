package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button paris = (Button) findViewById(R.id.paris);
        paris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paris1 = new Intent(MainActivity.this, ParisActivity.class);
                startActivity(paris1);
            }
        });

        Button auckland = (Button) findViewById(R.id.auckland);
        auckland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent auckland1 = new Intent(MainActivity.this, AucklandActivity.class);
                startActivity(auckland1);

            }
        });
        Button india = (Button) findViewById(R.id.india);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent india1 = new Intent(MainActivity.this, IndiaActivity.class);
                startActivity(india1);
            }
        });
        Button bulgaria = (Button) findViewById(R.id.bulgaria);
        bulgaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bulgaria1 = new Intent(MainActivity.this, BulgariaActivity.class);
                startActivity(bulgaria1);
            }
        });
        Button egypt = (Button) findViewById(R.id.egypt);
        egypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent egypt1 = new Intent(MainActivity.this, EgyptActivity.class);
                startActivity(egypt1);
            }
        });
    }

}
