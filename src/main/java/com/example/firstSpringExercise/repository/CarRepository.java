package com.example.firstSpringExercise.repository;

import com.example.firstSpringExercise.model.Car;
import com.example.firstSpringExercise.model.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}

