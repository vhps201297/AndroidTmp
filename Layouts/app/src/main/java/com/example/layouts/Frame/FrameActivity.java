package com.example.layouts.Frame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.layouts.R;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        BlankFragment fragment = new BlankFragment("");
    }
}
