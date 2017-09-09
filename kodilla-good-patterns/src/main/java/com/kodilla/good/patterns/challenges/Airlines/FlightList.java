package com.kodilla.good.patterns.challenges.Airlines;

import java.util.HashSet;
import java.util.Set;

public final class FlightList {
    private final Set<Flight> list = new HashSet<>();
    public FlightList() {
        list.add(new Flight("Katowice","Kraków"));
        list.add(new Flight("Katowice","Warszawa"));
        list.add(new Flight("Katowice","Gdańsk"));
        list.add(new Flight("Kraków","Warszawa"));
        list.add(new Flight("Kraków","Katowice"));
        list.add(new Flight("Kraków","Gdańsk"));
        list.add(new Flight("Warszawa","Katowice"));
        list.add(new Flight("Warszawa","Gdańsk"));
        list.add(new Flight("Warszawa","Kraków"));
        list.add(new Flight("Gdańsk","Kraków"));
        list.add(new Flight("Gdańsk","Warszawa"));
        list.add(new Flight("Gdańsk","Katowice"));
    }
    public Set<Flight> getList() {
        return new HashSet<>(list);
    }
}