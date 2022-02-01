package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.Car;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CarService {
    Car saveCar(Car car);

    Optional<Car> findById(int id);

    void deleteById(int id);
}
