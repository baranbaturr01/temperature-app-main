package com.app.temperature.repository.abstracts;

import com.app.temperature.entity.Temperature;

import java.util.Optional;

public interface TemperatureRepository {

    public Optional<Temperature> getTemperatureByName(String name);

    public void insertTemperature(Temperature temperature);


}
