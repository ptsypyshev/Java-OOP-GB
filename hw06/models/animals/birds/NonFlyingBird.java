package hw06.models.animals.birds;

/**
 * NonFlyingBird is an abstract class inherited from Bird class
 */
public abstract class NonFlyingBird extends Bird {
    /**
     * It is a constructor for NonFlyingBird class
     * @param height            The height of bird
     * @param weight            The weight of bird
     * @param eyeColor          The eye color of bird
     * @param feathersColor     The feathers color of bird
     */
    protected NonFlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }
}
