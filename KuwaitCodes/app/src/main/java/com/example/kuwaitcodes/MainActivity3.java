package com.example.kuwaitcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();

        TextView trackTitleTextView = findViewById(R.id.titleTextView2);
        TextView trackDescriptionTextView = findViewById(R.id.descriptionTextView2);
        ImageView trackImageView = findViewById(R.id.referenceImageView2);

        String trackTitleString = bundle.getString("TRACKNAME");
        String trackDescriptionString = bundle.getString("TRACKDESCRIPTION");
        int trackImage = bundle.getInt("TRACKIMAGE");

        trackTitleTextView.setText(trackTitleString);
        trackDescriptionTextView.setText(trackDescriptionString);
        trackImageView.setImageResource(trackImage);

    }
}
