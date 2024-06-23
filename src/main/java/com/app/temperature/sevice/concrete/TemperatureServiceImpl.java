package com.app.temperature.sevice.concrete;

import com.app.temperature.dto.response.concrete.TemperatureResponse;
import com.app.temperature.dto.response.concrete.TemperatureResponseDto;
import com.app.temperature.entity.Temperature;
import com.app.temperature.exception.TemperatureDataNotFoundException;
import com.app.temperature.repository.abstracts.TemperatureRepository;
import com.app.temperature.sevice.abstracts.TemperatureService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    private TemperatureRepository jsonTemperatureRepository;

    public TemperatureServiceImpl(TemperatureRepository temperatureRepository) {
        this.jsonTemperatureRepository = temperatureRepository;
    }

    public TemperatureResponse findTemperatureByName(String query){

        Temperature data = jsonTemperatureRepository.getTemperatureByName(query).orElseThrow(() -> new TemperatureDataNotFoundException("Temperature data not found with-" + query));

        TemperatureResponseDto temperatureResponseDto = new TemperatureResponseDto(data.getName(), data.getTemperature(), data.getUnit());

        return new TemperatureResponse(temperatureResponseDto);
    }


}
