package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private TemperatureProvider temperatureProvider;

    @Autowired
    public SterownikPieca(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void sterujPiecem() {
        if (temperatureProvider.getTemperature() < 15) {
            System.out.println("Jest zimno. Uruchamiam piec");

        } else {
            System.out.println("Jest cieplo. Nie uruchamiam pieca");
        }


    }
}