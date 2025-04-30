package com.example.gradedexercisesintentandlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AndroidAdapterActivity extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] AndroidVersion;
    private final int[] AndroidImages;
    //    private final String[] citySubtitles;
    public AndroidAdapterActivity(Activity context, String[] AndroidVersion, int[] AndroidImages)  {
        super(context, R.layout.list_item, AndroidVersion);
        this.context = context;
        this.AndroidVersion = AndroidVersion;
        this.AndroidImages = AndroidImages;
    }

    @Override
    public  View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView titleText = rowView.findViewById(R.id.AndroidVersionText);
        ImageView imageView = rowView.findViewById(R.id.AndroidImage);

        titleText.setText(AndroidVersion[position]);
        imageView.setImageResource(AndroidImages[position]);

        return rowView;
    }

    /*public CityAdapter(Activity context, String[] cityNames, int[] cityImages, String[] citySubtitles) {
        super(context, R.layout.list_item_improved, cityNames);
        this.context = context;
        this.cityNames = cityNames;
        this.cityImages = cityImages;
        this.citySubtitles = citySubtitles;
    }*/

    /*@Override
    public  View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item_improved, parent, false);

        TextView titleText = rowView.findViewById(R.id.cityNameText);
        TextView subtitleText = rowView.findViewById(R.id.citySubtitleText);
        ImageView imageView = rowView.findViewById(R.id.cityImage);

        titleText.setText(cityNames[position]);
        subtitleText.setText(cityNames[position]);
        imageView.setImageResource(cityImages[position]);

        return rowView;
    }*/

}
