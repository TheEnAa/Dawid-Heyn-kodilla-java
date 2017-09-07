package com.kodilla.good.patterns.challenges.Food2Door;

public class Customer {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
