package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producer {
    private List<Product> products = new ArrayList();

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        if(product.getAvailable() == true)
            System.out.println("You ordered in Extra Food Shop: " + product.getName() + ". Price: " +
                    product.getPrice() + " PLN per one ");
        else {
            System.out.println("Sorry, we haven't this product at this moment.");
        }
    }
}
