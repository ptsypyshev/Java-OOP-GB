package hw01;

/**
 * Class for Pacifier Products which extends BabyProducts class
 */
public class Pacifier extends BabyProducts{
    /**
     * Constructor for Pacifier class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param minAgeLimit       The minimum age limitation for the Product usage
     * @param Hypoallergenicity The hypoallergenicity of Product
     */
    public Pacifier(String name, double price, int qty, String unitOfMeasure, int minAgeLimit, boolean Hypoallergenicity) {
        super(name, price, qty, unitOfMeasure, minAgeLimit, Hypoallergenicity);
    }
    
    @Override
    public String toString() {
        return String.format(
            "Pacifier - %s",
            super.toString()
        );
    }
}
