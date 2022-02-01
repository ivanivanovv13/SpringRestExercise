package com.example.firstSpringExercise.dto;

import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.model.Engine;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class CarOwnerDto {

    @NotEmpty(message = "Provide a name")
    private String name;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public CarOwner mapToCarOwner(){
       CarOwner carOwner = new CarOwner();
       carOwner.setBirthDate(this.birthDate);
       carOwner.setName(this.name);
       return carOwner;
    }

}
