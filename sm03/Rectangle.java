package sm03;

public class Rectangle extends Polygon {
    // public Rectangle(double length, double width) throws Exception {
    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});
        // if (false) {
        //     throw new Exception("test exception");
        // }   
    }

    @Override
    public double getSquare() {
        return this.sides[0] * this.sides[1];
    }    
}
