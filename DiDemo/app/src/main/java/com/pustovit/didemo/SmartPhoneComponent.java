package com.pustovit.didemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */
@Singleton
@Component(modules = {MemoryCardModule.class, BatteryModule.class})
public interface SmartPhoneComponent {

   // SmartPhone getSmartPhone();
    void injectMainActivity(MainActivity mainActivity);
}
