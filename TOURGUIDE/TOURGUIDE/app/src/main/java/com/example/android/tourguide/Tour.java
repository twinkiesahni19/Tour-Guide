package com.example.android.tourguide;

import android.location.Location;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by Twinkle Sahni on 21-Apr-17.
 */

public class Tour {
    private String mLocation;
    private int mImage;
    private String mDesc;

    public Tour(String Location, int Image, String Description) {
        mLocation = Location;
        mImage = Image;
        mDesc = Description;
    }

    public Tour(String Location, String Description) {
        mLocation = Location;
        mDesc = Description;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getImage() {
        return mImage;
    }

    public String getDesc() {
        return mDesc;
    }

}
