package com.example.android.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by andrew on 05/04/2018.
 */

public class Album {

    // Name of the album
    private String mAlbumName;

    // Artist of the album.
    private String mAlbumArtist;

    // Number of songs on the album
    private int mNumberOfSongs;

    // Album cover art
    private Drawable mAlbumCover;

    // Constructs the Album object
    public Album(String albumName, String albumArtist, int numberOfSongs, Drawable albumCover) {
        mAlbumName = albumName;
        mAlbumArtist = albumArtist;
        mNumberOfSongs = numberOfSongs;
        mAlbumCover = albumCover;
    }

    // Gets the name of the album
    public String getAlbumName() {
        return mAlbumName;
    }

    // Gets the artist of the album
    public String getAlbumArtist() {
        return mAlbumArtist;
    }

    // Gets the number of Songs on the album
    public int getNumberOfSongs() {
        return mNumberOfSongs;
    }

    // Gets the album cover art
    public Drawable getAlbumCover() {
        return mAlbumCover;
    }
}
