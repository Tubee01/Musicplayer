package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tamas on 2017. 04. 30..
 */

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


            // Artists Activity
            TextView artists  = (TextView) findViewById(R.id.artists);
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ArtistsActivity}
                    Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);

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
                    Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);

                    // Start the new activity
                    startActivity(playlistsIntent);
                }

            });

            // Music Library Activity
            TextView musicLibrary  = (TextView) findViewById(R.id.musicLibrary);
            musicLibrary.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link MusicLibraryActivity}
                    Intent musicLibraryIntent = new Intent(AlbumsActivity.this, MusicLibraryActivity.class);

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
                    Intent favouritesIntent = new Intent(AlbumsActivity.this, FavouritesActivity.class);

                    // Start the new activity
                    startActivity(favouritesIntent);
                }

            });
        }


    }

