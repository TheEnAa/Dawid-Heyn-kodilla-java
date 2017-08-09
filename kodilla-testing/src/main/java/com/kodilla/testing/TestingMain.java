package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator(5,10);

        if(calculator.getAdd() == 5 + 10){
            System.out.println("Ok");
        }
        else {
            System.out.println("Error");
        }
        if(calculator.getSubtract() == 5 - 10){
            System.out.println("Ok");
        }
        else {
            System.out.println("Error");
        }
    }
}