package com.proggersofluck.stankinviewservice.data.repo;

import com.proggersofluck.stankinviewservice.data.entities.Stair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StairRepository extends JpaRepository<Stair, Long> {

    List<Stair> findAllByFloor(Integer floor);

}