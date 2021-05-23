package com.kodilla.inheritance.homework;

public class OffSpring1 extends OperatingSystem {
    public OffSpring1(int est, int fin) {
        super(est,fin);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows Vista został wydany w roku " + getEst());
    }
    @Override
    public void turnOff() {
        System.out.println("Windows Vista doczekał się następcy w roku " + getFin());
    }
}
