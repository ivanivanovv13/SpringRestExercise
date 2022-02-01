package com.example.firstSpringExercise.repository;

import com.example.firstSpringExercise.model.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOwnerRepository extends JpaRepository<CarOwner,Integer> {
}
