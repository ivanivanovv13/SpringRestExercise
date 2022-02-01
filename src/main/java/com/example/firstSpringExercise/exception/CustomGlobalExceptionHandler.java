package com.example.firstSpringExercise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EngineNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEngineNotFoundException(EngineNotFoundException e){
      ErrorResponse errorResponse=new ErrorResponse();
      errorResponse.setMessage(e.getMessage());
      errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
      errorResponse.setTimestamp(System.currentTimeMillis());

      return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

}

