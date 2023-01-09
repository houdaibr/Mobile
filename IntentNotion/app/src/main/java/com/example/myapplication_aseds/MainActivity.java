package com.example.myapplication_aseds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button button_explicite,button_implicite,mon_button_implicite,textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_explicite=(Button)findViewById(R.id.button);

        button_implicite=(Button) findViewById(R.id.button2);
        mon_button_implicite=(Button) findViewById(R.id.button3);

        button_explicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),DeuxiemeActivite.class);
                intent.putExtra("nom","benmaissa");
                intent.putExtra("prenom","yann");
                startActivity(intent);

            }
        });
        button_implicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.inpt.ac.ma"));
                startActivity(intent);

            }
        });
        mon_button_implicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:098764355"));


                startActivity(intent);

            }
        });

    }
}