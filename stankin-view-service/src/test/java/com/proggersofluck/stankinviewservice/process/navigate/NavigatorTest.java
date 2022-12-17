package com.proggersofluck.stankinviewservice.process.navigate;

import com.proggersofluck.stankinviewservice.builder.NavigationMapBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.proggersofluck.model.navigation.Path;

@Slf4j
class NavigatorTest {

    @Test
    void checkFirstFloor(){
        var builder = new NavigationMapBuilder();
        var map = builder.buildNavigationMap(1);
        var firstStep = builder.getLeftOrRightStart();
        var navigator = new Navigator();
        var start = builder.findPoint("n0");
        var target = builder.findPoint("a8");
        var path = navigator.getPath(map, firstStep, start, target);
        System.out.println(getPathStr(path));
    }

    private String getPathStr(Path path){
        var builder = new StringBuilder();
        for (var item : path.getPath()){
            builder.append(item.getStart().getId()).append("-->");
        }
        return builder.append(
                path.getPath().get(
                        path.getPath().size()-1)
                        .getEnd()
                        .getId())
                .toString();
    }
}