package hw03;

import hw03.FigureExceptions.InvalidLengthException;

/**
 * Class of Rectangle figures
 */
public class Rectangle extends Polygon {
    /**
     * It is a constructor for Rectangle class
     * @param length                    the length of rectangle
     * @param width                     the width of rectangle
     * @throws InvalidLengthException   if any of sides <= 0
     */
    public Rectangle(double length, double width) throws InvalidLengthException {
        super(new double[] { length, width, length, width });
    }

    @Override
    public Double getArea() {
        return this.sides[0] * this.sides[1];
    }
}
