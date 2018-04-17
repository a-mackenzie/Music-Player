package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    ArrayList<Album> chosenAlbumList = new ArrayList<Album>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageView homeButton = (ImageView) findViewById(R.id.homeButton);
        ImageView nowPlayingButton = (ImageView) findViewById(R.id.nowPlayingButton);

        // Set a click listener on Home Button
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a click listener on Now Playing Button
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Creates the list of albums for The Libertines
        ArrayList<Album> libertinesAlbumsList = new ArrayList<Album>();
        libertinesAlbumsList.add(new Album(getString(R.string.upthebracket), getString(R.string.libs), 17, getDrawable(R.drawable.up_the_bracket_cover)));
        libertinesAlbumsList.add(new Album(getString(R.string.libs), getString(R.string.libs), 17, getDrawable(R.drawable.libertines_cover)));
        libertinesAlbumsList.add(new Album(getString(R.string.anthems), getString(R.string.libs), 17, getDrawable(R.drawable.anthems_cover)));

        // Creates the list of albums for The Strokes
        ArrayList<Album> strokesAlbumsList = new ArrayList<Album>();
        strokesAlbumsList.add(new Album(getString(R.string.isthisit), getString(R.string.strokes), 11, getDrawable(R.drawable.isthisit_cover)));
        strokesAlbumsList.add(new Album(getString(R.string.roomonfire), getString(R.string.strokes), 11, getDrawable(R.drawable.roomonfire_cover)));
        strokesAlbumsList.add(new Album(getString(R.string.angles), getString(R.string.strokes), 10, getDrawable(R.drawable.angles_cover)));
        strokesAlbumsList.add(new Album(getString(R.string.comedownmachine), getString(R.string.strokes), 11, getDrawable(R.drawable.comedown_cover)));

        // Creates the list of albums for The White Stripes
        ArrayList<Album> whiteStripesAlbumsList = new ArrayList<Album>();
        whiteStripesAlbumsList.add(new Album(getString(R.string.white_stripes), getString(R.string.white_stripes), 17, getDrawable(R.drawable.white_stripes_cover)));
        whiteStripesAlbumsList.add(new Album(getString(R.string.de_stijl), getString(R.string.white_stripes), 13, getDrawable(R.drawable.de_stijl_cover)));
        whiteStripesAlbumsList.add(new Album(getString(R.string.white_blood_cells), getString(R.string.white_stripes), 16, getDrawable(R.drawable.white_blood_cells_cover)));
        whiteStripesAlbumsList.add(new Album(getString(R.string.elephant), getString(R.string.white_stripes), 14, getDrawable(R.drawable.elephant_cover)));
        whiteStripesAlbumsList.add(new Album(getString(R.string.gbms), getString(R.string.white_stripes), 13, getDrawable(R.drawable.get_behind_me_cover)));
        whiteStripesAlbumsList.add(new Album(getString(R.string.ickythump), getString(R.string.white_stripes), 13, getDrawable(R.drawable.icky_thump_cover)));

        // Pull the name of the chosen artist from the Extras bundle and set it's value to new variable
        // 'chosenArtist'
        String chosenArtist;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                chosenArtist= null;
            } else {
                chosenArtist= extras.getString("chosenArtist");
            }
        } else {
            chosenArtist = (String) savedInstanceState.getSerializable("chosenArtist");
        }

        // Set chosenAlbumList equal to the albums list for the chosen artist and create a new album
        // adapter using this
        if ((chosenArtist.equals(getString(R.string.libs)))) {
            chosenAlbumList = libertinesAlbumsList;
        } else if ((chosenArtist.equals(getString(R.string.strokes)))) {
            chosenAlbumList = strokesAlbumsList;
        } else if ((chosenArtist.equals(getString(R.string.white_stripes)))) {
            chosenAlbumList = whiteStripesAlbumsList;
        }
        final AlbumAdapter adapter = new AlbumAdapter(this, chosenAlbumList);

        // Find the GridView object in the view hierarchy of the Activity
        // There should be a GridView with the view ID called album_grid, which is declared in the
        // activity_albums.xml file.
        GridView gridView = (GridView) findViewById(R.id.album_grid);

        // Make the GridView use the AlbumAdapter created above, so that the
        // GirdView will display grid items for each Album in the list.
        gridView.setAdapter(adapter);

        // Set a click listener on the GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the artist image is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Album chosenAlbum = chosenAlbumList.get(position);
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                songsIntent.putExtra("chosenAlbum", String.valueOf(chosenAlbum.getAlbumName()));
                startActivity(songsIntent);
            }
        });
    }
}
