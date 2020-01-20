package com.example.activityexample.Intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.activityexample.R;

public class SecondActivity extends AppCompatActivity {
    private String info = "";
    private TextView txtInfo;
    private static final String TAG = "Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtInfo = findViewById(R.id.textView);
        info = getIntent().getStringExtra(getString(R.string.str_info_intent));


    }

    @Override
    protected void onStart() {
        super.onStart();
        if(info == null)
            Log.e(TAG, "info nula");
        else
            txtInfo.setText(info);

    }
}
