package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double add = calculator.add(21.0, 55.0);
        double sub = calculator.sub(50.0, 14.0);
        double mul = calculator.mul(13.0, 5.0);
        double div = calculator.div(10.00, 2.50);
        Assert.assertEquals(76.0,add,0);
        Assert.assertEquals(36.0,sub,0);
        Assert.assertEquals(65.0,mul,0);
        Assert.assertEquals(4.0,div,0);
    }
}