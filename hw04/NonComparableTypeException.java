package hw04;

/**
 * Custom Exception throws when we try to compare non-comparable types
 */
public class NonComparableTypeException extends Exception{
    public NonComparableTypeException(String type) {
        super(String.format("Type %s is not comparable", type));
    }
}
