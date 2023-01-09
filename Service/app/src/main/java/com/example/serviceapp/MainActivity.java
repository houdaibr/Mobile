package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "service est cre", Toast.LENGTH_SHORT).show();
    }
    // Start the service
    public void demarrerService(View view) {
        startService(new Intent(this, IntentService.class));
        Toast.makeText(this, "service est demarre", Toast.LENGTH_SHORT).show();
    }
    // Stop the service
    public void arreterService(View view) {
        stopService(new Intent(this, UnService.class));
        Toast.makeText(this, "service est arrete", Toast.LENGTH_SHORT).show();
    }
}
