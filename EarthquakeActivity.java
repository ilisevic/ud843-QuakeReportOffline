/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Eartquake> earthquakes = new ArrayList<Eartquake>();
        earthquakes.add( new Eartquake("San Francisco","1.1.2018", 0));
        earthquakes.add(new Eartquake("London","1.1.2018",1));
        earthquakes.add(new Eartquake("Tokyo","1.1.2018",2));
        earthquakes.add(new Eartquake("Mexico City","1.1.2018",3));
        earthquakes.add(new Eartquake("Moscow","1.1.2018",0));
        earthquakes.add(new Eartquake("Rio de Janeiro","1.1.2018",0));
        earthquakes.add(new Eartquake("Paris","1.1.2018",1));

        // Find a reference to the {@link ListView} in the layout


        // Create a new {@link ArrayAdapter} of earthquakes
        EartquakeListAdapter eartquakeListAdapter = new EartquakeListAdapter(this,  earthquakes);


        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(eartquakeListAdapter);
    }
}
