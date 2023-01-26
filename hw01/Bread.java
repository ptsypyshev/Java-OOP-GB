package hw01;

import java.util.Date;

/**
 * Class for Bread Products which extends Foods class
 */
public class Bread extends Foods{
    /**
     * Enumeration for flour types
     */
    public static enum FlourTypes {
        ALLPURPOSEFLOUR,
        CAKEFLOUR,
        PASTRYFLOUR
    }

    private FlourTypes FlourType;    

    /**
     * Constructor for Bread class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in String representation)
     * @param FlourType     The flour type
     */
    public Bread(String name, double price, int qty, String unitOfMeasure, String ExpDate, FlourTypes FlourType) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FlourType = FlourType;
    }

    /**
     * Constructor for Bread class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in Date representation)
     * @param FlourType     The flour type
     */
    public Bread(String name, double price, int qty, String unitOfMeasure, Date ExpDate, FlourTypes FlourType) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FlourType = FlourType;
    }

    /**
     * Returns the flour type
     * @return this.FlourType
     */
    public FlourTypes getFlourType() {
        return this.FlourType;
    }

    @Override
    public String toString() {
        return String.format(
            "Bread - %s, Flour type: %s",
            super.toString(), 
            this.getFlourType()
        );
    }    
}
