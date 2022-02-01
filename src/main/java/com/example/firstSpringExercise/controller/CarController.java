package com.example.firstSpringExercise.controller;

import com.example.firstSpringExercise.dto.CarDto;
import com.example.firstSpringExercise.model.Car;
import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/cars")
 public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/{id}")
    ResponseEntity<CarDto> getById(@PathVariable(value="id")int id){
        if(carService.findById(id).isEmpty()){
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(carService.findById(id).get().mapToCarDto());
    }

    @PostMapping
    ResponseEntity<CarDto> createCar(@RequestBody @NotNull CarDto carDto)
    {
        Car car= carService.saveCar(carDto.mapToCar());
        return ResponseEntity.status(HttpStatus.OK).body(car.mapToCarDto());
    }


    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(@PathVariable(value="id")int id){
        carService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Entity deleted");
    }

}
