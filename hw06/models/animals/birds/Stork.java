package hw06.models.animals.birds;

/**
 * Stork is a class inherited from classes Animal -> Bird -> FlyingBird
 */
public class Stork extends FlyingBird{
    /**
     * It is a constructor for Stork class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param feathersColor     The feathers color of bird
     * @param flightAltitude    The flight altitude of animal
     */
    public Stork(double height, double weight, String eyeColor, String feathersColor, int flightAltitude) {
        super(height, weight, eyeColor, feathersColor,flightAltitude);
    }

    /**
     * It is a constructor for Stork class (altitude will be zero)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param feathersColor     The feathers color of bird
     */
    public Stork(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return ".....";
    }

    @Override
    public String toString() {
        return String.format("Stork (%s)", super.toString());
    }
}
