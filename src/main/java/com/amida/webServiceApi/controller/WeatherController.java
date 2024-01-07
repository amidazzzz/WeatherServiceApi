package com.amida.webServiceApi.controller;

import com.amida.webServiceApi.pojo.OpenWeatherResponse;
import com.amida.webServiceApi.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city, Model model) {
        OpenWeatherResponse weatherResponse = weatherService.getWeather(city);
        model.addAttribute("weather", weatherResponse);
        return "weather";
    }
}