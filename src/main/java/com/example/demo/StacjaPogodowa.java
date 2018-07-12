package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa implements TemperatureProvider, WeatherInfoProvider  {
    public int getTemperature() {

            return przedzial(-25, 35);

    }

    private int przedzial(int from, int to) {
        Random random = new Random();

        int abs = Math.abs(from);
        return random.nextInt(abs + to + 1) - to;
    }


    @Override
    public String getWeatherInfo() {
        return " jest slonecznie";
    }
}
