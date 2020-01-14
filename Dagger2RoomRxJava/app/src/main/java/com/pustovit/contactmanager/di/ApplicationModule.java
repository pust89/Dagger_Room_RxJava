package com.pustovit.contactmanager.di;

import android.app.Application;
import android.content.Context;

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
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Application providesApplication(){
        return application;
    }

}
