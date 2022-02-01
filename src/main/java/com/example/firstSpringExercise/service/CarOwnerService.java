package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.CarOwner;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CarOwnerService {
    public CarOwner saveCarOwner(CarOwner carOwner);

    public Optional<CarOwner> findCarOwnerById(int id);

    public void deleteById(int id);
}
