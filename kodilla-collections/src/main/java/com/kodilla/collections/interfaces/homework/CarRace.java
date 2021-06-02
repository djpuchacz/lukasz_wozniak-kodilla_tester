package com.kodilla.collections.interfaces.homework;

public class CarRace {
        public static void main(String[] args) {
            Ford ford = new Ford(100);
            doRace(ford);

            Renault renault = new Renault(70);
            doRace(renault);

            Audi audi = new Audi(60);
            doRace(audi);
        }
        private static void doRace(Car car) {
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.decreaseSpeed();
            car.decreaseSpeed();
            System.out.println(car.getSpeed());

        }
}

