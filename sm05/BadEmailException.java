package sm05;

public class BadEmailException extends Exception{
    public BadEmailException() {
        super("You entered bad email address");
    }
}
