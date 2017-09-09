package com.kodilla.good.patterns.challenges.Airlines;

import java.util.Set;
import java.util.stream.Collectors;

public final class FindFrom {
    private final FlightList flightList = new FlightList();

    public Set<Flight> getFlightsFrom(String fromCity) {
        return flightList.getList().stream()
                .filter(f -> f.getFrom().equals(fromCity))
                .collect(Collectors.toSet());
    }
}
