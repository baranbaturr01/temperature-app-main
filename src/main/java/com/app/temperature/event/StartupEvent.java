package com.app.temperature.event;

import com.app.temperature.repository.abstracts.TemperatureRepository;
import com.app.temperature.entity.Temperature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.util.List;

@Component
public class StartupEvent {

    private final TemperatureRepository jsonTemperatureRepository;

    public StartupEvent(TemperatureRepository jsonTemperatureRepository) {
        this.jsonTemperatureRepository = jsonTemperatureRepository;
    }

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
           List<Temperature> temperatureList = objectMapper.readValue(ResourceUtils.getFile("classpath:data.json"), new TypeReference<>() {});

           temperatureList.forEach(jsonTemperatureRepository::insertTemperature);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
