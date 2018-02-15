package com.kodilla.testing.shape;

import java.lang.Math;
import java.util.ArrayList;

import org.junit.*;
import com.kodilla.testing.shape.*;

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
    public void testSquare(){
        Square square = new Square(2);
        Assert.assertEquals(4, square.getField(),0.01);

    }
    @Test
    public void testTriangle(){
        Triangle triangle = new Triangle (2, 2);
        Assert.assertEquals(2, triangle.getField(), 0.01);
    }
    @Test
    public void testCircle(){
        Circle circle = new Circle(2);
        Assert.assertEquals(4*Math.PI, circle.getField(), 0.01);

    }

    @Test
    public void testAddFigure(){
        Triangle triangle = new Triangle(1, 1);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        Assert.assertEquals(1, collector.getShapesQuantity());

    }

    @Test
    public void testRemoveFigureNotExisting(){
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(1);
        boolean result = collector.removeFigure(circle);
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        Circle circle = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        boolean result = collector.removeFigure(circle);
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        Circle circle = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        Shape retrivedFigure = collector.getFigure(0);
        Assert.assertEquals(circle, retrivedFigure);

    }

    @Test
    public void testShowFigures(){
        Circle circle = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        ArrayList<String> figures = collector.showFigures();
        ArrayList<String> expectedFigures = new ArrayList<String>();
        expectedFigures.add("circle");
        Assert.assertEquals(expectedFigures,figures);
    }
}
