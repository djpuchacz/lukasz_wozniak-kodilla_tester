package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

@SpringBootTest
public class CarConfigTestSuite {
    @Test
    public void shouldReturnRightCarDependsOnYearSeason(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("selectCar");
        String season = CarConfig.getSeason(LocalDate.now());
        System.out.println("Returned car : " + car.getCarType() + ", lights on: " + car.hasHeadlightsTurnedOn());

        if(season.equals("Summer")) {
            Assertions.assertEquals("Cabrio", car.getCarType());
        } else if ( season.equals("Winter")){
            Assertions.assertEquals("SUV", car.getCarType());
        } else {
            Assertions.assertEquals("Sedan", car.getCarType());
        }
    }
}
