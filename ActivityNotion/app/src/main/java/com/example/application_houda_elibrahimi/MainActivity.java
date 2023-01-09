package com.example.application_houda_elibrahimi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertDialog = new AlertDialog.Builder(this)
                .create();
       /* Toast.makeText(this, "Activite est cree", Toast.LENGTH_SHORT).show();
        Log.i("OnCreate():", "fAtivite est cree");*/

        showAlertDialog("Activite est cree");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        /*Toast.makeText(this, "Activite est redemarree", Toast.LENGTH_SHORT).show();
        Log.i("OnRestart():", "Ativite est redemaree");*/
        showAlertDialog("Activite est redemarree");
    }
    @Override
    protected void onResume() {
        super.onResume();
        /*Toast.makeText(this, "Activite est reprise", Toast.LENGTH_SHORT).show();
        Log.i("OnResume():", "Ativite est reprise");*/

        showAlertDialog("Activite est reprise");
    }

    @Override
    protected void onPause() {
        super.onPause();
        /*Toast.makeText(this, "Activite est en pause", Toast.LENGTH_SHORT).show();
        Log.i("onPause():", "Ativite est en pause");*/

        showAlertDialog("Activite est en pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        /*Toast.makeText(this, "Activite est stoppee", Toast.LENGTH_SHORT).show();
        Log.i("onStop():", "Ativite est stoppee");*/
        showAlertDialog("Activite est stoppee");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /*Toast.makeText(this, "Activite est detruite", Toast.LENGTH_SHORT).show();
        Log.i("onDestroy():", "Ativite est detruite");*/
        showAlertDialog("Activite est detruite");

    }


    void showAlertDialog(String message){
        alertDialog.setTitle(message);
        alertDialog.show();
    }
}