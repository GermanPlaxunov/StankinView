package com.proggersofluck.stankinviewservice.data.service.classes;

import com.proggersofluck.stankinviewservice.data.entities.NavigationPoint;
import com.proggersofluck.stankinviewservice.data.repo.NavigationPointRepository;
import com.proggersofluck.stankinviewservice.data.service.interfaces.NavigationPointService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class NavigationPointServiceImpl implements NavigationPointService {

    private final NavigationPointRepository repository;

    @Override
    public void save(NavigationPoint point) {
        repository.save(point);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<NavigationPoint> getByFloor(int floor) {
        return repository.findAllByFloor(floor);
    }

    @Override
    public List<NavigationPoint> getByFloorAndCode(int floor, int code) {
        return repository.findAllByFloorAndCode(floor, code);
    }
}
