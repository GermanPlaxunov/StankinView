package com.proggersofluck.stankinviewservice.data.service.interfaces;

import com.proggersofluck.stankinviewservice.data.entities.Stair;

import java.util.List;

public interface StairService {
    List<Stair> getAll();
    Stair getById(Long id);
    List<Stair> getByFloor(Integer floor);
    void deleteById(Long id);
}
