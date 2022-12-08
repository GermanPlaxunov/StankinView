package com.proggersofluck.stankinviewservice.rest;

import com.proggersofluck.stankinviewservice.process.RequestProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.proggersofluck.model.request.PathRequest;
import org.proggersofluck.model.response.PreparedPath;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AppController {

    private final RequestProcessor processor;

    @PostMapping(path = "/getPath")
    public PreparedPath getPathToCoordinates(@RequestBody PathRequest request) {
        return processor.process(request);
    }

}
