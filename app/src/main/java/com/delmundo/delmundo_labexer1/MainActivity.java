package com.delmundo.delmundo_labexer1;

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
    public void displayButton(View view){
        Intent intent = new Intent( this, Main2Activity.class);
        startActivity(intent);
    }

    public void displays(View view){
            super.onResume();
            Intent i = new Intent(this, services.class);
            startService(i);
    }
}
