package com.proggersofluck.stankinviewservice.process;

import com.proggersofluck.stankinviewservice.builder.PathBuilder;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.navigation.Path;
import org.proggersofluck.model.request.PathRequest;
import org.proggersofluck.model.response.PreparedPath;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class RequestProcessor {

    private final PathBuilder pathBuilder;

    public PreparedPath process(PathRequest pathRequest){
        var currentPosition = pathRequest.getCurrentPosition();
        var destination = pathRequest.getDestination();
        Map<Integer, Path> result = new HashMap<>();
        if (currentPosition.getFloor() == destination.getFloor()){
            var floor = currentPosition.getFloor();
            var start = currentPosition.getNavigationPoint();
            var dest = destination.getNavigationPoint();
            var path = pathBuilder.buildPath(start, dest, floor); // FIXME: RETURN
            result.put(floor, path);
        } else {
            var startFloor = currentPosition.getFloor();
            var destFloor = destination.getFloor();
        }
        return preparePath(result);
    }

    private PreparedPath preparePath(Map<Integer, Path> path){
        return new PreparedPath(path);
    }

}
