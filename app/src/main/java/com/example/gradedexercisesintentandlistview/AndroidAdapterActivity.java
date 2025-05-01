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
    private final String[] androidVersions;
    private final String[] androidDescriptions;
    private final int[] androidImages;

    public AndroidAdapterActivity(Activity context, String[] androidVersions, int[] androidImages, String[] androidDescriptions) {
        super(context, R.layout.list_improve_item, androidVersions);
        this.context = context;
        this.androidVersions = androidVersions;
        this.androidImages = androidImages;
        this.androidDescriptions = androidDescriptions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_improve_item, parent, false);

        TextView versionTextView = rowView.findViewById(R.id.VersionTextView);
        TextView descriptionTextView = rowView.findViewById(R.id.DescriptionTextView);
        ImageView imageView = rowView.findViewById(R.id.AndroidImage);

        versionTextView.setText(androidVersions[position]);
        descriptionTextView.setText(androidDescriptions[position]);
        imageView.setImageResource(androidImages[position]);

        return rowView;
    }
}
