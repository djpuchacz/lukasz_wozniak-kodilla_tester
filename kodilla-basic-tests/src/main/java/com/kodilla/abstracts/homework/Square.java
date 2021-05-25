package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(4,4);
    }
    @Override
    public void pole() {System.out.println(getSideShorter()*getLongerShorter());
    }

    @Override
    public void obwod() {System.out.println(2*getSideShorter() + 2*getLongerShorter());}
}
