package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int sideShorter;
    private int sideLonger;

    public Shape(int sideShorter, int sideLonger) {
        this.sideShorter = sideShorter;
        this.sideLonger = sideLonger;
    }

    public int getSideShorter() {
        return sideShorter;
    }

    public int getLongerShorter() {
        return sideLonger;
    }

    public abstract void pole();
    public abstract void obwod();
}
