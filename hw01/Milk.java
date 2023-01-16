package hw01;

import java.util.Date;

/**
 * Class for Milk Products which extends Foods class
 */
public class Milk extends Foods{
    private double FatnessPercentage;    

    /**
     * Constructor for Milk class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param ExpDate           The expiration date of the Product (in String representation)
     * @param FatnessPercentage The fatness percentage of the Product
     */
    public Milk(String name, double price, int qty, String unitOfMeasure, String ExpDate, double FatnessPercentage) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FatnessPercentage = FatnessPercentage;
    }

    /**
     * Constructor for Milk class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param ExpDate           The expiration date of the Product (in Date representation)
     * @param FatnessPercentage The fatness percentage of the Product
     */
    public Milk(String name, double price, int qty, String unitOfMeasure, Date ExpDate, double FatnessPercentage) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FatnessPercentage = FatnessPercentage;
    }

    /**
     * Returns the fatness percentage of the Product
     * @return this.FatnessPercentage
     */
    public double getFatnessPercentage() {
        return this.FatnessPercentage;
    }

    @Override
    public String toString() {
        return String.format(
            "Milk - %s, Fatness Percentage: %.1f",
            super.toString(), 
            this.getFatnessPercentage()
        );
    }
}
