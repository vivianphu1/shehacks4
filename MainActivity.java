package com.example.ontime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

// Financial literacy project - extension to WesternU app
// After figuring out what program the individual is in, an approximation of how much each class costs will be programed
// 20 minutes before class starts, a notification will pop up reminding the individual of an upcoming class
// Using their location, the app will determine whether or not class was skipped
// If class is skipped, another notification will pop up, telling the individual how much money they wasted by not attending their lecture
// With this reminder, the individual will hopefully be more motivated to go to class, now that they are aware of how much each class costs
public class MainActivity extends AppCompatActivity {


    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        System.out.println(getResources().getStringArray(R.array.names));

    }




}


