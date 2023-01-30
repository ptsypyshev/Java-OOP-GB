package hw05.Core.CustomExceptions;

/**
 * Custom Exception throws when we we read CSV file with invalid data
 */
public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Invalid CSV file specified, cannot load Phonebook");
    }
}
