package com.delmundo.delmundo_labexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class service extends IntentService {

    public service(String name) {
        super("service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Place" , "angkong");
        Log.d("Place" , "dimsum trets");
        Log.d("Place" , "chicken run");
        Log.d("Place" , "roque ruano bldg");
    }
}
