package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Renault;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCareName(car));
        //System.out.println("Car speed: " + car.increaseSpeed());

    }
    private static String getCareName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Renault)
            return "Renault";
        else
            return "Unknown car name";
    }
}
