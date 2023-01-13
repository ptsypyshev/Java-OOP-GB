package hw01;

public class Product {
    private String name;
    private double price;
    private int qty;
    private String unitOfMeasure;

    protected Product(String name, double price, int qty, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Name: %s, Price: %.2f, QTY: %d, UoM: %s",
            this.getName(), this.getPrice(), this.getQty(), this.getUnitOfMeasure()
            );
    }
}
