package hw01;

public class Diapers extends BabyProducts{
    public static enum DiapersTypes {
        REGULAR_DIAPERS,
        NIGHT_DIAPERS,
        DIAPERS_PANTS
    }

    private int size;
    private int minWeight;
    private int maxWeight;
    private DiapersTypes type;

    public Diapers(String name, double price, int qty, String unitOfMeasure, int minAgeLimit, boolean Hypoallergenicity, int size, int minWeight, int maxWeight, DiapersTypes type) {
        super(name, price, qty, unitOfMeasure, minAgeLimit, Hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getSize() {
        return this.size;
    }

    public int getMinWeight() {
        return this.minWeight;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

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
