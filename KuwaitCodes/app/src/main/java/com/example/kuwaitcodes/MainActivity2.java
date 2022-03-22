package com.example.kuwaitcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.kuwaitcodes.Adapter.TracksListAdapter;
import com.example.kuwaitcodes.Model.Tracks;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Tracks> tracks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView tracksList = findViewById(R.id.tracksListView);

        Tracks androidTrack = new Tracks(getString(R.string.android), getString(R.string.androidDescription), "", R.drawable.android);
        Tracks iOSTrack = new Tracks(getString(R.string.iphone), getString(R.string.iphoneDescription), "", R.drawable.iphone);
        Tracks webTrack = new Tracks(getString(R.string.web), getString(R.string.webDescription), "", R.drawable.web);
        Tracks gameDevTrack = new Tracks(getString(R.string.android), getString(R.string.androidDescription), "", R.drawable.android);

        tracks.add(androidTrack);
        tracks.add(iOSTrack);
        tracks.add(webTrack);
        tracks.add(gameDevTrack);

        TracksListAdapter tracksListAdapter = new TracksListAdapter(this, 0, tracks);
        tracksList.setAdapter(tracksListAdapter);

        tracksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent trackDetailsPage = new Intent(MainActivity2.this, MainActivity3.class);
                Tracks currentTrack = tracks.get(position);

                trackDetailsPage.putExtra("TRACKNAME", currentTrack.getTrackName());
                trackDetailsPage.putExtra("TRACKDESCRIPTION", currentTrack.getTrackDescription());
                trackDetailsPage.putExtra("TRACKIMAGE", currentTrack.getTrackImage());
                trackDetailsPage.putExtra("TRACKURLVIDEO", currentTrack.getTrackURLVideo());

                startActivity(trackDetailsPage);
            }
        });
    }
}
