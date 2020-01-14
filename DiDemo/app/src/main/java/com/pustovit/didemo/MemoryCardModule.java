package com.pustovit.didemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

@Module
public class MemoryCardModule {
    private int memorySize;

    private static final String TAG = "myTag";

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    @Provides
    public MemoryCard provideMemoryCard(){
        Log.d(TAG, "size of the memory card = "+memorySize);
        return new MemoryCard();
    }
}
