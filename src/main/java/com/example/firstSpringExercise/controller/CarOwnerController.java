package com.example.firstSpringExercise.controller;

import com.example.firstSpringExercise.dto.CarOwnerDto;
import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.model.Engine;
import com.example.firstSpringExercise.service.CarOwnerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/carOwners")
public class CarOwnerController {
    @Autowired
    CarOwnerService carOwnerService;

  @GetMapping("/{id}")
    ResponseEntity<CarOwnerDto> getCarOwner(@PathVariable(value="id")int id){
    if(carOwnerService.findCarOwnerById(id).isEmpty()){
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
      return ResponseEntity.status(HttpStatus.OK).body(carOwnerService.findCarOwnerById(id).get().mapToCarOwnerDto());
  }

  @PostMapping
    ResponseEntity<CarOwnerDto> createCarOwner(@RequestBody @NotNull CarOwnerDto carOwnerDto){
     CarOwner carOwner= carOwnerService.saveCarOwner(carOwnerDto.mapToCarOwner());
      return ResponseEntity.status(HttpStatus.OK).body(carOwner.mapToCarOwnerDto());
  }
    @DeleteMapping("{id}")
    ResponseEntity<?> deleteEngin(@PathVariable(value = "id")int id){
        carOwnerService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Entity deleted");
    }
}
