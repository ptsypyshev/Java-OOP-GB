package hw01;

import java.util.Date;

public class Bread extends Foods{
    public static enum FlourTypes {
        ALLPURPOSEFLOUR,
        CAKEFLOUR,
        PASTRYFLOUR
    }

    private FlourTypes FlourType;    

    public Bread(String name, double price, int qty, String unitOfMeasure, String ExpDate, FlourTypes FlourType) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FlourType = FlourType;
    }

    public Bread(String name, double price, int qty, String unitOfMeasure, Date ExpDate, FlourTypes FlourType) {
        super(name, price, qty, unitOfMeasure, ExpDate);
        this.FlourType = FlourType;
    }

    public FlourTypes getFlourType() {
        return this.FlourType;
    }

    @Override
    public String toString() {
        return String.format(
            "Bread - %s, Flour type: %s",
            super.toString(), 
            this.getFlourType()
        );
    }    
}
