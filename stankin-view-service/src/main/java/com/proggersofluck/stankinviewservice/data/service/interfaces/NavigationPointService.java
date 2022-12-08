package com.proggersofluck.stankinviewservice.data.service.interfaces;

import com.proggersofluck.stankinviewservice.data.entities.NavigationPoint;

import java.util.List;

public interface NavigationPointService {
    void save(NavigationPoint point);
    void deleteById(long id);
    List<NavigationPoint> getByFloor(int floor);
    List<NavigationPoint> getByFloorAndCode(int floor, int code);
}
