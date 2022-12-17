package com.proggersofluck.stankinviewservice.builder;

import org.junit.jupiter.api.Test;

class NavigationMapBuilderTest {

    @Test
    void check(){
        var builder = new NavigationMapBuilder();
        var map = builder.buildNavigationMap(1);
    }

}