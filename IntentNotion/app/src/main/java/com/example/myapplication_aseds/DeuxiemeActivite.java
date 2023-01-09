package com.example.myapplication_aseds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;



public class DeuxiemeActivite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuxieme_activite);
        Bundle extras=getIntent().getExtras();
        Toast.makeText(getApplicationContext(),"nom et prenom :"+extras.get("nom")+""+extras.get("prenom"),Toast.LENGTH_LONG).show();
    }
}