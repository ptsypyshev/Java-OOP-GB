package hw03;

import java.util.Arrays;
import hw03.FigureExceptions.InvalidLengthException;

/**
 * Abstract class of all polygonal figures
 */
public abstract class Polygon extends Figure implements Perimetrable {
    // Sides constants for Polygon objects 
    public static final int TRIANGLE_SIDES = 3;
    
    protected double[] sides;

    /**
     * It is a constructor for Polygon class
     * @param sides                     Array of sides length
     * @throws InvalidLengthException   if any side length <= 0
     */
    public Polygon(double[] sides) throws InvalidLengthException {
        checkSides(sides);
        this.sides = sides;
    }

    /**
     * Returns array of sides length
     * @return  this.sides
     */
    public double[] getSides() {
        return this.sides;
    }

    /**
     * Checks if any side length <= 0
     * @param sides                     Array of sides length
     * @throws InvalidLengthException   if any side length <= 0
     */
    public static void checkSides(double[] sides) throws InvalidLengthException {
        for (double side : sides) {
            if (side <= 0) {
                throw new InvalidLengthException(side);
            }
        }
    }

    /**
     * Implements getPerimeter() method from Perimetrable interface
     */
    public double getPerimeter() {
        double result = 0;
        for (double side : sides) {
            result += side;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s with sides %s and square %.2f\n", this.getClass().getSimpleName(),
                Arrays.toString(this.getSides()), this.getArea());
    }
}
