package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static void exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int a = 0;
        int takeValue = 0;
        for (int n=0; n < numbers.size(); n++){
            takeValue = numbers.get(n);
            if(takeValue % 2 == 0) {
                newList.add(a++);
            }

        }
    }
}
