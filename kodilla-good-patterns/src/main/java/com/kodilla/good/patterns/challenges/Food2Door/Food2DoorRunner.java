package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorRunner {
    public static void main(String[] args) {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Carrot", 1.01,true));
        theList.add(new Product("Potatoes", 0.5,true));
        theList.add(new Product("Cauliflower", 2.1,false));
        theList.add(new Product("Vegetable Oil", 5.2,true));
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(theList);
        OrderProcessor orderProcessor = new OrderProcessor(glutenFreeShop);
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        orderProcessor.process(order);
        System.out.println("Customer: " + order.getCustomer() + ". Order: " + order.getProduct() + ". Order value: "
            + order.getValue());
    }
}

