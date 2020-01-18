package com.example.testapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String TAG_APP = "TestApp2020";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG_APP, "Esto es una información");
        Log.e(TAG_APP, "Esto es un error");
        Log.d(TAG_APP, "Esto es un Debugg");
        Log.v(TAG_APP, "Registro detallado");
        Log.w(TAG_APP, "Esto es un warning");

    }

    public void onClickSendInfo(View view) {

    }
}
