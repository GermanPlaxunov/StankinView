package com.proggersofluck.stankinviewservice.provider;

import com.proggersofluck.stankinviewservice.data.entities.Stair;
import com.proggersofluck.stankinviewservice.data.service.interfaces.StairService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StairProvider {

    private final StairService stairService;

    public Stair findAnyStairByFloor(int floor){
        return stairService.getByFloor(floor).get(0);//TODO: Should decide which stair to provide
    }

}
