package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ImageView homeButton = (ImageView) findViewById(R.id.homeButton);
        ImageView nowPlayingButton = (ImageView) findViewById(R.id.nowPlayingButton);

        // Set a click listener on Home Button
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a click listener on Now Playing Button
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Create the list of artists
        final ArrayList<Artist> artistList = new ArrayList<Artist>();
        artistList.add(new Artist(getString(R.string.libs), 3, getDrawable(R.drawable.libertines_image)));
        artistList.add(new Artist(getString(R.string.strokes), 4, getDrawable(R.drawable.strokes_image)));
        artistList.add(new Artist(getString(R.string.white_stripes), 6, getDrawable(R.drawable.white_stripes_image)));

        // Create an ArtistAdapter, whose data source is a list of Artists. The
        // adapter knows how to create list items for each item in the list.
        final ArtistAdapter adapter = new ArtistAdapter(this, artistList);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called artist_list, which is declared in the
        // activity_artists.xml file.
        final ListView listView = (ListView) findViewById(R.id.artist_list);

        // Make the ListView use the ArtistAdapter created above, so that the
        // ListView will display list items for each Artist in the list.
        listView.setAdapter(adapter);

        // Set a click listener on the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the artist image is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artist chosenArtist = artistList.get(position);
                Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                albumsIntent.putExtra("chosenArtist", String.valueOf(chosenArtist.getArtistName()));
                startActivity(albumsIntent);
            }
        });
    }

}
