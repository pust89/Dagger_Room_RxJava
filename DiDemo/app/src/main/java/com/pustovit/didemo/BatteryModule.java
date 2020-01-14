package com.pustovit.didemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

@Module
public class BatteryModule {

    @Provides
    Battery getBattery(NickelCadmiumBattary nickelCadmiumBattary){
        nickelCadmiumBattary.showType();
        return nickelCadmiumBattary;
    }
}
