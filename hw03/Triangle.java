package hw03;

import hw03.FigureExceptions.InvalidLengthException;
import hw03.FigureExceptions.InvalidTriangleSidesException;

/**
 * Class of Triangle figures
 */
public class Triangle extends Polygon {
    /**
     * It is a constructor for Triangle class
     * @param a                                 the side A
     * @param b                                 the side B
     * @param c                                 the side C
     * @throws InvalidLengthException           if any of sides <= 0
     * @throws InvalidTriangleSidesException    if the triangle does not exist
     */
    public Triangle(double a, double b, double c) throws InvalidLengthException, InvalidTriangleSidesException {
        super(new double[]{a, b, c});
        double sum = a + b + c;
        for (double side : sides) {            
            if (side >= sum - side) { // If we wanna use only non-degenerate triangles
            // if (side > sum - side) { // If we wanna use degenerate triangles too (zero areas triangle)
                throw new InvalidTriangleSidesException();
            }
        }
    }

    /**
     * It is a constructor for Triangle class
     * @param sides                             Array of sides length
     * @throws InvalidLengthException           if any of sides <= 0
     * @throws InvalidTriangleSidesException    if the triangle does not exist
     */
    public Triangle(double[] sides) throws InvalidLengthException, InvalidTriangleSidesException {
        super(sides);
        if (sides.length != 3) {
            throw new InvalidTriangleSidesException();
        }
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        
        for (double side : sides) {            
            if (side >= sum - side) { // If we wanna use only non-degenerate triangles
            // if (side > sum - side) { // If we wanna use degenerate triangles too (zero areas triangle)
                throw new InvalidTriangleSidesException();
            }
        }
    }

    @Override
    public Double getArea() {
        double p = this.getPerimeter() / 2;
        double a = this.sides[0];
        double b = this.sides[1];
        double c = this.sides[2];
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}
