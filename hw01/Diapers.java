package hw01;

/**
 * Class for Diapers Products which extends BabyProducts class
 */
public class Diapers extends BabyProducts{
    /**
     * Enumeration for Diapers types
     */
    public static enum DiapersTypes {
        REGULAR_DIAPERS,
        NIGHT_DIAPERS,
        DIAPERS_PANTS
    }

    private int size;
    private int minWeight;
    private int maxWeight;
    private DiapersTypes type;

    /**
     * Constructor for Diapers class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param minAgeLimit       The minimum age limitation for the Product usage
     * @param Hypoallergenicity The hypoallergenicity of Product
     * @param size              The size of Product
     * @param minWeight         The minimal weight of child which the Product fits
     * @param maxWeight         The maximal weight of child which the Product fits
     * @param type              The type of Product
     */
    public Diapers(String name, double price, int qty, String unitOfMeasure, int minAgeLimit, boolean Hypoallergenicity, int size, int minWeight, int maxWeight, DiapersTypes type) {
        super(name, price, qty, unitOfMeasure, minAgeLimit, Hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    /**
     * Returns the Diapers size
     * @return  this.size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Returns the minimal weight of child which the Product fits
     * @return  this.minWeight
     */
    public int getMinWeight() {
        return this.minWeight;
    }

    /**
     * Returns the maximal weight of child which the Product fits
     * @return  this.maxWeight
     */
    public int getMaxWeight() {
        return this.maxWeight;
    }

    /**
     * Returns the Diapers type
     * @return  this.type
     */
    public DiapersTypes getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format(
            "Diapers - %s, Size: %d, Min weight: %d, Min weight: %d, Type: %s",
            super.toString(), 
            this.getSize(),
            this.getMinWeight(),
            this.getMaxWeight(),
            this.getType()
        );
    }
}
