package com.example.mylibrary;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

public class CardViewExample extends CardView {

    public CardViewExample(@NonNull Context context) {
        super(context);
        Log.e(context.getString(R.string.app_name), "Se agregó custom cardview");
    }
}
