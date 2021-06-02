package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("znaczek 1", "rozmiar A", false));
        stamps.add(new Stamp("znaczek 2", "rozmiar B", true));
        stamps.add(new Stamp("znaczek 3", "rozmiar C", false));
        stamps.add(new Stamp("znaczek 4", "rozmiar E", true));
        stamps.add(new Stamp("znaczek 2", "rozmiar B", true));
        stamps.add(new Stamp("znaczek 3", "rozmiar C", false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
