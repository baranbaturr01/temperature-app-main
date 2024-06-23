package com.app.temperature.controller;

import com.app.temperature.dto.request.concrete.TemperatureRequest;
import com.app.temperature.dto.response.concrete.TemperatureResponse;
import com.app.temperature.sevice.abstracts.TemperatureService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemperatureController {

    TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/temperature")
    public TemperatureResponse getTemperatureByCityName(@RequestParam String q) {
        return temperatureService.findTemperatureByName(q);
    }

    @PostMapping("/temperature")
    public TemperatureResponse getTemperatureByCityName(@RequestBody TemperatureRequest request) {
       return temperatureService.findTemperatureByName(request.getQuery());
    }

}
