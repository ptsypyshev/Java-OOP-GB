package hw02;

/**
 * Stork is a class inherited from classes Animal -> Bird
 */
public class Stork extends Bird{
    /**
     * It is a constructor for Stork class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param flightAltitude    The flight altitude of animal
     */
    public Stork(double height, double weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    /**
     * It is a constructor for Stork class (altitude will be zero)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     */
    public Stork(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    @Override
    public void sound() {
        System.out.println(".....");
    }

    @Override
    public String toString() {
        return String.format("Stork (%s)", super.toString());
    }
}
