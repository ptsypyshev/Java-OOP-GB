package hw01;

/**
 * Base Class for Products
 */
public class Product {
    private String name;
    private double price;
    private int qty;
    private String unitOfMeasure;

    /**
     * Constructor for base Product class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     */
    protected Product(String name, double price, int qty, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Returns the name of Product
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    
    /**
     * Returns the price of Product
     * @return this.price
     */public double getPrice() {
        return this.price;
    }

    /**
     * Returns the quantity of Product
     * @return this.qty
     */
    public int getQty() {
        return this.qty;
    }

    /**
     * Returns the unit of measure for the Product
     * @return this.unitOfMeasure
     */
    public String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Name: %s, Price: %.2f, QTY: %d, UoM: %s",
            this.getName(), this.getPrice(), this.getQty(), this.getUnitOfMeasure()
            );
    }
}
