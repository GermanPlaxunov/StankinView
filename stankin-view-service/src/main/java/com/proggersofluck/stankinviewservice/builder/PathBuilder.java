package com.proggersofluck.stankinviewservice.builder;

import com.proggersofluck.stankinviewservice.provider.NavigationProvider;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.navigation.NavigationPoint;
import org.proggersofluck.model.navigation.Path;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PathBuilder {

    private final NavigationProvider provider;

    public List<Path> buildPath(NavigationPoint start, NavigationPoint destination) {
        var result = new ArrayList<Path>();
        if(start.getFloor() == destination.getFloor()){
            var floor = start.getFloor();
            var path = buildSingleFloorPath(start, destination, floor);
            result.add(floor, path);
        }
        return result;
    }

    private Path buildSingleFloorPath(NavigationPoint start, NavigationPoint destination, int floor){
        //TODO: How to build path in single floor
        return new Path();
    }

    private Path getPath(NavigationPoint stair, NavigationPoint start){
        return new Path();
    }

}
