package com.kodilla.inheritance.homework;

public class AppSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem =new OperatingSystem(2001,2007);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        OffSpring1 offSpring1 = new OffSpring1(2007,2009);
        offSpring1.turnOn();
        offSpring1.turnOff();


        OffSpring2 offSpring2 = new OffSpring2(2009,2012);
        offSpring2.turnOn();
        offSpring2.turnOff();

    }
}
