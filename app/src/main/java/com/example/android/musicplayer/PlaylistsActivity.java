package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tamas on 2017. 04. 30..
 */

public class PlaylistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);


            // Artists Activity
            TextView artists  = (TextView) findViewById(R.id.artists);
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ArtistsActivity}
                    Intent artistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);

                    // Start the new activity
                    startActivity(artistsIntent);
                }

            });

            // Albums  Activity
            TextView albums  = (TextView) findViewById(R.id.albums);
            albums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link AlbumsActivity}
                    Intent albumsIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);

                    // Start the new activity
                    startActivity(albumsIntent);
                }

            });
            // Music Library Activity
            TextView musicLibrary  = (TextView) findViewById(R.id.musicLibrary);
            musicLibrary.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link MusicLibraryActivity}
                    Intent musicLibraryIntent = new Intent(PlaylistsActivity.this, MusicLibraryActivity.class);

                    // Start the new activity
                    startActivity(musicLibraryIntent);
                }

            });
            // Favourites Activity
            TextView favourites  = (TextView) findViewById(R.id.favourites);
            favourites.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link FavouritesActivity}
                    Intent favouritesIntent = new Intent(PlaylistsActivity.this, FavouritesActivity.class);

                    // Start the new activity
                    startActivity(favouritesIntent);
                }

            });
        }


    }