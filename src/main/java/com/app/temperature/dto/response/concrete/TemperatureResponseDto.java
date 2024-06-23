package com.app.temperature.dto.response.concrete;

public class TemperatureResponseDto {
    private String name;
    private Long temperature;
    private String unit;

    public TemperatureResponseDto(String name, Long temperature, String unit) {
        this.name = name;
        this.temperature = temperature;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public TemperatureResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public Long getTemperature() {
        return temperature;
    }

    public TemperatureResponseDto setTemperature(Long temperature) {
        this.temperature = temperature;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public TemperatureResponseDto setUnit(String unit) {
        this.unit = unit;
        return this;
    }
}
