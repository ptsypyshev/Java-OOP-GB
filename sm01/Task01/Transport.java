package sm01.Task01;

public class Transport {
    private String color;
    private String model;
    private int wheels;
    private int weight;
    private int speed;
    protected String type;

    protected Transport(String color, String model, int wheels, int weight, int speed) {
        this.color = color;
        this.model = model;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }

    // public String getColor() {
    //     return this.color;
    // }

    public String getModel() {
        return this.model;
    }

    // public int getWheels() {
    //     return this.wheels;
    // }

    // public int getWeight() {
    //     return this.weight;
    // }

    // public int getSpeed() {
    //     return this.speed;
    // }

    public String getType() {
        return this.type;
    }

    // public void drive() {
    //     System.out.println("Need to implement drive method");
    // }

    public void drive() {
        if (this.type == null) {
            System.out.println("Need to implement drive method");    
        } else {
            System.out.printf("The %s %s is going now\n", this.getType(), this.getModel());
        }        
    }

    @Override
    public String toString() {
        return String.format("Type: %s, Model: %s, Color: %s, Wheels: %d, Weight: %d, Speed: %d",
         this.type, this.model, this.color, this.wheels, this.weight, this.speed);
    }
    

    
}
