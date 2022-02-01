package com.example.firstSpringExercise.dto;

import com.example.firstSpringExercise.model.Car;
import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.model.Engine;

import javax.validation.constraints.NotEmpty;

public class CarDto {

    @NotEmpty(message = "Not a brand")
    private String brand;
    @NotEmpty
    private String model;
    @NotEmpty
    private int year;
    @NotEmpty
    private String carNumber;
    @NotEmpty
    private int engineId;
    @NotEmpty
    private int ownerId;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Car mapToCar(){
        Car car= new Car();
        car.setBrand(this.brand);
        car.setCarNumber(this.carNumber);
        car.setModel(this.model);
        car.setYear(this.year);
        car.setYear(this.year);
        return car;
    }
}
