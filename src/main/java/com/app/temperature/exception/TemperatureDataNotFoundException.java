package com.app.temperature.exception;

public class TemperatureDataNotFoundException extends RuntimeException{

    public TemperatureDataNotFoundException(String message) {
        super(message);
    }

    public TemperatureDataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemperatureDataNotFoundException(Throwable cause) {
        super(cause);
    }

    public TemperatureDataNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
