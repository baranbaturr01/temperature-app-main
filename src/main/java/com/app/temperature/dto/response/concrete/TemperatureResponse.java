package com.app.temperature.dto.response.concrete;

import com.app.temperature.dto.response.abstracts.SuccessResponse;

public class TemperatureResponse extends SuccessResponse {

    private TemperatureResponseDto response;

    public TemperatureResponse(TemperatureResponseDto response) {
        this.response = response;
    }

    public TemperatureResponseDto getResponse() {
        return response;
    }

    public TemperatureResponse setResponse(TemperatureResponseDto response) {
        this.response = response;
        return this;
    }
}
