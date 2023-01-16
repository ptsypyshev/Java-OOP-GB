package hw01;

/**
 * Class for Baby Products which extends base Product class
 */
public class BabyProducts extends Product {
    private int minAgeLimit;
    private boolean Hypoallergen;

    /**
     * Constructor for BabyProducts class instances
     * @param name                  The name of Product
     * @param price                 The price of Product
     * @param qty                   The quantity of Product
     * @param unitOfMeasure         The unit of measure for the Product
     * @param minAgeLimit           The minimum age limitation for the Product usage
     * @param Hypoallergenicity     The hypoallergenicity of Product
     */
    protected BabyProducts(String name, double price, int qty, String unitOfMeasure, int minAgeLimit, boolean Hypoallergenicity) {
        super(name, price, qty, unitOfMeasure);
        this.minAgeLimit = minAgeLimit;
        this.Hypoallergen = Hypoallergenicity;
    }

    /**
     * Returns the minimum age limitation for the Product usage
     * @return this.minAgeLimit
     */
    public int getMinAgeLimit() {
        return this.minAgeLimit;
    }

    /**
     * Returns the hypoallergenicity of Product
     * @return this.Hypoallergen
     */
    public boolean isHypoallergen() {
        return this.Hypoallergen;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Min Age Limit (years): %d, is Hypoallergen: %b",
            super.toString(), 
            this.getMinAgeLimit(),
            this.isHypoallergen()
        );
    }
}
