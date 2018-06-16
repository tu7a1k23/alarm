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
        Log.e("Toi trong Music","Xin chao");

        String nhankey = intent.getExtras().getString("extra");
        Log.e("Music Nhan Key",nhankey);

        if(nhankey.equals("on")){
            id = 1;
        }else if(nhankey.equals("off")){
            id = 0;
        }
        if(id == 1){
            mediaPlayer = MediaPlayer.create(this,R.raw.Dung_Nhu_Thoi_Quen_JayKii_Sara_Luu);
            mediaPlayer.start();
            id = 0;
        }else if (id == 0){
            mediaPlayer.stop();
            mediaPlayer.reset();
        }

        mediaPlayer = MediaPlayer.create(this,R.raw.Dung_Nhu_Thoi_Quen_JayKii_Sara_Luu);
        mediaPlayer.start();
        return START_NOT_STICKY;
    }
}
