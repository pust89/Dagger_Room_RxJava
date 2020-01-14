package com.pustovit.didemo;

import javax.inject.Inject;

/**
 * Created by Pustovit Vladimir on 14.01.2020.
 * vovapust1989@gmail.com
 */

public class SIMCard {

    private ServiceProvider serviceProvider;

    @Inject
    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider=serviceProvider;
    }
}
