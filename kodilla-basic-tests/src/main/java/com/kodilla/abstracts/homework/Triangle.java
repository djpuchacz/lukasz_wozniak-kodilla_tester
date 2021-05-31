package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(4,4);//trójkąt równoramienny
    }
    @Override
    public void pole() {
        System.out.println("Pole trójkąta wynosi " + ((getSideShorter() * getLongerShorter() * Math.sqrt(getSideShorter())) / 4));
    }
    @Override
    public void obwod() {System.out.println("Obwód trójkąta wynosi "+3*getSideShorter());}
}
