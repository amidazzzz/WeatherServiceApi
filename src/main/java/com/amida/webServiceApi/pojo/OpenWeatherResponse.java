package com.amida.webServiceApi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class OpenWeatherResponse {
    @JsonProperty("main")
    private WeatherDetails weatherDetails;

    @JsonProperty("name")
    private String cityName;

    @Setter
    @Getter
    public static class WeatherDetails {

        @JsonProperty("temp")
        private double temperature;

        @JsonProperty("humidity")
        private int humidity;

        public double getTemperature() {
            return temperature - 273.15;
        }
    }
}



