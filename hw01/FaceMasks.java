package hw01;

/**
 * Class for FaceMasks Products which extends HygieneProducts class
 */
public class FaceMasks extends HygieneProducts{
    /**
     * Constructor for Eggs class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param qtyPerPack    The quantity per package of the Product
     */
    public FaceMasks(String name, double price, int qty, String unitOfMeasure, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, qtyPerPack);
    }

    @Override
    public String toString() {
        return String.format(
            "FaceMask - %s",
            super.toString()
        );
    }
}
