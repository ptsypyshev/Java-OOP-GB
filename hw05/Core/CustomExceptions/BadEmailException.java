package hw05.Core.CustomExceptions;

/**
 * Custom Exception throws when email is not valid
 */
public class BadEmailException extends Exception{
    public BadEmailException() {
        super("You entered bad email address");
    }
}
