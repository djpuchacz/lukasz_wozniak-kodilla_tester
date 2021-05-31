package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    public Policeman() {
        super(4000,"save");
    }
    @Override
    public void show() {System.out.println("One of the Policeman task is " + getResponsibilities());
    }

}
