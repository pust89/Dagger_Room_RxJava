package com.pustovit.didemo;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */
@Singleton
public class SmartPhone {

    private Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "myTag";
    private String time;

    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss");
        time = sdf.format(Calendar.getInstance().getTime());

    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");
        Log.d(TAG, " created time is "+time);
    }
}
