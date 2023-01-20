package sm03;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void getPerimeters(List<Figure> figures) {
        for (Figure figure : figures) {
            if (figure instanceof Perimetrable) {
                System.out.printf("perimeter: %.2f\n", ((Perimetrable) figure).getPerimeter());
            }            
        }
    }

    public static void getSquares(List<Figure> figures) {
        for (Figure figure : figures) {
            System.out.printf("square: %.2f\n", figure.getSquare());
        }
    }
    
    public static void main(String[] args) {
        Figure rect1 = new Rectangle(2, 3);
        // System.out.printf("Rect square: %.2f\n", rect1.getSquare());
        // System.out.printf("Rect perimeter: %.2f\n", ((Perimetrable) rect1).getPerimeter());        

        Figure sq1 = new Square(5);
        // System.out.printf("Square square: %.2f\n",sq1.getSquare());
        // System.out.printf("Square perimeter: %.2f\n", ((Perimetrable) sq1).getPerimeter());

        Figure triangle1 = new Triangle(3, 4, 5);
        // System.out.printf("Triangle square: %.2f\n",triangle1.getSquare());
        // System.out.printf("Triangle perimeter: %.2f\n", ((Perimetrable) triangle1).getPerimeter());

        List<Figure> figures = new ArrayList<Figure>();
        figures.add(triangle1);
        figures.add(sq1);
        figures.add(rect1);
        getPerimeters(figures);
        getSquares(figures);
    }
}
