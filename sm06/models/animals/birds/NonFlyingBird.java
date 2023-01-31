package sm06.models.animals.birds;

public abstract class NonFlyingBird extends Bird {

    protected NonFlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    public abstract String sound();
}
