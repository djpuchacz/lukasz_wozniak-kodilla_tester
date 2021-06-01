package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;
    private int decrease = 20;
    private int increase = 30;


    public Audi(int speed) {
        this.speed = speed;
        this.decrease = decrease;
        this.increase = increase;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + increase;
    }

    @Override
    public int decreaseSpeed() {
        return speed - decrease;
    }
}
