package com.epam.first.action;


import com.epam.first.entity.Circle;
import com.epam.first.exceptions.CircleLogicException;

import static java.lang.Math.*;

public class CircleAction {

    public boolean chekCircle(Circle circle) {
        return !(circle.getRadius() <= 0);
    }

    public boolean chekCrossAxisByValue(Circle circle, int distance) throws CircleLogicException {
        if(!chekCircle(circle)) {
            throw new CircleLogicException("incorrect radius in Circle object");
        }

        int x = circle.getCenter().getX();
        int y = circle.getCenter().getY();
        int R = circle.getRadius();

        if((abs(x) - R + distance) == 0 ^ (abs(y) - R + distance) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateSquare(Circle circle) throws CircleLogicException {
        if(!chekCircle(circle)) {
            throw new CircleLogicException("incorrect radius in Circle object");
        }

        double result = PI * pow(circle.getRadius(), 2);
        return result;
    }

    public double calculatePerimeter(Circle circle) throws CircleLogicException {
        if(!chekCircle(circle)) {
            throw new CircleLogicException("incorrect radius in Circle object");
        }

        double result = 2 * PI * circle.getRadius();
        return result;
    }
}
