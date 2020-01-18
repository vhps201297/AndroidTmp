package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLinear(View view) {
        startActivity( new Intent(this, LinearActivity.class));
    }

    public void onClickRelative(View view) {

    }

    public void onClickScroll(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }

    public void onClckNavigation(View view) {
        startActivity( new Intent(this, NavigationDrawerActivity.class));
    }

    public void onClickGrid(View view) {
        startActivity(new Intent(this, GridActivity.class));
    }

    public void onClickTabBar(View view) {
        startActivity(new Intent(this, TabBarActivity.class));
    }
}
