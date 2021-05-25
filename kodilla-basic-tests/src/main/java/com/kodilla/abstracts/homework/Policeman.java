package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    public Policeman() {
        super(4000,"save");
    }
    @Override
    public void resp() {System.out.println(getResponsibilities());
    }

}
