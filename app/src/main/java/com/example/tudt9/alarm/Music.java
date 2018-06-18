package com.example.tudt9.alarm;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by TuDT9 on 5/18/2018.
 */

public class Music extends Service {
    MediaPlayer mediaPlayer;
    int id;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String nhankey = intent.getExtras().getString("extra");

        if(nhankey.equals("on")){
            id = 1;
        }else if(nhankey.equals("off")){
            id = 0;
        }

        if(id == 1){
            mediaPlayer = MediaPlayer.create(this,R.raw.xylophone);
            mediaPlayer.start();
            id = 0;
        }else if (id == 0){
            mediaPlayer.stop();
            mediaPlayer.reset();
        }

        return START_NOT_STICKY;
    }
}
