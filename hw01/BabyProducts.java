package hw01;

public class BabyProducts extends Product {
    private int minAgeLimit;
    private boolean Hypoallergen;

    protected BabyProducts(String name, double price, int qty, String unitOfMeasure, int minAgeLimit, boolean Hypoallergenicity) {
        super(name, price, qty, unitOfMeasure);
        this.minAgeLimit = minAgeLimit;
        this.Hypoallergen = Hypoallergenicity;
    }

    public int getMinAgeLimit() {
        return this.minAgeLimit;
    }

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
