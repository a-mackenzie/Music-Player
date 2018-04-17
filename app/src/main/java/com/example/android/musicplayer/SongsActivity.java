package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    ArrayList<Song> chosenSongList = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ImageView homeButton = (ImageView) findViewById(R.id.homeButton);
        final ImageView nowPlayingButton = (ImageView) findViewById(R.id.nowPlayingButton);

        // Set a click listener on Home Button
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a click listener on Now Playing Button
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Create the list of songs for The Libertines - Up the Bracket
        ArrayList<Song> upTheBracketSongList = new ArrayList<Song>();
        upTheBracketSongList.add(new Song(1, getString(R.string.l_upb_01), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(2, getString(R.string.l_upb_02), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(3, getString(R.string.l_upb_03), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(4, getString(R.string.l_upb_04), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(5, getString(R.string.l_upb_05), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(6, getString(R.string.l_upb_06), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(7, getString(R.string.l_upb_07), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(8, getString(R.string.l_upb_08), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(9, getString(R.string.l_upb_09), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(10, getString(R.string.l_upb_10), "up_the_bracket_cover"));
        upTheBracketSongList.add(new Song(11, getString(R.string.l_upb_11), "up_the_bracket_cover"));
        

        // Create the list of songs for The Libertines - The Libertines
        ArrayList<Song> theLibertinesSongList = new ArrayList<Song>();
        theLibertinesSongList.add(new Song(1, getString(R.string.l_l_01), "libertines_cover"));
        theLibertinesSongList.add(new Song(2, getString(R.string.l_l_02), "libertines_cover"));
        theLibertinesSongList.add(new Song(3, getString(R.string.l_l_03), "libertines_cover"));
        theLibertinesSongList.add(new Song(4, getString(R.string.l_l_04), "libertines_cover"));
        theLibertinesSongList.add(new Song(5, getString(R.string.l_l_05), "libertines_cover"));
        theLibertinesSongList.add(new Song(6, getString(R.string.l_l_06), "libertines_cover"));
        theLibertinesSongList.add(new Song(7, getString(R.string.l_l_07), "libertines_cover"));
        theLibertinesSongList.add(new Song(8, getString(R.string.l_l_08),  "libertines_cover"));
        theLibertinesSongList.add(new Song(9, getString(R.string.l_l_09), "libertines_cover"));
        theLibertinesSongList.add(new Song(10, getString(R.string.l_l_10), "libertines_cover"));
        theLibertinesSongList.add(new Song(11, getString(R.string.l_l_11), "libertines_cover"));
        theLibertinesSongList.add(new Song(12, getString(R.string.l_l_12), "libertines_cover"));
        theLibertinesSongList.add(new Song(13, getString(R.string.l_l_13), "libertines_cover"));
        theLibertinesSongList.add(new Song(14, getString(R.string.l_l_14), "libertines_cover"));

        // Create the list of song for The Libertines - Anthems for Doomed Youth
        ArrayList<Song> anthemsSongList = new ArrayList<Song>();
        anthemsSongList.add(new Song(1, getString(R.string.l_afdy_01), "anthems_cover"));
        anthemsSongList.add(new Song(2, getString(R.string.l_afdy_02), "anthems_cover"));
        anthemsSongList.add(new Song(3, getString(R.string.l_afdy_03), "anthems_cover"));
        anthemsSongList.add(new Song(4, getString(R.string.l_afdy_04), "anthems_cover"));
        anthemsSongList.add(new Song(5, getString(R.string.l_afdy_05), "anthems_cover"));
        anthemsSongList.add(new Song(6, getString(R.string.l_afdy_06), "anthems_cover"));
        anthemsSongList.add(new Song(7, getString(R.string.l_afdy_07), "anthems_cover"));
        anthemsSongList.add(new Song(8, getString(R.string.l_afdy_08), "anthems_cover"));
        anthemsSongList.add(new Song(9, getString(R.string.l_afdy_09), "anthems_cover"));
        anthemsSongList.add(new Song(10, getString(R.string.l_afdy_10), "anthems_cover"));
        anthemsSongList.add(new Song(11, getString(R.string.l_afdy_11), "anthems_cover"));
        anthemsSongList.add(new Song(12, getString(R.string.l_afdy_12), "anthems_cover"));

        // Create the list of songs for The Strokes - Is This It
        ArrayList<Song> isThisItSongList = new ArrayList<Song>();
        isThisItSongList.add(new Song(1, getString(R.string.s_iti_01), "isthisit_cover"));
        isThisItSongList.add(new Song(2, getString(R.string.s_iti_02), "isthisit_cover"));
        isThisItSongList.add(new Song(3, getString(R.string.s_iti_03), "isthisit_cover"));
        isThisItSongList.add(new Song(4, getString(R.string.s_iti_04), "isthisit_cover"));
        isThisItSongList.add(new Song(5, getString(R.string.s_iti_05), "isthisit_cover"));
        isThisItSongList.add(new Song(6, getString(R.string.s_iti_06), "isthisit_cover"));
        isThisItSongList.add(new Song(7, getString(R.string.s_iti_07), "isthisit_cover"));
        isThisItSongList.add(new Song(8, getString(R.string.s_iti_08), "isthisit_cover"));
        isThisItSongList.add(new Song(9, getString(R.string.s_iti_09), "isthisit_cover"));
        isThisItSongList.add(new Song(10, getString(R.string.s_iti_10), "isthisit_cover"));

        // Create the list of songs for The Strokes - Room on Fire
        ArrayList<Song> roomOnFireSongList = new ArrayList<Song>();
        roomOnFireSongList.add(new Song(1, getString(R.string.s_rof_01), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(2, getString(R.string.s_rof_02), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(3, getString(R.string.s_rof_03), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(4, getString(R.string.s_rof_04), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(5, getString(R.string.s_rof_05), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(6, getString(R.string.s_rof_06), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(7, getString(R.string.s_rof_07), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(8, getString(R.string.s_rof_08), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(9, getString(R.string.s_rof_09), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(10, getString(R.string.s_rof_10), "roomonfire_cover"));
        roomOnFireSongList.add(new Song(11, getString(R.string.s_rof_11), "roomonfire_cover"));

        // Create the list of songs for The Strokes - Angles
        ArrayList<Song> anglesSongList = new ArrayList<Song>();
        anglesSongList.add(new Song(1, getString(R.string.s_a_01), "angles_cover"));
        anglesSongList.add(new Song(2, getString(R.string.s_a_02), "angles_cover"));
        anglesSongList.add(new Song(3, getString(R.string.s_a_03), "angles_cover"));
        anglesSongList.add(new Song(4, getString(R.string.s_a_04), "angles_cover"));
        anglesSongList.add(new Song(5, getString(R.string.s_a_05), "angles_cover"));
        anglesSongList.add(new Song(6, getString(R.string.s_a_06), "angles_cover"));
        anglesSongList.add(new Song(7, getString(R.string.s_a_07), "angles_cover"));
        anglesSongList.add(new Song(8, getString(R.string.s_a_08), "angles_cover"));
        anglesSongList.add(new Song(9, getString(R.string.s_a_09), "angles_cover"));
        anglesSongList.add(new Song(10, getString(R.string.s_a_10), "angles_cover"));

        // Create the list of songs for The Strokes - Comedown Machine
        ArrayList<Song> comedownMachineSongList = new ArrayList<Song>();
        comedownMachineSongList.add(new Song(1, getString(R.string.s_cm_01), "comedown_cover"));
        comedownMachineSongList.add(new Song(2, getString(R.string.s_cm_02), "comedown_cover"));
        comedownMachineSongList.add(new Song(3, getString(R.string.s_cm_03), "comedown_cover"));
        comedownMachineSongList.add(new Song(4, getString(R.string.s_cm_04), "comedown_cover"));
        comedownMachineSongList.add(new Song(5, getString(R.string.s_cm_05), "comedown_cover"));
        comedownMachineSongList.add(new Song(6, getString(R.string.s_cm_06), "comedown_cover"));
        comedownMachineSongList.add(new Song(7, getString(R.string.s_cm_07), "comedown_cover"));
        comedownMachineSongList.add(new Song(8, getString(R.string.s_cm_08), "comedown_cover"));
        comedownMachineSongList.add(new Song(9, getString(R.string.s_cm_09), "comedown_cover"));
        comedownMachineSongList.add(new Song(10, getString(R.string.s_cm_10), "comedown_cover"));
        comedownMachineSongList.add(new Song(11, getString(R.string.s_cm_11), "comedown_cover"));

        // Create the list of songs for The White Stripes - The White Stripes
        ArrayList<Song> whiteStripesSongList = new ArrayList<Song>();
        whiteStripesSongList.add(new Song(1, getString(R.string.ws_ws_01), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(2, getString(R.string.ws_ws_02), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(3, getString(R.string.ws_ws_03), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(4, getString(R.string.ws_ws_04), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(5, getString(R.string.ws_ws_05), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(6, getString(R.string.ws_ws_06), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(7, getString(R.string.ws_ws_07), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(8, getString(R.string.ws_ws_08), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(9, getString(R.string.ws_ws_09), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(10, getString(R.string.ws_ws_10), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(11, getString(R.string.ws_ws_11), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(12, getString(R.string.ws_ws_12), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(13, getString(R.string.ws_ws_13), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(14, getString(R.string.ws_ws_14), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(15, getString(R.string.ws_ws_15), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(16, getString(R.string.ws_ws_16), "white_stripes_cover"));
        whiteStripesSongList.add(new Song(17, getString(R.string.ws_ws_17), "white_stripes_cover"));

        // Create the list of songs for The White Stripes - De Stijl
        ArrayList<Song> deStijlSongList = new ArrayList<Song>();
        deStijlSongList.add(new Song(1, getString(R.string.ws_ds_01), "de_stijl_cover"));
        deStijlSongList.add(new Song(2, getString(R.string.ws_ds_02), "de_stijl_cover"));
        deStijlSongList.add(new Song(3, getString(R.string.ws_ds_03), "de_stijl_cover"));
        deStijlSongList.add(new Song(4, getString(R.string.ws_ds_04), "de_stijl_cover"));
        deStijlSongList.add(new Song(5, getString(R.string.ws_ds_05), "de_stijl_cover"));
        deStijlSongList.add(new Song(6, getString(R.string.ws_ds_06), "de_stijl_cover"));
        deStijlSongList.add(new Song(7, getString(R.string.ws_ds_07), "de_stijl_cover"));
        deStijlSongList.add(new Song(8, getString(R.string.ws_ds_08), "de_stijl_cover"));
        deStijlSongList.add(new Song(9, getString(R.string.ws_ds_09), "de_stijl_cover"));
        deStijlSongList.add(new Song(10, getString(R.string.ws_ds_10), "de_stijl_cover"));
        deStijlSongList.add(new Song(11, getString(R.string.ws_ds_11), "de_stijl_cover"));
        deStijlSongList.add(new Song(12, getString(R.string.ws_ds_12), "de_stijl_cover"));
        deStijlSongList.add(new Song(13, getString(R.string.ws_ds_13), "de_stijl_cover"));

        // Create the list of songs for The White Stripes - White Blood Cells
        ArrayList<Song> whiteBloodCellsSongList = new ArrayList<Song>();
        whiteBloodCellsSongList.add(new Song(1, getString(R.string.ws_wbc_01), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(2, getString(R.string.ws_wbc_02), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(3, getString(R.string.ws_wbc_03), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(4, getString(R.string.ws_wbc_04), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(5, getString(R.string.ws_wbc_05), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(6, getString(R.string.ws_wbc_06), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(7, getString(R.string.ws_wbc_07), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(8, getString(R.string.ws_wbc_08), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(9, getString(R.string.ws_wbc_09), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(10, getString(R.string.ws_wbc_10), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(11, getString(R.string.ws_wbc_11), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(12, getString(R.string.ws_wbc_12), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(13, getString(R.string.ws_wbc_13), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(14, getString(R.string.ws_wbc_14), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(15, getString(R.string.ws_wbc_15), "white_blood_cells_cover"));
        whiteBloodCellsSongList.add(new Song(16, getString(R.string.ws_wbc_16), "white_blood_cells_cover"));

        // Create the list of songs for The White Stripes - Elephant
        ArrayList<Song> elephantSongList = new ArrayList<Song>();
        elephantSongList.add(new Song(1, getString(R.string.ws_e_01), "elephant_cover"));
        elephantSongList.add(new Song(2, getString(R.string.ws_e_02), "elephant_cover"));
        elephantSongList.add(new Song(3, getString(R.string.ws_e_03), "elephant_cover"));
        elephantSongList.add(new Song(4, getString(R.string.ws_e_04), "elephant_cover"));
        elephantSongList.add(new Song(5, getString(R.string.ws_e_05), "elephant_cover"));
        elephantSongList.add(new Song(6, getString(R.string.ws_e_06), "elephant_cover"));
        elephantSongList.add(new Song(7, getString(R.string.ws_e_07), "elephant_cover"));
        elephantSongList.add(new Song(8, getString(R.string.ws_e_08), "elephant_cover"));
        elephantSongList.add(new Song(9, getString(R.string.ws_e_09), "elephant_cover"));
        elephantSongList.add(new Song(10, getString(R.string.ws_e_10), "elephant_cover"));
        elephantSongList.add(new Song(11, getString(R.string.ws_e_11), "elephant_cover"));
        elephantSongList.add(new Song(12, getString(R.string.ws_e_12), "elephant_cover"));
        elephantSongList.add(new Song(13, getString(R.string.ws_e_13), "elephant_cover"));
        elephantSongList.add(new Song(14, getString(R.string.ws_e_14), "elephant_cover"));

        // Create the list of songs for The White Stripes - Get Behind Me Satan
        ArrayList<Song> getBehindMeSongList = new ArrayList<Song>();
        getBehindMeSongList.add(new Song(1, getString(R.string.ws_gbms_01), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(2, getString(R.string.ws_gbms_02), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(3, getString(R.string.ws_gbms_03), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(4, getString(R.string.ws_gbms_04), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(5, getString(R.string.ws_gbms_05), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(6, getString(R.string.ws_gbms_06), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(7, getString(R.string.ws_gbms_07), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(8, getString(R.string.ws_gbms_08), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(9, getString(R.string.ws_gbms_09), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(10, getString(R.string.ws_gbms_10), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(11, getString(R.string.ws_gbms_11), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(12, getString(R.string.ws_gbms_12), "get_behind_me_cover"));
        getBehindMeSongList.add(new Song(13, getString(R.string.ws_gbms_13), "get_behind_me_cover"));

        // Create the list of songs for The White Stripes - Icky Thump
        ArrayList<Song> ickyThumpSongList = new ArrayList<Song>();
        ickyThumpSongList.add(new Song(1, getString(R.string.ws_it_01), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(2, getString(R.string.ws_it_02), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(3, getString(R.string.ws_it_03), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(4, getString(R.string.ws_it_04), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(5, getString(R.string.ws_it_05), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(6, getString(R.string.ws_it_06), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(7, getString(R.string.ws_it_07), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(8, getString(R.string.ws_it_08), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(9, getString(R.string.ws_it_09), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(10, getString(R.string.ws_it_10), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(11, getString(R.string.ws_it_11), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(12, getString(R.string.ws_it_12), "icky_thump_cover"));
        ickyThumpSongList.add(new Song(13, getString(R.string.ws_it_13), "icky_thump_cover"));

        // Pull the name of the chosen album from the Extras bundle and set it's value to new variable
        // 'chosenAlbum'
        final String chosenAlbum;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                chosenAlbum= null;
            } else {
                chosenAlbum= extras.getString("chosenAlbum");
            }
        } else {
            chosenAlbum = (String) savedInstanceState.getSerializable("chosenAlbum");
        }

        // Set chosenSongList equal to the song list for the chosen album and create a new song
        // adapter using this
        if ((chosenAlbum.equals(getString(R.string.upthebracket)))) {
            chosenSongList = upTheBracketSongList;
        } else if ((chosenAlbum.equals(getString(R.string.libs)))) {
            chosenSongList = theLibertinesSongList;
        } else if ((chosenAlbum.equals(getString(R.string.anthems)))) {
            chosenSongList = anthemsSongList;
        } else if ((chosenAlbum.equals(getString(R.string.isthisit)))) {
            chosenSongList = isThisItSongList;
        } else if ((chosenAlbum.equals(getString(R.string.roomonfire)))) {
            chosenSongList = roomOnFireSongList;
        } else if ((chosenAlbum.equals(getString(R.string.angles)))) {
            chosenSongList = anglesSongList;
        } else if ((chosenAlbum.equals(getString(R.string.comedownmachine)))) {
            chosenSongList = comedownMachineSongList;
        } else if ((chosenAlbum.equals(getString(R.string.white_stripes)))) {
            chosenSongList = whiteStripesSongList;
        } else if ((chosenAlbum.equals(getString(R.string.de_stijl)))) {
            chosenSongList = deStijlSongList;
        } else if ((chosenAlbum.equals(getString(R.string.white_blood_cells)))) {
            chosenSongList = whiteBloodCellsSongList;
        } else if ((chosenAlbum.equals(getString(R.string.elephant)))) {
            chosenSongList = elephantSongList;
        } else if ((chosenAlbum.equals(getString(R.string.gbms)))) {
            chosenSongList = getBehindMeSongList;
        } else if ((chosenAlbum.equals(getString(R.string.ickythump)))) {
            chosenSongList = ickyThumpSongList;
        }

        final SongAdapter adapter = new SongAdapter(this, chosenSongList);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called song_list, which is declared in the
        // activity_songs.xml file.
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the ListView use the Song Adapter created above, so that the
        // ListView will display list items for each Song in the list.
        listView.setAdapter(adapter);

        // Set a click listener on the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the Song name is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song chosenSong = chosenSongList.get(position);
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("chosenSongPosition", position);
                nowPlayingIntent.putParcelableArrayListExtra("chosenSongList", chosenSongList);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
