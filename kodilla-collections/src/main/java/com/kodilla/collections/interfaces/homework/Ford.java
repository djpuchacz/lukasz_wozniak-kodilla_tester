package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + 20;
    }

    @Override
    public int decreaseSpeed() {
        return speed - 15;
    }
}
