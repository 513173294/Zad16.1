package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class Main {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        StacjaPogodowa stacjaPogodowa = context.getBean(StacjaPogodowa.class);
stacjaPogodowa.getWeatherInfo();
    }
}