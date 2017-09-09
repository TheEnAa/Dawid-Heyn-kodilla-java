package com.kodilla.good.patterns.challenges.Airlines;

import java.util.Set;
import java.util.stream.Collectors;

public final class FindTo {
    private final FlightList flightList = new FlightList();

    public Set<Flight> getFlightsTo(String toCity) {
        return flightList.getList().stream()
                .filter(f -> f.getTo().equals(toCity))
                .collect(Collectors.toSet());
    }
}