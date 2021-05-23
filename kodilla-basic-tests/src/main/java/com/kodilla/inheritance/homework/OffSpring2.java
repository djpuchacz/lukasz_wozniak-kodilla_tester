package com.kodilla.inheritance.homework;

public class OffSpring2 extends OperatingSystem {
    public OffSpring2(int est, int fin) {
        super(est,fin);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows 7 został wydany w roku " + getEst());
    }
    @Override
    public void turnOff() {
        System.out.println("Windows 7 doczekał się następcy w roku " + getFin());
    }

}