package com.proggersofluck.stankinviewservice.process;

import org.proggersofluck.model.navigation.NavigationPoint;

public class Utils {

    public static float distance(NavigationPoint p1, NavigationPoint p2){
        return distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public static float distance(float x1, float y1, float x2, float y2){
        var x = Math.pow((x2 - x1), 2);
        var y = Math.pow((y2 - y1), 2);
        return (float) Math.sqrt(x + y);
    }

}
