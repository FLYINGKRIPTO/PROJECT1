package com.example.dell.project1gicsphase_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void process(View view){

            Intent intent= null;

            if(view.getId()==R.id.address1||view.getId()==R.id.address2){
                intent= new Intent( Intent.ACTION_VIEW );
                intent.setData( Uri.parse("geo:23.2258931,77.4359399"));
                startActivity(intent);

            }
    }
}
