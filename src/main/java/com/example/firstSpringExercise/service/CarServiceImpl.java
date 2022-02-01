package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.Car;
import com.example.firstSpringExercise.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
      return carRepository.save(car);
    }

    @Override
    public Optional<Car> findById(int id) {
        return carRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        carRepository.deleteById(id);
    }
}
