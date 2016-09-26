package com.epam.first.exception;

public class CircleLogicException extends Exception {
    public CircleLogicException() {
    }

    public CircleLogicException(String message) {
        super(message);
    }

    public CircleLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public CircleLogicException(Throwable cause) {
        super(cause);
    }
}
