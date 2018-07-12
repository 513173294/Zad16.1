package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

    private WeatherInfoProvider weatherInfoProvider;

    @Autowired

    public SterownikRolet(WeatherInfoProvider weatherInfoProvider) {
        this.weatherInfoProvider = weatherInfoProvider;
    }

    public void strujRoletami() {
        if ("jest slonecznie".equals(weatherInfoProvider.getWeatherInfo())) {
            System.out.println("Jest slonecznie, zaslaniam rolety");
        }else {
            System.out.println("Nie jest slonecznie, nie zaslaniam rolet");

        }

    }


}
