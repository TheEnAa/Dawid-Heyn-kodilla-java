package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                newList.add(number);
            }
        }
        return newList;
    }
}
