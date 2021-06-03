package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars= new ArrayList<>();
        Ford ford = new Ford(99);
        cars.add(ford);
        cars.add(new Audi(100));
        cars.add(new Renault(98));

        cars.remove(2);
        cars.remove(ford);


        for (int n = 0; n < cars.size(); n++)
            System.out.println(cars.get(n));

        System.out.println("Aktualny rozmiar kolekcji to: " + cars.size());
        for (Car car : cars) {
                CarUtils.describeCar(car);
            }
    }
}