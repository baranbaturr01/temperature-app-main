package com.app.temperature.dto.response.concrete;

import com.app.temperature.dto.response.abstracts.ErrorResponse;

public class TemperatureDataErrorResponse extends ErrorResponse {

    private Integer statusCode;

    private String message;

    public TemperatureDataErrorResponse(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
