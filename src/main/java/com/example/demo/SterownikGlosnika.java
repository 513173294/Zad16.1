package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SterownikGlosnika {

    @Component
    public class TemperaturePrinter {



        private WeatherInfoProvider weatherInfoProvider;

        private  TemperatureProvider temperatureProvider;
        @Autowired
        public TemperaturePrinter(TemperatureProvider temperatureProvider) {
            this.temperatureProvider = temperatureProvider;
        }

        @Autowired
        public void printweatherInfo()  {
            int temp = temperatureProvider.getTemperature();
            String wInfo = weatherInfoProvider.getWeatherInfo();
            System.out.println("Dzien dobry. Dzisiejsza temperatura to "+temp+"*C i"+wInfo+". To bedzie dobry dzien!");
        }
        public TemperaturePrinter(WeatherInfoProvider weatherInfoProvider) {
            this.weatherInfoProvider = weatherInfoProvider;
        }

    }
}
