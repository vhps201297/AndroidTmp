package com.example.activityexample.Intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.activityexample.R;

public class StartActivity extends AppCompatActivity {

    private String strInfo = "";
    private EditText editText;
    private static final String TAG = "Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        editText = findViewById(R.id.editText);
    }

    public void onClickSendInfo(View view) {
        Log.i(TAG, editText.getText().toString());
        strInfo = editText.getText().toString();
        Intent secondWithInfo = new Intent(this, SecondActivity.class);
        secondWithInfo.putExtra(getString(R.string.str_info_intent), strInfo.isEmpty() ? "Info vacía" : strInfo);
        startActivity(secondWithInfo);
    }

    public void onClickNoSendInfo(View view) {
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }
}
