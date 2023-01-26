package hw03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class which represents collection of figures
 * Realized as Singleton (maybe I'll add another user interface)
 */
public class FigureCollection {
    private static FigureCollection instance = null;
    private List<Figure> figures;

    /**
     * It is a constructor for FigureCollection class
     */
    private FigureCollection() {
        this.figures = new ArrayList<Figure>();
    }

    /**
     * Returns FigureCollection instance (Singleton)
     * @return FigureCollection instance
     */
    public static FigureCollection getInstance() {
        if (instance == null) {
            instance = new FigureCollection();
        }
        return instance;
    }

    /**
     * Returns a list of figures in collection
     * @return  this.figures
     */
    public List<Figure> getFigures() {
        return this.figures;
    }

    /**
     * Prints figure ID and information about all figures in collection
     */
    public void printFigures() {
        for (int i = 0; i < this.getFigures().size(); i++) {
            System.out.printf("%d - %s", i, this.getFigures().get(i));
        }
    }

    /**
     * Checks if the figures list is empty
     * @return      true if the figures list is empty
     */
    public boolean isEmpty() {
        return this.getFigures().size() == 0;
    }

    /**
     * Adds a figure to collection
     * @param figure    any instance of Figure
     */
    public void addFigure(Figure figure) {
        this.figures.add(figure);        
        System.out.println(Msg.figureAddedMsg);
    }

    /**
     * Removes a figure from collection by its ID
     * @param idx       Figure ID in collection
     */
    public void removeFigure(int idx) {
        try {
            this.figures.remove(idx);
            System.out.println(Msg.figureWasRemovedMsg);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(Msg.cannotDoItMsg);
        }        
    }

    /**
     * Changes a figure (by its ID) in collection with another figure
     * @param idx           Figure ID in collection
     * @param figure        any instance of Figure
     */
    public void changeFigure(int idx, Figure figure) {
        try {
            this.figures.set(idx, figure);
            System.out.println(Msg.figureWasChangedMsg);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(Msg.cannotDoItMsg);
        }        
    }

    /**
     * Sorts a figures in collection by area.
     */
    public void sort() {
        Collections.sort(this.getFigures());
    }
}
