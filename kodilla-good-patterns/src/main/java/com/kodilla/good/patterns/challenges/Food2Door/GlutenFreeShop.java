package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producer {
    private List<Product> products = new ArrayList();

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable() == true)
            System.out.println("Product: " + product.getName() + ". Price: " + product.getPrice() +
                    " PLN per one unit. Gluten Free Shop");
        else {
            System.out.println("We can not accept this order, this product is not available.");
        }
    }
}