package hw03;

/**
 * Abstract base class of all figures
 */
public abstract class Figure implements Comparable<Figure> {
    /**
     * Calculates the area of figure
     * @return the area of figure
     */
    public abstract Double getArea();

    public int compareTo(Figure anotherFigure) {
        return this.getArea().compareTo(anotherFigure.getArea());
    }
}
