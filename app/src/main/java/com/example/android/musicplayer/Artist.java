package com.example.android.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by andrew on 04/04/2018.
 */

public class Artist {

    // Name of the artist
    private String mArtistName;

    // Number of albums by that artist
    private int mNumberofAlbums;

    // Image of the artist
    private Drawable mArtistImage;

    // Constructs the Artist object
    public Artist(String artistName, int numberOfAlbums, Drawable artistImage) {
        mArtistName = artistName;
        mNumberofAlbums = numberOfAlbums;
        mArtistImage = artistImage;
    }

    // Gets the artists name
    public String getArtistName() {
        return mArtistName;
    }

    // Gets the number of albums by the artist
    public int getNumberOfAlbums() {
        return mNumberofAlbums;
    }

    // Gets the image of the artist
    public Drawable getArtistImage() {
        return mArtistImage;
    }

}
