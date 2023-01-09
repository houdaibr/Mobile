package com.example.myapplication_houda_aseds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ASEDSBrodcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context,Intent intent){
        Intent serviceIntent=new Intent();
        context.startService(serviceIntent);

    }
}
