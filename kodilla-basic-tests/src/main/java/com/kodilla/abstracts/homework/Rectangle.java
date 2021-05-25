package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4,6);
    }
    @Override
    public void pole() {System.out.println(getSideShorter()*getLongerShorter());
    }

    @Override
    public void obwod() {System.out.println(2*getSideShorter() + 2*getLongerShorter());}
}
