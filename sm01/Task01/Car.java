package sm01.Task01;

public class Car extends Transport {
    public Car(String color, String model, int wheels, int weight, int speed) {
        super(color, model, wheels, weight, speed);
        this.type = "Car";
    }
    
    @Override
    public void drive() {
        super.drive();
        System.out.printf("Some other implementations for %s \n", this.getType());
    }
}
