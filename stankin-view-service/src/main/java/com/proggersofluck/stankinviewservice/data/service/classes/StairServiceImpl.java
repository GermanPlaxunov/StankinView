package com.proggersofluck.stankinviewservice.data.service.classes;

import com.proggersofluck.stankinviewservice.data.entities.Stair;
import com.proggersofluck.stankinviewservice.data.repo.StairRepository;
import com.proggersofluck.stankinviewservice.data.service.interfaces.StairService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StairServiceImpl implements StairService {

    private final StairRepository repository;

    @Override
    public List<Stair> getAll() {
        return repository.findAll();
    }

    @Override
    public Stair getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Stair> getByFloor(Integer floor) {
        return repository.findAllByFloor(floor);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
