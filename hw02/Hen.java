package hw02;

/**
 * Hen is a class inherited from classes Animal -> Bird
 */
public class Hen extends Bird{
    /**
     * It is a constructor for Hen class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param flightAltitude    The flight altitude of animal
     */
    public Hen(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    @Override
    public void sound() {
        System.out.println("Cluck-cluck!");
    }

    @Override
    public String toString() {
        return String.format("Hen (%s)", super.toString());
    }
}
