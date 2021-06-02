package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    private int speed;

    public Renault(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed = speed + 10;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - 40;
    }

    @Override
    public String toString() {
        return "Renault{" +
                "speed=" + speed +
                '}';
    }
}
