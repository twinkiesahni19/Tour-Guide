package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by Twinkle Sahni on 21-Apr-17.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View tourView = convertView;
        if (tourView == null) {
            tourView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        Tour currentTour = getItem(position);
        TextView locate = (TextView) tourView.findViewById(R.id.location);
        locate.setText(currentTour.getLocation());
        ImageView imagee = (ImageView) tourView.findViewById(R.id.image);
        imagee.setImageResource(currentTour.getImage());
        TextView descrptn = (TextView) tourView.findViewById(R.id.desc);
        descrptn.setText(currentTour.getDesc());
        return tourView;
    }
}
