package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    public void testAddShape() {
        //Given
        ShapeCollector sC = new ShapeCollector();
        Shape square = new Square(2, "square");
        Shape circle = new Circle(3, "circle");
        Shape triangle = new Triangle(2, 4, "triangle");

        //When
        sC.addFigure(circle);
        sC.addFigure(square);
        sC.addFigure(triangle);

        //Then
        Assert.assertEquals(3, sC.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sC = new ShapeCollector();
        Shape square = new Square(2, "square");
        Shape circle = new Circle(3, "circle");
        Shape triangle = new Triangle(2, 4, "triangle");

        sC.addFigure(circle);

        //When
        boolean result = sC.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, sC.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector sC = new ShapeCollector();
        Shape square = new Square(2, "square");
        Shape circle = new Circle(3, "circle");
        Shape triangle = new Triangle(2, 4, "triangle");

        sC.addFigure(triangle);

        //When
        Shape retrievedShape;
        retrievedShape = sC.getFigure(0);

        //Then
        Assert.assertEquals(triangle, retrievedShape);
    }
}
