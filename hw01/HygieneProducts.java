package hw01;

/**
 * Class for HygieneProducts Products which extends base Product class
 */
public class HygieneProducts extends Product{
    private int qtyPerPack;

    /**
     * Constructor for HygieneProducts class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param qtyPerPack    The quantity per package of the Product
     */
    protected HygieneProducts(String name, double price, int qty, String unitOfMeasure, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure);
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
            "%s, QTY per Package: %d",
            super.toString(), 
            this.getQtyPerPack()
        );
    }
}
