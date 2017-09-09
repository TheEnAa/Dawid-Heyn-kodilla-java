package com.kodilla.good.patterns.challenges.Airlines;

import java.util.HashSet;
import java.util.Set;

public final class FindFromByTo {
    private final FlightList flightList = new FlightList();

    public Set<Flight> findFlightFromByTo(String fromCity, String byCity, String toCity) {

        Flight firstFlight = flightList.getList().stream()
                .filter(f -> f.getFrom().equals(fromCity))
                .filter(f -> f.getTo().equals(byCity))
                .findFirst().get();
        Flight secondFlight = flightList.getList().stream()
                .filter(f -> f.getFrom().equals(byCity))
                .filter(f -> f.getTo().equals(toCity))
                .findFirst().get();
        HashSet<Flight> flight = new HashSet<>();
        flight.add(firstFlight);
        flight.add(secondFlight);
        return flight;
    }
}

