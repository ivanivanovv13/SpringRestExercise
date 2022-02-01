package com.example.firstSpringExercise.service;

import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.repository.CarOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarOwnerServiceImpl implements CarOwnerService{
    @Autowired
    CarOwnerRepository carOwnerRepository;

    @Override
    public CarOwner saveCarOwner(CarOwner carOwner) {
       return carOwnerRepository.save(carOwner);
    }

    @Override
    public Optional<CarOwner> findCarOwnerById(int id) {
        return carOwnerRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        carOwnerRepository.deleteById(id);
    }
}
