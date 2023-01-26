package hw01;

/**
 * Class for ToiletPaper Products which extends HygieneProducts class
 */
public class ToiletPaper extends HygieneProducts{
    private int numberOfLayers;

    /**
     * Constructor for ToiletPaper class instances
     * @param name              The name of Product
     * @param price             The price of Product
     * @param qty               The quantity of Product
     * @param unitOfMeasure     The unit of measure for the Product
     * @param qtyPerPack        The quantity per package of the Product
     * @param numberOfLayers    The number of layers of the Product
     */
    public ToiletPaper(String name, double price, int qty, String unitOfMeasure, int qtyPerPack, int numberOfLayers) {
        super(name, price, qty, unitOfMeasure, qtyPerPack);
        this.numberOfLayers = numberOfLayers;
    }

    /**
     * Returns the number of layers of the Product
     * @return this.numberOfLayers
     */
    public int getNumberOfLayers() {
        return this.numberOfLayers;
    }

    @Override
    public String toString() {
        return String.format(
            "ToiletPaper - %s, Number of Layers: %d",
            super.toString(), 
            this.getNumberOfLayers()
        );
    }
}
