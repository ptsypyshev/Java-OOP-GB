package hw03.FigureExceptions;

/**
 * Custom exception throws if the triangle does not exist
 */
public class InvalidTriangleSidesException extends Exception{
    public InvalidTriangleSidesException(){
        super(String.format("Invalid sides was given - the triangle does not exist"));
    }
}
