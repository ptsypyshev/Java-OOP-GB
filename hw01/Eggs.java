package hw01;

import java.util.Date;

/**
 * Class for Eggs Products which extends Foods class
 */
public class Eggs extends Foods{
    private int qtyPerPack;

    /**
     * Constructor for Eggs class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in String representation)
     * @param qtyPerPack    The quantity per package of the Product
     */
    public Eggs(String name, double price, int qty, String unitOfMeasure, String ExpDate, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.qtyPerPack = qtyPerPack;
    }

    /**
     * Constructor for Eggs class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in Date representation)
     * @param qtyPerPack    The quantity per package of the Product
     */
    public Eggs(String name, double price, int qty, String unitOfMeasure, Date ExpDate, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.qtyPerPack = qtyPerPack;
    }

    /**
     * Returns the quantity per package of the Product
     * @return this.qtyPerPack
     */
    public int getQtyPerPack() {
        return this.qtyPerPack;
    }

    @Override
    public String toString() {
        return String.format(
            "Eggs - %s, QTY per Package: %d",
            super.toString(), 
            this.getQtyPerPack()
        );
    }
}
