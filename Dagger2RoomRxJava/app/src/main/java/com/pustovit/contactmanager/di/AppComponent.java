package com.pustovit.contactmanager.di;

import androidx.room.RoomDatabase;

import com.pustovit.contactmanager.MainActivity;
import com.pustovit.contactmanager.di.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */
@Singleton
@Component(modules = {ApplicationModule.class, RoomModule.class})
public interface AppComponent {

    void injectMainActivity(MainActivity mainActivity);
}
