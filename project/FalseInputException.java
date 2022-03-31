package project;

/**
 * Custom exception used for when the player gives a false input
 */
public class FalseInputException extends Exception {
    public FalseInputException(String message) {
        super(message);
    }
}