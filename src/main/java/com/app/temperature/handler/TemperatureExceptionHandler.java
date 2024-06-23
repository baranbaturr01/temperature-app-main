package com.app.temperature.handler;

import com.app.temperature.dto.response.concrete.TemperatureDataErrorResponse;
import com.app.temperature.exception.TemperatureDataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TemperatureExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<TemperatureDataErrorResponse> handleException(TemperatureDataNotFoundException e){

        TemperatureDataErrorResponse temperatureDataErrorResponse = new TemperatureDataErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());

        return ResponseEntity.status(temperatureDataErrorResponse.getStatusCode()).body(temperatureDataErrorResponse);
    }

    @ExceptionHandler
    public ResponseEntity<TemperatureDataErrorResponse> handleException(Exception e){

        TemperatureDataErrorResponse temperatureDataErrorResponse = new TemperatureDataErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());

        return ResponseEntity.status(temperatureDataErrorResponse.getStatusCode()).body(temperatureDataErrorResponse);
    }
}
