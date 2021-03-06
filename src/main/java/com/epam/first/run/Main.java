package com.epam.first.run;

import com.epam.first.action.CircleAction;
import com.epam.first.entity.Circle;
import com.epam.first.entity.Point;
import com.epam.first.exception.CircleLogicException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getRootLogger();

    public static void main(String args[]) {
        LOG.info("Application start.");

        Circle c = new Circle(new Point(0, 4), -1);
        CircleAction action = new CircleAction();
        LOG.info("CircleAction object created.");
        try {
            action.calculateSquare(c);
        } catch (CircleLogicException e) {
            LOG.error("CircleLogicException in Main class, method main().", e);
        }

        LOG.info("Application finished.");
    }
}
