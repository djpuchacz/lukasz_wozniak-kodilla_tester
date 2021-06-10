package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

   public static List<Flight> getFlightsTable() {
            List<Flight> flights = new ArrayList<>(); // listę lotów obsługiwanych przez dane lotnisko
            flights.add(new Flight("Madryt", "Warszawa"));
            flights.add(new Flight("Madryt", "Barcelona"));
            flights.add(new Flight("Madryt", "Berlin"));
            flights.add(new Flight("Madryt", "Lizbona"));
            flights.add(new Flight("Madryt", "Moskwa"));
            return flights;
        }
    }

