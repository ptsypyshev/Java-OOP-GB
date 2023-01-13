package sm01.Task01;

public class Motorbike extends Transport{
    public Motorbike(String color, String model, int wheels, int weight, int speed) {
        super(color, model, wheels, weight, speed);
        this.type = "Motorbike";
    }    

    @Override
    public void drive() {
        super.drive();
        System.out.printf("Some other implementations for %s \n", this.getType());
    }
}
