package hw01;

public class Pacifier extends BabyProducts{
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
