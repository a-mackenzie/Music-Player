package com.example.android.musicplayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    int currentSongPosition;
    Song currentSong;

    public static Bundle extras;
    public static ArrayList<Song> currentSongList = new ArrayList<Song>() ;
    public static SharedPreferences sharedPreferences;

    ImageView albumCover;
    TextView songName;
    ImageView previousButton;
    ImageView nextButton;
    ImageView homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        albumCover = (ImageView) findViewById(R.id.albumCover);
        songName = (TextView) findViewById(R.id.songName);
        previousButton = (ImageView) findViewById(R.id.previousButton);
        nextButton = (ImageView) findViewById(R.id.nextButton);
        homeButton = (ImageView) findViewById(R.id.homeButton);
        final ImageView playPauseButton = (ImageView) findViewById(R.id.playPauseButton);
        if (getIntent().getExtras() != null) {
            extras = getIntent().getExtras();
            currentSongList = getIntent().getParcelableArrayListExtra("chosenSongList");
        }

        // Pull the current Song from the 'extras' bundle or the shared preferences and set the song name and album cover art
        if (sharedPreferences == null) {
            if (extras == null) {
                Toast toast = Toast.makeText(this, "Please Select Music First", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            } else {
                currentSongPosition = extras.getInt("chosenSongPosition");
                currentSong = currentSongList.get(currentSongPosition);
                songName.setText(String.valueOf(getResources().getString(R.string.songNameDisplay, currentSong.getSongNumber(), currentSong.getSongTitle())));
                albumCover.setImageResource(getResources().getIdentifier(currentSong.getSongAlbumCover(),"drawable","com.example.android.musicplayer"));
            }
        } else {
            LoadPreferences();
            currentSong = currentSongList.get(currentSongPosition);
            songName.setText(String.valueOf(getResources().getString(R.string.songNameDisplay, currentSong.getSongNumber(), currentSong.getSongTitle())));
            albumCover.setImageResource(getResources().getIdentifier(currentSong.getSongAlbumCover(),"drawable","com.example.android.musicplayer"));
        }

        // Set a click listener on Home Button
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a click listener on Play/Pause Button
        playPauseButton.setTag(1);
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                if (playPauseButton.getTag().equals(1)) {
                    playPauseButton.setImageResource(R.drawable.icon_play);
                    playPauseButton.setTag(2);
                } else if (playPauseButton.getTag().equals(2)) {
                    playPauseButton.setImageResource(R.drawable.icon_pause);
                    playPauseButton.setTag(1);
                }
            }
        });

        // Set a click listener on Next Button
        nextButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                if (currentSongPosition < (currentSongList.size() - 1)) {
                    currentSongPosition += 1;
                    currentSong = currentSongList.get(currentSongPosition);
                    songName.setText(String.valueOf(getResources().getString(R.string.songNameDisplay, currentSong.getSongNumber(), currentSong.getSongTitle())));
                    albumCover.setImageResource(getResources().getIdentifier(currentSong.getSongAlbumCover(),"drawable","com.example.android.musicplayer"));
                }
            }
        });

        // Set a click listener on Previous Button
        previousButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home button is clicked on.
            @Override
            public void onClick(View view) {
                if (currentSongPosition > 0) {
                    currentSongPosition -= 1;
                    currentSong = currentSongList.get(currentSongPosition);
                    songName.setText(String.valueOf(getResources().getString(R.string.songNameDisplay, currentSong.getSongNumber(), currentSong.getSongTitle())));
                    albumCover.setImageResource(getResources().getIdentifier(currentSong.getSongAlbumCover(),"drawable","com.example.android.musicplayer"));
                }
            }
        });
    }

    // Save the current song position
    private void SavePreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("currentSongPosition", currentSongPosition);
        editor.apply();
    }

    // Load the current song position
    private void LoadPreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        currentSongPosition = sharedPreferences.getInt("currentSongPosition", currentSongPosition);
    }

    // Save the current song position when exiting the activity
    @Override
    public void onBackPressed() {
        SavePreferences();
        super.onBackPressed();
    }

}
