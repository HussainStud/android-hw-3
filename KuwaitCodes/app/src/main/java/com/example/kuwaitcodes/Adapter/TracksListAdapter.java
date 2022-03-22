package com.example.kuwaitcodes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kuwaitcodes.Model.Tracks;
import com.example.kuwaitcodes.R;

import org.w3c.dom.Text;

import java.net.ProtocolFamily;
import java.util.ArrayList;
import java.util.List;

public class TracksListAdapter extends ArrayAdapter<Tracks> {
    List<Tracks> trackList;
    public TracksListAdapter(@NonNull Context context, int resource, @NonNull List<Tracks> objects) {
        super(context, resource, objects);

        this.trackList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Tracks currentTrack = trackList.get(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.track_list_item, parent, false);

        TextView trackNameTextView = convertView.findViewById(R.id.titleTextView);
        ImageView trackImageView = convertView.findViewById(R.id.referenceImageView);

        trackNameTextView.setText(currentTrack.getTrackName());
        trackImageView.setImageResource(currentTrack.getTrackImage());

        return convertView;
    }
}