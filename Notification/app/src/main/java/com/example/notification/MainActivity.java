package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String NOTIFICATION_CHANNEL_ID = "10001" ;
    public final static String default_notification_channel_id = "default";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCreateNotification = findViewById(R.id.btnCreateNotification ) ;

        btnCreateNotification.setOnClickListener(v -> {

            Intent snoozeIntent = new Intent(MainActivity.this, MainActivity.class) ;
            snoozeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                    Intent.FLAG_ACTIVITY_SINGLE_TOP |
                    Intent.FLAG_ACTIVITY_NEW_TASK);
            snoozeIntent.setAction( "ACTION_SNOOZE" ) ;
            snoozeIntent.putExtra( "EXTRA_NOTIFICATION_ID" , 0 ) ;
            PendingIntent snoozePendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0 ,
                    snoozeIntent , PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE) ;

            NotificationManager mNotificationManager = (NotificationManager) getSystemService( NOTIFICATION_SERVICE ) ;
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity. this,
                    default_notification_channel_id ) ;

            mBuilder.setContentTitle( " My Notification " ) ;
            mBuilder.setContentText( "Notification  crée avec succés" ) ;
            mBuilder.setTicker( "Notification  crée avec succés" ) ;
            mBuilder.setSmallIcon(R.drawable. ic_launcher_foreground ) ;
            mBuilder.addAction(R.drawable. ic_launcher_foreground , " " , snoozePendingIntent) ;
            mBuilder.setAutoCancel( true ) ;

            if (android.os.Build.VERSION. SDK_INT >= android.os.Build.VERSION_CODES. O ) {
                int importance = NotificationManager. IMPORTANCE_HIGH ;
                NotificationChannel notificationChannel = new NotificationChannel( NOTIFICATION_CHANNEL_ID ,
                        "NOTIFICATION_CHANNEL_NAME" , importance) ;
                mBuilder.setChannelId( NOTIFICATION_CHANNEL_ID ) ;
                assert mNotificationManager != null;
                mNotificationManager.createNotificationChannel(notificationChannel) ;
            }
            assert mNotificationManager != null;
            mNotificationManager.notify(( int ) System. currentTimeMillis () , mBuilder.build()) ;
        }) ;
    }
}