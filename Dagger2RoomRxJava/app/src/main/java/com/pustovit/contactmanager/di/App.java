package com.pustovit.contactmanager.di;

import android.app.Application;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

public class App extends Application {
    private static App instance;


    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        appComponent = DaggerAppComponent.builder().applicationModule(new ApplicationModule(this)).build();

    }


    public static App getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
