package com.example.firstSpringExercise.model;

import com.example.firstSpringExercise.dto.CarOwnerDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "CarOwner")
public class CarOwner {
    @Id
    @GeneratedValue
     private int id;

    @Column
    private String name;
    @Column
    private LocalDate birthDate;

    public CarOwner() {

    }

    public CarOwner(String name, LocalDate birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }

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

    public int getId(){
        return this.id;
    }

    public CarOwnerDto mapToCarOwnerDto(){
        CarOwnerDto carOwnerDto = new CarOwnerDto();
        carOwnerDto.setBirthDate(this.birthDate);
        carOwnerDto.setName(this.name);
        return carOwnerDto;
    }
}
