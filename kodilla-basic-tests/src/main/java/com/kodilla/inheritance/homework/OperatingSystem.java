package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int est;
    private int fin;

    public OperatingSystem(int est, int fin) {
        this.est = est;
        this.fin = fin;
    }

    public void turnOn() {
        System.out.println("Windows XP został wydany w roku 2001.");
    }

    public void turnOff() {
        System.out.println("Windows XP doczekał się następcy w roku 2007.");
    }

    public int getEst() {
        return est;
    }
    public int getFin() {
        return fin;
    }

}
