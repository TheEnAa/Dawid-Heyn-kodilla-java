package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrive() {
        Product product = new Product("Male boots air max size 44");
        User user = new User("Dariusz", "Nowak");
        LocalDateTime orderDate = LocalDateTime.of(2017, 9, 6, 15, 16);

        return new OrderRequest(product, user, orderDate);
    }
}