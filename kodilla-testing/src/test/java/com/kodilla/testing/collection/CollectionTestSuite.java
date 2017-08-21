package com.kodilla.testing.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        exterminate(emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int n=0; n < 200; n++) {
            normalList.add(theGenerator.nextInt(100));
        }
        exterminate(normalList);
    }
}
