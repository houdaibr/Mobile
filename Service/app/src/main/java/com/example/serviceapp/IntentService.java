package com.example.serviceapp;

import android.content.Intent;
import android.util.Log;

public class IntentService extends android.app.IntentService {
    public IntentService() {
        super("UnIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("UnIntentService", "Intent recu");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("UnIntentService", "Creation de l'intent service");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("UNIntentService", "Destruction de l'intent service");
    }
}