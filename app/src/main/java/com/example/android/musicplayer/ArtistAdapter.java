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

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(Activity context, ArrayList<Artist> artistList) {
        super(context, 0, artistList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View artistListItemView = convertView;
        if(artistListItemView == null) {
            artistListItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_list_item, parent, false);
        }

        // Get the Artist object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the ImageView in the artist_list_item.xml for the artist image
        ImageView artistImageView = (ImageView) artistListItemView.findViewById(R.id.artistImage);
        // Get the artists image and set it to the Image View
        artistImageView.setImageDrawable(currentArtist.getArtistImage());

        // Find the TextView in the artist_list_item.xml layout with the ID artistName
        TextView artistNameTextView = (TextView) artistListItemView.findViewById(R.id.artistName);
        // Get the artists name and set this text on the artist name text view
        artistNameTextView.setText(currentArtist.getArtistName());

        // Find the TextView in the artist_list_item.xml layout with the ID numberOfAlbums
        TextView numberOfAlbumsTextView = (TextView) artistListItemView.findViewById(R.id.numberOfAlbums);
        // Get the number of albums by the artist and set this text on the text view
        numberOfAlbumsTextView.setText(currentArtist.getNumberOfAlbums() + " Albums");

        return artistListItemView;
    }

}
