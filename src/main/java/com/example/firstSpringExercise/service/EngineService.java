package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.Engine;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EngineService {
    Engine saveEngine(Engine engine);

    Optional<Engine> findById(int id);

    void deleteById(int id);
}
