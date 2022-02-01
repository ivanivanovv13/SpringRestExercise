package com.example.firstSpringExercise.dto;

import com.example.firstSpringExercise.model.Engine;

import javax.validation.constraints.NotNull;

public class EngineDto {
    @NotNull
    private String engineNumber;
    @NotNull
    private double cubature;
    @NotNull
    private int horsePower;

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

   public Engine mapToEngine(){
        Engine engine = new Engine();
        engine.setEngineNumber(this.engineNumber);
        engine.setCubature(this.cubature);
        engine.setHorsePower(this.horsePower);
        return engine;
   }
}
