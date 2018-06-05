package com.example.dell.project1gicsphase_2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.musicgallery);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/iconmoon.ttf");
        textView.setTypeface(typeface1);


     /*   TextView textView2 = (TextView) findViewById(R.id.address1);
        textView2.setTypeface(typeface1);
        TextView textView3 = findViewById(R.id.address2);
        textView3.setTypeface(typeface1);
        TextView textView4 = (TextView) findViewById(R.id.contact);
        textView4.setTypeface(typeface1); */
    }
}
