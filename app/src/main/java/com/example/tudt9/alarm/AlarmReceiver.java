package com.example.tudt9.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


/**
 * Created by TuDT9 on 5/18/2018.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Log.e("Toi Trong Receiver", "Xin Chao");
        String chuoi_string = intent.getExtras().getString("extra");
        Log.e("Ban Truyen Key",chuoi_string);

        Intent myIntent = new Intent(context,Music.class);
        myIntent.putExtra("extra",chuoi_string);
        context.startService(myIntent);
    }

}
