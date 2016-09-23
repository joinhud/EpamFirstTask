package com.epam.first.action;

import com.epam.first.entity.Circle;
import com.epam.first.entity.Point;
import com.epam.first.exceptions.CircleLogicException;
import org.junit.*;

public class CircleActionTest {
    private static CircleAction action;
    private Circle c;

    @BeforeClass
    public static void initCircleAction() {
        action = new CircleAction();
    }

    @After
    public void deleteCircleObject() {
        c = null;
    }

    @Test
    public void chekCircleTestTrue() {
        c = new Circle(new Point(2, 2), 4);
        boolean actual = action.chekCircle(c);
        Assert.assertTrue(actual);
    }

    @Test
    public void chekCircleTestFalse() {
        c = new Circle(new Point(2, 2), -1);
        boolean actual = action.chekCircle(c);
        Assert.assertFalse(actual);
    }

    @Test
    public void chekCrossAxisByValueTrue() throws CircleLogicException {
        c = new Circle(new Point(4, 2), 4);
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void chekCrossAxisByValueFalse() throws CircleLogicException {
        c = new Circle(new Point(4, 2), 3);
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertFalse(actual);
    }

    @Test
    public void chekCrossAxisByValueBothTest() throws CircleLogicException {
        c = new Circle(new Point(2, 2), 4);
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertFalse(actual);
    }

    @Test(expected = CircleLogicException.class)
    public void chekCrossAxisByValueWithWrongCircleObject() throws CircleLogicException {
        c = new Circle(new Point(32,-4), -7);
        boolean actual = action.chekCrossAxisByValue(c, 12);
        Assert.assertFalse(actual);
    }

    @Test
    public void calculateSquareLogicTest() throws CircleLogicException {
        Circle c = new Circle(new Point(12, -2), 6);
        double expected = 113.09;
        double actual = action.calculateSquare(c);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test(expected = CircleLogicException.class)
    public void calculateSqureWithWrongCircleTest() throws CircleLogicException {
        c = new Circle(new Point(12, -2), 0);
        action.calculateSquare(c);
    }

    @Test
    public void calculatePerimeterLogicTest() throws CircleLogicException {
        Circle c = new Circle(new Point(12, -2), 6);
        double expected = 37.69;
        double actual = action.calculatePerimeter(c);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test(expected = CircleLogicException.class)
    public void calculatePerimeterWithWrongCircleTest() throws CircleLogicException {
        Circle c = new Circle(new Point(12, -2), -2);
        action.calculatePerimeter(c);
    }
}