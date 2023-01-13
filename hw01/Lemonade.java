package hw01;

public class Lemonade extends Drinks{
    public Lemonade(String name, double price, int qty, String unitOfMeasure, int volumeML) {
        super(name, price, qty, unitOfMeasure, volumeML);
    }

    @Override
    public String toString() {
        return String.format(
            "Lemonade - %s",
            super.toString()
        );
    }
}
