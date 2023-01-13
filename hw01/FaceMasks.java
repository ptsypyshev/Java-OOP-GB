package hw01;

public class FaceMasks extends HygieneProducts{
    public FaceMasks(String name, double price, int qty, String unitOfMeasure, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, qtyPerPack);
    }

    @Override
    public String toString() {
        return String.format(
            "FaceMask - %s",
            super.toString()
        );
    }
}
