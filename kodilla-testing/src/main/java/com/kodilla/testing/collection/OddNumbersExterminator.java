package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int a = 0;
        int takeValue = 0;
        for (Integer number : numbers) {
            takeValue = number;
            if (takeValue % 2 == 0) {
                newList.add(a++, takeValue);
            }
        }
        return newList;
    }
}
