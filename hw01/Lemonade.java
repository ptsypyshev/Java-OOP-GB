package hw01;

/**
 * Class for Lemonade Products which extends Drinks class
 */
public class Lemonade extends Drinks{
    /**
     * Constructor for Eggs class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param volumeML      The volume of the Product in millilitres
     */
    public Lemonade(String name, double price, int qty, String unitOfMeasure, int volumeML) {
        super(name, price, qty, unitOfMeasure, volumeML);
    }

    @Override
    public String toString() {
        return String.format(
            "Lemonade - %s",
            super.toString()
        );
    }
}
