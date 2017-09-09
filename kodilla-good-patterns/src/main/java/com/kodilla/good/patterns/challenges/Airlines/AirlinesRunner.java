package com.kodilla.good.patterns.challenges.Airlines;

import java.util.Set;

public class AirlinesRunner {
    public static void main(String[] args) {
        FindFrom findFrom = new FindFrom();
        System.out.println("All flights from Warszawa: ");
        Set<Flight> searchFlightFrom = findFrom.getFlightsFrom("Warszawa");
        System.out.println(searchFlightFrom);

        FindTo findTo = new FindTo();
        System.out.println("All flights to Katowice: ");
        Set<Flight> searchFlightTo = findTo.getFlightsTo("Katowice");
        System.out.println(searchFlightTo);

        FindFromByTo findFromToBy = new FindFromByTo();
        System.out.println("All flights from Gdańsk by Warszawa to Katowice: ");
        Set<Flight> searchFlightFromByTo = findFromToBy.findFlightFromByTo("Gdańsk", "Warszawa", "Katowice");
        System.out.println(searchFlightFromByTo);
    }
}