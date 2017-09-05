package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.0,1.0);
        }
        catch (Exception e) {
            System.out.println("Sorry, something went wrong");
        }
        finally {
            System.out.println("Goodbye");
        }
    }
}
