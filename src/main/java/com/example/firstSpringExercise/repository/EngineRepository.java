package com.example.firstSpringExercise.repository;

import com.example.firstSpringExercise.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineRepository extends JpaRepository<Engine,Integer> {
}
