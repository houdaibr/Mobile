package com.example.myapplication_aseds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Quatriemeactivite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatriemeactivite);
        Toast.makeText(getApplicationContext(),"Ceci est ma quatrieme activite",Toast.LENGTH_LONG).show();

    }
}