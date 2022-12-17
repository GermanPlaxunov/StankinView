package com.proggersofluck.stankinviewservice.builder;

import com.proggersofluck.stankinviewservice.process.navigate.Navigator;
import com.proggersofluck.stankinviewservice.provider.NavigationProvider;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.navigation.NavigationPoint;
import org.proggersofluck.model.navigation.Path;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PathBuilder {
    private final NavigationMapBuilder navigationMapBuilder;
    private final Navigator navigator;

    public List<Path> buildPath(NavigationPoint start, NavigationPoint destination) {
        var result = new ArrayList<Path>();
        if (start.getFloor() == destination.getFloor()) {
            var floor = start.getFloor();
            var path = buildSingleFloorPath(start, destination, floor);
            result.add(floor, path);
        }
        return result;
    }

    private Path buildSingleFloorPath(NavigationPoint start, NavigationPoint destination, int floor) {
        var map = navigationMapBuilder.buildNavigationMap(floor);
        var firstStepMap = navigationMapBuilder.getLeftOrRightStart();
        return navigator.getPath(map, firstStepMap, start, destination);
    }
}
