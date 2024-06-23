package com.app.temperature.sevice.abstracts;

import com.app.temperature.dto.response.concrete.TemperatureResponse;

public interface TemperatureService {

    public TemperatureResponse findTemperatureByName(String query);
}
