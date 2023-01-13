package hw01;

public class HygieneProducts extends Product{
    private int qtyPerPack;

    protected HygieneProducts(String name, double price, int qty, String unitOfMeasure, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure);
        this.qtyPerPack = qtyPerPack;
    }

    public int getQtyPerPack() {
        return this.qtyPerPack;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, QTY per Package: %d",
            super.toString(), 
            this.getQtyPerPack()
        );
    }
}
