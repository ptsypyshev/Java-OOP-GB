package hw06.models.animals.birds;

/**
 * Hen is a class inherited from classes Animal -> Bird -> NonFlyingBird
 */
public class Hen extends NonFlyingBird{
    /**
     * It is a constructor for Hen class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param flightAltitude    The flight altitude of animal
     */
    public Hen(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return String.format("Cluck-cluck!");
    }

    @Override
    public String toString() {
        return String.format("Hen (%s)", super.toString());
    }
}
