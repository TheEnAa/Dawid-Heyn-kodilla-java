package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public Double add(double a, double b) {
        Double sum = a + b;
        display.displayValue(sum);
        return sum;
    }
    public Double sub(double a, double b) {
        Double difference = a - b;
        display.displayValue(difference);
        return difference;
    }
    public Double mul(double a, double b) {
        Double product = a * b;
        display.displayValue(product);
        return product;
    }
    public Double div (double a, double b) {
        Double quotient = a / b;
        display.displayValue(quotient);
        return quotient;
    }
}