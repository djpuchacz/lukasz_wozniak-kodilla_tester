package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(4,4);
    }
    @Override
    public void pole() {System.out.println("Pole kwadratu wynosi "+getSideShorter()*getLongerShorter());
    }

    @Override
    public void obwod() {System.out.println("Obwód kwadratu wynosi "+2*(getSideShorter() + getLongerShorter()));}
}
