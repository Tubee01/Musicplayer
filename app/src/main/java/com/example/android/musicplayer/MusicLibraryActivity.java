package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tamas on 2017. 04. 30..
 */

public class MusicLibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclibrary);

        // Artists Activity
            TextView artists  = (TextView) findViewById(R.id.artists);
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ArtistsActivity}
                    Intent artistsIntent = new Intent(MusicLibraryActivity.this, ArtistsActivity.class);

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
                    Intent playlistsIntent = new Intent(MusicLibraryActivity.this, PlaylistsActivity.class);

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
                    Intent albumsIntent = new Intent(MusicLibraryActivity.this, AlbumsActivity.class);

                    // Start the new activity
                    startActivity(albumsIntent);
                }

            });

            // Favourites Activity
            TextView favourites  = (TextView) findViewById(R.id.favourites);
            favourites.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link FavouritesActivity}
                    Intent favouritesIntent = new Intent(MusicLibraryActivity.this, FavouritesActivity.class);

                    // Start the new activity
                    startActivity(favouritesIntent);
                }

            });
        }


    }
