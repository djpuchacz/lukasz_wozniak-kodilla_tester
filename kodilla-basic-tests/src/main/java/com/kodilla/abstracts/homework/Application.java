package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.pole();
        square.obwod();

        Triangle triangle = new Triangle();
        triangle.pole();
        triangle.obwod();

        Rectangle rectangle = new Rectangle();
        rectangle.pole();
        rectangle.obwod();

        Policeman policeman = new Policeman();
        policeman.show();

        Killer killer = new Killer();
        killer.show();

        Developer developer = new Developer();
        developer.show();

    }

}
