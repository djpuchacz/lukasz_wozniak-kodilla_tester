package com.kodilla.collections.adv.exercises.homework;

import java.util.*; //co to jest ?

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> departures = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) //porównanie obiektów
                departures.add(flight);
        }
        return departures;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> arrivals = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) //porównanie obiektów
                arrivals.add(flight);
        }
        return arrivals;

    }

}
