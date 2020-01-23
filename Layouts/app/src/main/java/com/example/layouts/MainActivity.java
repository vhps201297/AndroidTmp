package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.layouts.Frame.FrameActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * To LinearLayout
     */
    public void onClickLinear(View view) {
        startActivity( new Intent(this, LinearActivity.class));
    }

    /**
     * To FrameLayout (Fragment)
     */
    public void onClickRelative(View view) {
        startActivity(new Intent(this, RelativeActivity.class));
    }

    /**
     * To ScrollingLayout
     */
    public void onClickScroll(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }

    /**
     * To NavigationDrawer
     */
    public void onClckNavigation(View view) {
        startActivity( new Intent(this, NavigationDrawerActivity.class));
    }

    /**
     * To GridLayout
     */
    public void onClickGrid(View view) {
        startActivity(new Intent(this, GridActivity.class));
    }

    /**
     * To TabBarLayout
     */
    public void onClickTabBar(View view) {
        startActivity(new Intent(this, TabBarActivity.class));
    }
}
