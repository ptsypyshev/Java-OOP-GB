package hw01;

public class ToiletPaper extends HygieneProducts{
    private int numberOfLayers;

    public ToiletPaper(String name, double price, int qty, String unitOfMeasure, int qtyPerPack, int numberOfLayers) {
        super(name, price, qty, unitOfMeasure, qtyPerPack);
        this.numberOfLayers = numberOfLayers;
    }

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
