package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testNumber = 0;
    @BeforeClass
    public static void beforeStartTest() {
        System.out.println("Tests start.");
    }
    @AfterClass
    public static void afterEndTests() {
        System.out.println("All tests end.");
    }
    @Before
    public void beforeEveryTest() {
        testNumber++;
        System.out.println("Start test number:  "+ testNumber);
    }
    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square",5.0);
        shapeCollector.addFigure(square);
        Assert.assertEquals(1, shapeCollector.listSize());

    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle",2.1);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        Assert.assertEquals(0, shapeCollector.listSize());
    }
    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square",2.0);
        Circle circle = new Circle("Circle",2.2);
        Triangle triangle = new Triangle("Trangle",4.0,3.0);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        Shape testFigure = shapeCollector.getFigure(2);
        Assert.assertEquals(testFigure,triangle);
    }

}
