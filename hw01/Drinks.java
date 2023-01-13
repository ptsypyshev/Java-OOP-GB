package hw01;

public class Drinks extends Product{
    private int volumeML;

    public int getVolumeML() {
        return this.volumeML;
    }

    protected Drinks(String name, double price, int qty, String unitOfMeasure, int volumeML) {
        super(name, price, qty, unitOfMeasure);
        this.volumeML = volumeML;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Volume in MilliLiters: %d",
            super.toString(), 
            this.getVolumeML()
        );
    }
}
