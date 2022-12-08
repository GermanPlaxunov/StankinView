package com.proggersofluck.stankinviewservice.provider;

import com.proggersofluck.stankinviewservice.data.entities.NavigationPoint;
import com.proggersofluck.stankinviewservice.data.service.interfaces.NavigationPointService;
import lombok.RequiredArgsConstructor;
import org.proggersofluck.model.constants.enums.ObjectCodes;

import java.util.List;

@RequiredArgsConstructor
public class NavigationProvider {

    private final NavigationPointService navPointService;

    public List<NavigationPoint> findAllStairOnFloor(int floor) {
        var code = ObjectCodes.getStair();
        return navPointService.getByFloorAndCode(floor, code);
    }
}
