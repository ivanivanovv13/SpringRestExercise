package com.example.firstSpringExercise.exception;

public class EngineNotFoundException extends RuntimeException{
    
    public EngineNotFoundException(int id){
        super("Engine id not found "+id);
    }
}
