package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();


        Button btnFragmentBlack = findViewById(R.id.btnFragmentBlack);
        btnFragmentBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, BlackFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("black")
                        .commit();

            }
        });

        Button btnFragmentBlue = findViewById(R.id.btnFragmentBlue);
        btnFragmentBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, BlueFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("blue")
                        .commit();

            }
        });

        Button btnFragmentGreen = findViewById(R.id.btnFragmentGreen);
        btnFragmentGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, GreenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("green")
                        .commit();

            }
        });

        Button btnFragmentRed = findViewById(R.id.btnFragmentRed);
        btnFragmentRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, RedFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("red")
                        .commit();

            }
        });

        Button btnFragmentYellow = findViewById(R.id.btnFragmentYellow);
        btnFragmentYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, YellowFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("yellow")
                        .commit();

            }
        });

    }
}