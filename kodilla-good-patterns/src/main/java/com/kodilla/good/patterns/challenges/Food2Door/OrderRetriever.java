package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;


public class OrderRetriever {
    public Order retrieve() {
        Product productOne = new Product("Carrot",1.01,true);
        double quantity = 2.0;
        Customer customerOne = new Customer("Jan","Jankowski");
        LocalDateTime date = LocalDateTime.of(2017,9,7,16,20);
        return new Order(productOne,quantity,customerOne,date);


    }
}
