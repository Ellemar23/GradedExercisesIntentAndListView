package com.example.gradedexercisesintentandlistview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] AndroidVersion = {
            "Android 1.0",
            "Android 1.1",
            "CupCake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo",
            "Pie",
            "Android 10",
            "Android 11",
            "Android 12"

    };
    int[] AndroidImages = {
            R.drawable.androidimage01,
            R.drawable.androidimage02,
            R.drawable.androidimage03,
            R.drawable.androidimage04,
            R.drawable.androidimage05,
            R.drawable.androidimage06,
            R.drawable.androidimage07,
            R.drawable.androidimage08,
            R.drawable.androidimage09,
            R.drawable.androidimage10,
            R.drawable.androidimage11,
            R.drawable.androidimage12,
            R.drawable.androidimage13,
            R.drawable.androidimage14,
            R.drawable.androidimage15,
            R.drawable.androidimage16,
            R.drawable.androidimage17,
            R.drawable.androidimage18,
            R.drawable.androidimage19
    };
    String[] AndroidDescription = {
            "Android 1.0 is the very first version of..",
            "Android 1.1 had all the features that.. ",
            "CupCake  introduced numerous...",
            "Donut operate on a variety of different",
            "Eclair was its successor...",
            "Froyo operating system is the...",
            "Gingerbread in 2010, Android's first..",
            "Honeycomb is unique in that it is...",
            "Ice Cream Sandwich improves...",
            "Jelly Bean improves on the speed..",
            "Android 4.4 KitKat is an Android version..",
            "With the introduction of Android 5.0..",
            "Android 6.0 Marshmallow was",
            "Google released Android Nougat...",
            "It was also the first Android..",
            "In August of 2018, the aroma.",
            "Android environment has changed...",
            "Android 11, which was released...",
           "Android 12 is our most personal.."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

            // CityAdapter adapter = new CityAdapter(this, cityNames, cityImages);
            AndroidAdapterActivity adapter = new AndroidAdapterActivity(this, AndroidVersion, AndroidImages);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(MainActivity.this, AndroidDescriptionActivity.class);
                    intent.putExtra("AndroidVersion", AndroidVersion[position]);
                    intent.putExtra("AndroidImage", AndroidImages[position]);
                    intent.putExtra("AndroidDescription", AndroidDescription[position]);
                    startActivity(intent);
                }
            });
        }
    }
