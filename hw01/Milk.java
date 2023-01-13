package hw01;

import java.util.Date;

public class Milk extends Foods{
    private double FatnessPercentage;    

    public Milk(String name, double price, int qty, String unitOfMeasure, String ExpDate, double FatnessPercentage) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FatnessPercentage = FatnessPercentage;
    }

    public Milk(String name, double price, int qty, String unitOfMeasure, Date ExpDate, double FatnessPercentage) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FatnessPercentage = FatnessPercentage;
    }

    public double getFatnessPercentage() {
        return this.FatnessPercentage;
    }

    @Override
    public String toString() {
        return String.format(
            "Milk - %s, Fatness Percentage: %.1f",
            super.toString(), 
            this.getFatnessPercentage()
        );
    }
}
