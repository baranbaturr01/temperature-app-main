package com.app.temperature.repository.concretes;

import com.app.temperature.repository.abstracts.TemperatureRepository;
import com.app.temperature.entity.Temperature;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("singleton")
public class JsonTemperatureRepository implements TemperatureRepository {

    private List<Temperature> temperatureList;

    @PostConstruct
    public void init(){
        temperatureList = new ArrayList<>();
    }

    public Optional<Temperature> getTemperatureByName(String name){

       return temperatureList.stream()
               .filter(temperature -> Objects.equals(temperature.getName().toLowerCase(Locale.ENGLISH),name.toLowerCase(Locale.ENGLISH)))
               .findAny();

    }

    public void insertTemperature(Temperature temperature){

        temperatureList.add(temperature);

    }


}
