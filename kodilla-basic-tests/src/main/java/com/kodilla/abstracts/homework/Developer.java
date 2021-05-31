package com.kodilla.abstracts.homework;

public class Developer extends Job {
    public Developer() {
        super(10000,"make life easier");
    }
    @Override
    public void show() {System.out.println("One of the Developer task is " + getResponsibilities());

    }
}
