package com.app.temperature.entity;

public class Temperature {

    private String name;
    private Long temperature;
    private String unit;

    public String getName() {
        return name;
    }

    public Temperature setName(String name) {
        this.name = name;
        return this;
    }

    public Long getTemperature() {
        return temperature;
    }

    public Temperature setTemperature(Long temperature) {
        this.temperature = temperature;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Temperature setUnit(String unit) {
        this.unit = unit;
        return this;
    }
}
