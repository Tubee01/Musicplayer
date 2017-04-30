package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tamas on 2017. 04. 30..
 */

public class FavouritesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);


            // Artists Activity
            TextView artists  = (TextView) findViewById(R.id.artists);
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ArtistsActivity}
                    Intent artistsIntent = new Intent(FavouritesActivity.this, ArtistsActivity.class);

                    // Start the new activity
                    startActivity(artistsIntent);
                }

            });

            // Playlists Activity
            TextView playlists  = (TextView) findViewById(R.id.playlists);
            playlists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link PlaylistsActivity}
                    Intent playlistsIntent = new Intent(FavouritesActivity.this, PlaylistsActivity.class);

                    // Start the new activity
                    startActivity(playlistsIntent);
                }

            });
            // Albums  Activity
            TextView albums  = (TextView) findViewById(R.id.albums);
            albums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link AlbumsActivity}
                    Intent albumsIntent = new Intent(FavouritesActivity.this, AlbumsActivity.class);

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
                    Intent musicLibraryIntent = new Intent(FavouritesActivity.this, MusicLibraryActivity.class);

                    // Start the new activity
                    startActivity(musicLibraryIntent);
                }

            });

        }


    }
