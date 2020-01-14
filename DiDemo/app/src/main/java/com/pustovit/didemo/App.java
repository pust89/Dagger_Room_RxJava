package com.pustovit.didemo;

import android.app.Application;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

public class App extends Application {
    private static App app;
    private SmartPhoneComponent smartPhoneComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(200)).build();
    }

    public static App getApp() {
        return app;
    }

    public SmartPhoneComponent getSmartPhoneComponent() {
        return smartPhoneComponent;
    }
}
