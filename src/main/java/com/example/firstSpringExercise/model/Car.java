package com.example.firstSpringExercise.model;

import com.example.firstSpringExercise.dto.CarDto;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
public class Car {

    @Id
    @GeneratedValue
    int id;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true,targetEntity = Engine.class)
    @JoinColumn(name = "engine_id")
    private Engine engine;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity = CarOwner.class)
    @JoinColumn(name = "owner_id")
    private CarOwner carOwner;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private int year;
    @Column
    private String carNumber;

    public Car(){

    }

    public Car(Engine engine,CarOwner carOwner,String brand,String model,int year,String carNumber){
    this.engine=engine;
    this.carOwner=carOwner;
    this.brand=brand;
    this.model=model;
    this.year=year;
    this.carNumber=carNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

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

    public CarDto mapToCarDto(){
        CarDto carDto= new CarDto();
        carDto.setBrand(this.brand);
        carDto.setCarNumber(this.carNumber);
        carDto.setModel(this.model);
        carDto.setYear(this.year);
        carDto.setEngineId(this.engine.getId());
        carDto.setOwnerId(this.carOwner.getId());
        return carDto;
    }
}
