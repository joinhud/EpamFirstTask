package com.epam.first.action;

import com.epam.first.entity.Circle;
import com.epam.first.entity.Point;
import com.epam.first.exceptions.CircleLogicException;
import org.junit.Assert;
import org.junit.Test;

public class CircleActionTest {
    @Test
    public void chekCircleTestTrue() {
        Circle c = new Circle(new Point(2, 2), 4);
        CircleAction action = new CircleAction();
        boolean actual = action.chekCircle(c);
        Assert.assertTrue(actual);
    }

    @Test
    public void chekCircleTestFalse() {
        Circle c = new Circle(new Point(2, 2), -1);
        CircleAction action = new CircleAction();
        boolean actual = action.chekCircle(c);
        Assert.assertFalse(actual);
    }

    @Test
    public void chekCrossAxisByValueTrue() throws CircleLogicException {
        Circle c = new Circle(new Point(4, 2), 4);
        CircleAction action = new CircleAction();
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void chekCrossAxisByValueFalse() throws CircleLogicException {
        Circle c = new Circle(new Point(4, 2), 3);
        CircleAction action = new CircleAction();
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertFalse(actual);
    }

    @Test
    public void chekCrossAxisByValueBothTest() throws CircleLogicException {
        Circle c = new Circle(new Point(2, 2), 4);
        CircleAction action = new CircleAction();
        boolean actual = action.chekCrossAxisByValue(c, 2);
        Assert.assertFalse(actual);
    }
}