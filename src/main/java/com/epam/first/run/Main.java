package com.epam.first.run;

import com.epam.first.action.CircleAction;
import com.epam.first.entity.Circle;
import com.epam.first.entity.Point;
import com.epam.first.exceptions.CircleLogicException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getRootLogger();

    public static void main(String args[]) {

        Circle c = new Circle(new Point(0, 4), -1);
        CircleAction action = new CircleAction();
        try {
            action.calculateSquare(c);
        } catch (CircleLogicException e) {
            LOG.debug("CircleLogicException in Main class, method main()");
            e.printStackTrace();
        }
    }
}
