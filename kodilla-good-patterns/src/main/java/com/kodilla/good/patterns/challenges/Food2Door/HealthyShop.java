package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer {
    private List<Product> products = new ArrayList();

    public HealthyShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        if(product.getAvailable() == true) {
            System.out.println("Ordered product: " + product.getName() + " in Healthy Shop. Product price " +
                    product.getPrice() + " PLN per one unit");
        }
        else {
            System.out.println("Sorry, this product is not available at this moment.");
        }

    }
}
