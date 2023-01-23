package hw03.FigureExceptions;

/**
 * Custom exception throws if figure type is not implemented
 */
public class InvalidFigureTypeException extends Exception{
    public InvalidFigureTypeException(){
        super("This figure type is not implemented");
    }
}
