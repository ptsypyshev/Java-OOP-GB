package hw03;

import hw03.FigureExceptions.InvalidLengthException;

/**
 * Class of Circle figures
 */
public class Circle extends Figure implements CircleLengthable {
    private double radius;

    /**
     * Returns the Circle radius
     * @return  this.radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * It is a constructor for Circle class
     * @param radius                    the Circle radius
     * @throws InvalidLengthException   if the Circle radius <= 0
     */
    public Circle(double radius) throws InvalidLengthException {
        if (radius <= 0) {
            throw new InvalidLengthException(radius);
        }
        this.radius = radius;
    }

    @Override
    public double getCircleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("%s with radius %.2f and square %.2f\n", this.getClass().getSimpleName(), this.getRadius(),
                this.getArea());
    }
}
