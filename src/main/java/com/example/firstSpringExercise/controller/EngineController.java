package com.example.firstSpringExercise.controller;

import com.example.firstSpringExercise.dto.EngineDto;
import com.example.firstSpringExercise.exception.EngineNotFoundException;
import com.example.firstSpringExercise.model.Engine;
import com.example.firstSpringExercise.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/engine")
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping("/{id}")
    ResponseEntity<EngineDto> findById(@PathVariable(value="id")int id){
        if(engineService.findById(id).isEmpty()){
             throw new EngineNotFoundException(id);
        }
        return ResponseEntity.status(HttpStatus.OK).body(engineService.findById(id).get().mapToEngineDto());
    }

    @PostMapping
    ResponseEntity<EngineDto> createEngine(@RequestBody EngineDto newEngine){
        Engine createdEngine = engineService.saveEngine(newEngine.mapToEngine());
        return ResponseEntity.status(HttpStatus.OK).body(createdEngine.mapToEngineDto());
    }

    @DeleteMapping("{id}")
    ResponseEntity<?> deleteEngin(@PathVariable(value = "id")int id){
        engineService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Entity deleted");
    }

    @PatchMapping("{id}/{name}")
    public ResponseEntity<Engine> updateCustomerName(@PathVariable int id, @PathVariable int  horsePower) {
        try {
            Engine engine = engineService.findById(id).get();
            engine.setHorsePower(horsePower);
            return new ResponseEntity<Engine>(engineService.saveEngine(engine), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
