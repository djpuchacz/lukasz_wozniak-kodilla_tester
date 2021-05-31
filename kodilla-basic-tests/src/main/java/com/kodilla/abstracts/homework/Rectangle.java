package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4,6);
    }
    @Override
    public void pole() {System.out.println("Pole prostokąta wynosi "+getSideShorter()*getLongerShorter());
    }

    @Override
    public void obwod() {System.out.println("Obwód prostokąta wynosi "+2*(getSideShorter() + getLongerShorter()));}

}
