package com.proggersofluck.stankinviewservice.process;

import com.proggersofluck.stankinviewservice.builder.PathBuilder;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.navigation.Path;
import org.proggersofluck.model.request.PathRequest;
import org.proggersofluck.model.response.PreparedPath;

import java.util.List;

@RequiredArgsConstructor
public class RequestProcessor {

    private final PathBuilder pathBuilder;

    public PreparedPath process(PathRequest pathRequest) {
        var start = pathRequest.getCurrentPosition();
        var destination = pathRequest.getDestination();
        var result = pathBuilder.buildPath(start, destination);
        return preparePath(result);
    }

    private PreparedPath preparePath(List<Path> path) {
        return new PreparedPath(path);
    }

}
