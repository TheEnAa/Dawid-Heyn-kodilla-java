package com.kodilla.exception.test;

public class FilghtExceptionRunner {
    public static void main(String[] args) {
        Flight route = new Flight("Warszawa","Radom");
        Connection connection = new Connection();
        try {
            connection.findFlight(route);
            System.out.println("We got one  available connection from " + route);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Sorry, we don't have that connection.");
        }
        finally {
            System.out.println("Thank you for use our search.");
        }
    }
}
