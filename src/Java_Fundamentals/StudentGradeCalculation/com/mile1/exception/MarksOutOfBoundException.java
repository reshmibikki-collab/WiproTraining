package com.mile1.exception;

public class MarksOutOfBoundException extends Exception {

    public MarksOutOfBoundException() {
        super("Marks should be between 0 and 100");
    }
}