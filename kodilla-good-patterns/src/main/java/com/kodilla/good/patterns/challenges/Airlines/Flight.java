package com.kodilla.good.patterns.challenges.Airlines;

public final class Flight {
    private final String from;
    private final String to;

    public Flight(final String from,final String to) {
        this.from = from;
        this.to = to;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        if (!from.equals(flight.from)) return false;
        return to.equals(flight.to);
    }
    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Flight from " + getFrom() + " to " + getTo() ;
    }
}