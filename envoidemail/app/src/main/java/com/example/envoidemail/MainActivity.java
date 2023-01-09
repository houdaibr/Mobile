package com.example.envoidemail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.net.Uri;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText contentInput;
    EditText emailInput;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boutonDemarrer = findViewById(R.id.sendEmail);
        contentInput = findViewById(R.id.contentInput);
        emailInput = findViewById(R.id.email) ;

        boutonDemarrer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                envoyerEmail();
            }
        });
    }
    protected void envoyerEmail() {
        Log.i("Send email", "");
        String[] TO = {emailInput.getText().toString()};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sujet du mail");
        emailIntent.putExtra(Intent.EXTRA_TEXT, contentInput.getText().toString());
        try {
            startActivity(Intent.createChooser(emailIntent, "Envoyer mail..."));
            finish();
            Log.i("Envoi du mail termine", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "Pas de client mail installe", Toast.LENGTH_SHORT).show();
        }
    }
}