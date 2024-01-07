package com.amida.webServiceApi.service;

import com.amida.webServiceApi.pojo.OpenWeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    private static final String apiKey = "35f0a9e651f8ff5295f37cc030e8cc57";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OpenWeatherResponse getWeather(String city) {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";

        return restTemplate.getForObject(apiUrl, OpenWeatherResponse.class, city, apiKey);
    }
}
