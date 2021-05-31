package com.kodilla.abstracts.homework;

public class Killer extends Job {
    public Killer() {
            super(1000000,"kill sb");
        }
        @Override
        public void show() {System.out.println("The Killer has a one target:  " + getResponsibilities());
    }
}

