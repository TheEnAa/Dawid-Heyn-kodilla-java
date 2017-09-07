package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(Product product, User user, LocalDateTime dateOrder) {
        System.out.println("Product: " + product.getName() + " , ordered by: " + user.getName() + " " + user.getSurname()
                + ". Date of order: " + dateOrder.toString());
        return true;
    }
}
