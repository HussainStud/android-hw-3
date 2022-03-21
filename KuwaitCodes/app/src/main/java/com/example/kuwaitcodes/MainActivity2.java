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

    ArrayList<Tracks> list = new ArrayList<>();
    TracksListAdapter listAdapter = new TracksListAdapter(list, MainActivity2.this);

    ArrayList<Integer> imagesArrayList = new ArrayList<>();
    ArrayList<String> descriptionArrayList = new ArrayList<>();
    ArrayList<String> titlesArrayList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.tracksListView);


        Tracks track1 = new Tracks(getString(R.string.web), getString(R.string.webDescription), R.drawable.web);
        list.add(track1);
        Tracks track2 = new Tracks(getString(R.string.android), getString(R.string.androidDescription), R.drawable.android);
        list.add(track2);
        Tracks track3 = new Tracks(getString(R.string.iphone), getString(R.string.iphoneDescription), R.drawable.iphone);
        list.add(track3);
        listView.setAdapter(listAdapter);

        imagesArrayList.add(R.drawable.web);
        imagesArrayList.add(R.drawable.android);
        imagesArrayList.add(R.drawable.iphone);

        descriptionArrayList.add(getString(R.string.webDescription));
        descriptionArrayList.add(getString(R.string.androidDescription));
        descriptionArrayList.add(getString(R.string.iphoneDescription));

        titlesArrayList.add(getString(R.string.web));
        titlesArrayList.add(getString(R.string.android));
        titlesArrayList.add(getString(R.string.iphone));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

                intent.putExtra("imageResource", imagesArrayList.get(position));
                intent.putExtra("description", descriptionArrayList.get(position));
                intent.putExtra("title", titlesArrayList.get(position));



                startActivity(intent);
            }
        });

    }
}
