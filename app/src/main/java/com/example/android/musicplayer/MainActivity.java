package com.example.android.musicplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Disable the phone's 'back' button on the home screen
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // super.onBackPressed(); //
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView library = (ImageView) findViewById(R.id.library);
        ImageView search = (ImageView) findViewById(R.id.search);

        // Set a click listener on library View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Set a click listener on Now Playing view
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
