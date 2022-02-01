package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.Engine;
import com.example.firstSpringExercise.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EngineServiceImpl implements EngineService{
    @Autowired
    EngineRepository engineRepository;

    @Override
    public Engine saveEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public Optional<Engine> findById(int id) {
        return engineRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        engineRepository.deleteById(id);
    }
}
