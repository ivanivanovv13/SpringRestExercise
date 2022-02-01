package com.example.firstSpringExercise.model;

import com.example.firstSpringExercise.dto.EngineDto;

import javax.persistence.*;

@Entity
public class Engine {
    @Id
    @GeneratedValue
    int id;
    @Column
    String engineNumber;
    @Column
    double cubature;
    @Column
    int horsePower;

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public double getCubature() {
        return cubature;
    }

    public void setCubature(double cubature) {
        this.cubature = cubature;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getId() {
        return this.id;
    }

    public Engine(){

    }

    public Engine(String engineNumber,double cubature,int horsePower){
        this.engineNumber=engineNumber;
        this.cubature=cubature;
        this.horsePower=horsePower;
    }

    public EngineDto mapToEngineDto(){
        EngineDto engineDto = new EngineDto();
        engineDto.setEngineNumber(this.engineNumber);
        engineDto.setCubature(this.cubature);
        engineDto.setHorsePower(this.horsePower);
        return engineDto;
    }


}
