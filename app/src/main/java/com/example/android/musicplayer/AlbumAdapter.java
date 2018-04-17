package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrew on 05/04/2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> albumList) {
        super(context, 0, albumList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View albumGridItemView = convertView;
        if(albumGridItemView == null) {
            albumGridItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_grid_item, parent, false);
        }

        // Get the Album object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the album_gird_item.xml for the album name
        TextView albumNameTextView = (TextView) albumGridItemView.findViewById(R.id.albumName);
        // Get the albums name and set this text on the album name text view
        albumNameTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the album_gird_item.xml for the number of songs
        TextView numberOfSongsTextView = (TextView) albumGridItemView.findViewById(R.id.numberOfSongs);
        // Get the number of albums by the artist and set this text on the text view
        numberOfSongsTextView.setText(currentAlbum.getNumberOfSongs() + " Songs");

        // Find the ImageView in the album_gird_item.xml for the album cover
        ImageView albumCoverView = (ImageView) albumGridItemView.findViewById(R.id.albumCover);
        // Get the album cover image and set it to the Album Cover Image View
        albumCoverView.setImageDrawable(currentAlbum.getAlbumCover());

        return albumGridItemView;
    }

}
