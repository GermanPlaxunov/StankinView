package com.proggersofluck.stankinviewservice.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AppController {

    @GetMapping(path = "/doSomeStuff")
    public void doSomeStuff(){
        log.info("STUFF");
    }

}
