package hw01;

/**
 * Class for Drinks Products which extends BabyProducts class
 */
public class Drinks extends Product{
    private int volumeML;

    /**
     * Constructor for Drinks class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param volumeML          The volume of the Product in millilitres
     */
    protected Drinks(String name, double price, int qty, String unitOfMeasure, int volumeML) {
        super(name, price, qty, unitOfMeasure);
        this.volumeML = volumeML;
    }

    /**
     * Returns the volume of the Product in millilitres
     * @return this.volumeML
     */
    public int getVolumeML() {
        return this.volumeML;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Volume in MilliLiters: %d",
            super.toString(), 
            this.getVolumeML()
        );
    }
}
