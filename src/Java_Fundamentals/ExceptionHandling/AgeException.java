package Java_Fundamentals.ExceptionHandling;

// User-defined Exception class
public class AgeException extends Exception {

    // Constructor to pass the exception message
    public AgeException(String message) {
        super(message);
    }
}