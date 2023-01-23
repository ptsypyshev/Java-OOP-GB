package hw03.FigureExceptions;

/**
 * Custom exception throws if received invalid length of side or radius 
 */
public class InvalidLengthException extends Exception{
    public InvalidLengthException(double length){
        super(String.format("Invalid length %.2f was given", length));
    }
}
