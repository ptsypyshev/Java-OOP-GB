package hw03;

import hw03.FigureExceptions.InvalidLengthException;

/**
 * Class of Square figures
 */
public class Square extends Rectangle{
    /**
     * It is a constructor for Rectangle class
     * @param side                      the side of rectangle
     * @throws InvalidLengthException   if side <= 0
     */
    public Square(double side) throws InvalidLengthException {
        super(side, side);
    }
}
