package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrew on 05/04/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songList) {
        super(context, 0, songList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View songListItemView = convertView;
        if(songListItemView == null) {
            songListItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }

        // Get the Song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the song_list_item.xml layout with the ID songNumber
        TextView songNumberTextView = (TextView) songListItemView.findViewById(R.id.songNumber);
        // Get the song number and set this text on the song number text view
        songNumberTextView.setText(String.valueOf(currentSong.getSongNumber()));

        // Find the TextView in the song_list_item.xml layout with the ID songTitle
        TextView songTitleTextView = (TextView) songListItemView.findViewById(R.id.songTitle);
        // Get the title of the song and set this text on the text view
        songTitleTextView.setText(currentSong.getSongTitle());

        return songListItemView;
    }

}
