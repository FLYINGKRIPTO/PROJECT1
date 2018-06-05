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
        TextView textView =  findViewById(R.id.musicgallery);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/iconmoon.ttf");
        textView.setTypeface(typeface1);


        TextView textView2 = findViewById(R.id.address1);
        textView2.setTypeface(typeface1);
        TextView textView3 = findViewById(R.id.address2);
        textView3.setTypeface(typeface1);
        TextView textView4 = findViewById(R.id.contact);
        textView4.setTypeface(typeface1);
        TextView textView5 = findViewById(R.id.guitar);
        textView5.setTypeface(typeface1);
        TextView textView6 = findViewById(R.id.harmonium);
        textView6.setTypeface(typeface1);
        TextView textView7 = findViewById(R.id.tabla);
        textView7.setTypeface(typeface1);
        TextView textView8 = findViewById(R.id.flute);
        textView8.setTypeface(typeface1);
        TextView textView9 = findViewById(R.id.keyboard);
        textView9.setTypeface(typeface1);
        TextView textView10 = findViewById(R.id.drums);
        textView10.setTypeface(typeface1);
    }
}
