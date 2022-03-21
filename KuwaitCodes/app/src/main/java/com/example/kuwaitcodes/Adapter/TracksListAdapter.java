package com.example.kuwaitcodes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuwaitcodes.Model.Tracks;
import com.example.kuwaitcodes.R;

import java.net.ProtocolFamily;
import java.util.ArrayList;

public class TracksListAdapter extends BaseAdapter {

    ArrayList<Tracks> dataList;
    Context context;

    public TracksListAdapter(ArrayList<Tracks> list, Context context) {
        dataList = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.track_list_item, parent, false);
        ImageView imageView = rowView.findViewById(R.id.referenceImageView);
        TextView textView = rowView.findViewById(R.id.titleTextView);

        imageView.setImageResource(dataList.get(position).getImageReference());
        textView.setText(dataList.get(position).getTitle());
        return rowView;
    }
}
