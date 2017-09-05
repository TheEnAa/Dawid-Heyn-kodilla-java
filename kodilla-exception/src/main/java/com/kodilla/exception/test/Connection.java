package com.kodilla.exception.test;

import java.util.HashMap;

public class Connection {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> availableConnection = new HashMap<>();
        availableConnection.put("Katowice",true);
        availableConnection.put("Kraków",true);
        availableConnection.put("Radom",false);
        Boolean possible = availableConnection.get(flight.getArrivalAirport());
        if (possible == null || possible == false) {
            throw new RouteNotFoundException("Sorry, we did not find that route");
        }
        return possible;
    }
}
