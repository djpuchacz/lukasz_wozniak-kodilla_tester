package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> whoAndWhere = new HashMap<>();
        Principal gates = new Principal("Bill", "Gates", "Microsoft Academy");
        Principal jobs = new Principal("Steve", "Jobs", "Lans & Bans College");
        Principal wozniak = new Principal("Steve", "Wozniak", "IV LO");
        Principal ziemniak = new Principal("Jerzy", "Ziemnicki", "Politechnika łódzka");

        School academy = new School(5, 40, 45, 50, 50);
        School university = new School(25, 30, 20);
        School college = new School(40, 40, 40, 40, 50);
        School pl = new School(40, 40, 90, 40, 50);

        whoAndWhere.put(gates, academy);
        whoAndWhere.put(jobs, university);
        whoAndWhere.put(wozniak, college);
        whoAndWhere.put(ziemniak, pl);

        for (Map.Entry<Principal, School> principalEntry : whoAndWhere.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " "+ principalEntry.getKey().getLastname() + " is a Head Of "+principalEntry.getKey().getSchoolName() + "." + " In this school are: " +
                    principalEntry.getValue().getQuantity() + " students.");
    }

}
