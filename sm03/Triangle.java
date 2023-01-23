package sm03;

public class Triangle extends Polygon {
    public Triangle(double a, double b, double c) {
        super(new double[]{a, b, c});
    }

    @Override
    public double getSquare() {
        double p = this.getPerimeter() / 2;
        double a = this.sides[0];
        double b = this.sides[1];
        double c = this.sides[2];
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }    
}
