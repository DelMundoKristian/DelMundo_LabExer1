package com.delmundo.delmundo_labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void displayp1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zomato.com/manila/angkong-dimsum-house-sampaloc-manila"));
        startActivity(intent);
    }
    public void displayp2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zomato.com/manila/dimsum-treats-sampaloc-manila"));
        startActivity(intent);
    }
    public void displayp3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zomato.com/manila/the-chicken-run-sampaloc-manila"));
        startActivity(intent);
    }
    public void displayp4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/search?q=roque%20ruano&oq=roque+ruano+&aqs=chrome..69i57.3000j0j4&sourceid=chrome&ie=UTF-8&npsic=0&rflfq=1&rlha=0&rllag=14609711,120990941,121&tbm=lcl&rldimm=4963490016190310136&ved=2ahUKEwib5_7c08_kAhUFaI8KHctDBRQQvS4wAHoECAsQEg&rldoc=1&tbs=lrf:!2m1!1e2!3sIAE,lf:1,lf_ui:2#rlfi=hd:;si:4963490016190310136;mv:!1m2!1d14.609933799999999!2d120.9921823!2m2!1d14.609489400000001!2d120.9897009;tbs:lrf:!2m1!1e2!3sIAE,lf:1,lf_ui:2"));
        startActivity(intent);
    }
    public void displayB(View view){
        Intent intent = new Intent( this, Main2Activity.class);
        startActivity(intent);
    }
}
