package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Order {
    private Product product;
    private double quantity;
    private Customer customer;
    private LocalDateTime date;
    private boolean isProcessed;

    public Order(Product product, double quantity, Customer customer, LocalDateTime date) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
        this.isProcessed = false;
    }
    public Product getProduct() {
        return product;
    }
    public double getQuantity() {
        return quantity;
    }
    public Customer getCustomer() {
        return customer;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public boolean isProcessed() {
        return isProcessed;
    }
    public double getValue() {
        return product.getPrice() * quantity;
    }
    public  void setProcessed(boolean processed) {
        isProcessed = processed;
    }
}
