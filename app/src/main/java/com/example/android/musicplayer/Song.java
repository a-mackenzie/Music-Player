package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by andrew on 01/04/2018.
 */

public class Song implements Parcelable {

    // Title of the song
    private String mSongTitle;

    // Track number of the song
    private int mSongNumber;

    // Name of Album cover for the song
    private String mSongAlbumCover;

    // Constructs the Song object
    public Song(int songNumber, String songTitle, String songAlbumCover) {
        mSongNumber = songNumber;
        mSongTitle = songTitle;
        mSongAlbumCover = songAlbumCover;
    }

    // Gets the track number of the song
    public int getSongNumber() {
        return mSongNumber;
    }

    // Gets the song title
    public String getSongTitle() {
        return mSongTitle;
    }

    // Gets the song album cover
    public String getSongAlbumCover() {
        return mSongAlbumCover;
    }

    /**
     * Constructs a Song from a Parcel
     */
    public Song (Parcel parcel) {
        this.mSongNumber = parcel.readInt();
        this.mSongTitle = parcel.readString();
        this.mSongAlbumCover = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // Required method to write to Parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mSongNumber);
        dest.writeString(mSongTitle);
        dest.writeString(mSongAlbumCover);
    }

    // Method to recreate a Song from a Parcel
    public static Creator<Song> CREATOR = new Creator<Song>() {

        @Override
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

}
