package com.pustovit.contactmanager.di;

import android.app.Application;

import androidx.room.Room;

import com.pustovit.contactmanager.db.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

@Module
public class RoomModule {

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(Application application) {
        return Room.databaseBuilder(application.getApplicationContext(),
                AppDatabase.class,
                AppDatabase.DATABASE_NAME)

                .build();
    }
}
