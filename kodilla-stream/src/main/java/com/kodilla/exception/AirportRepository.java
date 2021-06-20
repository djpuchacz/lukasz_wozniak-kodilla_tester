package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("Las Palmas", true);
        airports.put("Warsaw", true);
        return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        /*throws ... oznacza że nasza metoda może rzucać wyjątkiem, obsługa
        wyjątku zostanie przeniesiona do miejsca w którym metoda isAirportInUse( in use będzie wywoływana)
        */

        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }

}
