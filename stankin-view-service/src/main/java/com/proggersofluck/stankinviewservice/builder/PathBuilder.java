package com.proggersofluck.stankinviewservice.builder;

import com.proggersofluck.stankinviewservice.data.entities.Stair;
import com.proggersofluck.stankinviewservice.provider.StairProvider;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.navigation.NavigationPoint;
import org.proggersofluck.model.navigation.Path;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class PathBuilder {

    private final StairProvider stairProvider;

    public Path buildPath(NavigationPoint start, NavigationPoint destination, int floor){
        //TODO: How to build path in single floor
        return new Path();
    }

    public Map<Integer, Path> buildFullPath(NavigationPoint start, NavigationPoint destination,
                                            int floorStart, int floorDest) {
        var result = new HashMap<Integer, Path>();
        var stairStart = stairProvider.findAnyStairByFloor(floorStart);
        var stairDest = stairProvider.findAnyStairByFloor(floorDest);
        result.put(floorStart, getPathToStair(stairStart, start));
        result.put(floorDest, getPathToStair(stairDest, destination));
        return result;
    }

    private Path getPathToStair(Stair stair, NavigationPoint start){
        var stairPoint = new NavigationPoint(stair.getPositionX(), stair.getPositionY());
        return new Path();
    }

}
