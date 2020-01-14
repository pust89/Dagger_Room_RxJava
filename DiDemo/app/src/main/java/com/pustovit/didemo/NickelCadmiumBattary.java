package com.pustovit.didemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

public class NickelCadmiumBattary implements Battery {
    private static final String TAG = "myTag";


    @Inject
    public NickelCadmiumBattary() {
        showType();
    }

    @Override
    public void showType() {
        Log.d(TAG, "this is Nickel Cadmium battery... ");
    }
}
