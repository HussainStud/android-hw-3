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

        ImageView referenceImageView = findViewById(R.id.referenceImageView2);
        TextView titleTextView = findViewById(R.id.titleTextView2);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView2);
        Button button = findViewById( R.id.button1);

        Bundle bundle = getIntent().getExtras();

        int imageResource = bundle.getInt("imageResource");
        String description = bundle.getString("description");
        String title = bundle.getString("title");

        referenceImageView.setImageResource(imageResource);
        descriptionTextView.setText(description);
        titleTextView.setText(title);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this,  "تم التسجيل" , Toast.LENGTH_SHORT).show();
            }
        });


    }
}
