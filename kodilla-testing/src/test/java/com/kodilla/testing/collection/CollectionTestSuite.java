package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Start Case Test");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Start Suite Test");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("End Suite Test");
    }
    @After
    public void end() {
        System.out.println("End Case Test");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        exterminate(emptyList);
        System.out.println("List size: " + emptyList.size());
        Assert.assertEquals(0,emptyList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){

        ArrayList<Integer> normalList = new ArrayList<Integer>();
        System.out.println("List size: " + normalList.size() );
        for(int n=0; n < 100; n++) {
            normalList.add(n);

        }
        ArrayList<Integer> result = exterminate(normalList);
        System.out.println("List size after exterminate: " + result.size() );
        Assert.assertEquals(50,result.size());
    }
}
