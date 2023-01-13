package hw01;

import java.util.Date;

public class Eggs extends Foods{
    private int qtyPerPack;

    public Eggs(String name, double price, int qty, String unitOfMeasure, String ExpDate, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.qtyPerPack = qtyPerPack;
    }

    public Eggs(String name, double price, int qty, String unitOfMeasure, Date ExpDate, int qtyPerPack) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.qtyPerPack = qtyPerPack;
    }

    public int getQtyPerPack() {
        return this.qtyPerPack;
    }

    @Override
    public String toString() {
        return String.format(
            "Eggs - %s, QTY per Package: %d",
            super.toString(), 
            this.getQtyPerPack()
        );
    }
}
