package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();

    @Test
    void testFindFlightsFrom() {
        // given
        String departure = "Madryt";
        //when
       //obiekt dodany w linijce 10
        List<Flight> flights = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals(5, flights.size());

    }

    @Test
    void testFindFlightsTo() {

        assertEquals(1, flightFinder.findFlightTo("Warszawa").size());
    }



}