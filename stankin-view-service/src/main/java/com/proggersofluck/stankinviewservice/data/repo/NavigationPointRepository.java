package com.proggersofluck.stankinviewservice.data.repo;

import com.proggersofluck.stankinviewservice.data.entities.NavigationPoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NavigationPointRepository extends JpaRepository<NavigationPoint, Long> {
    List<NavigationPoint> findAllByFloor(int floor);
    List<NavigationPoint> findAllByFloorAndCode(int floor, int code);
}
