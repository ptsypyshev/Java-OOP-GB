package hw06.models.animals.birds;

import hw06.models.interfaces.Flier;

/**
 * FlyingBird is an abstract class inherited from Bird class and implements Flier interface
 */
public abstract class FlyingBird extends Bird implements Flier{
    protected int flightAltitude;

    /**
     * It is a constructor for FlyingBird class
     * @param height            The height of bird
     * @param weight            The weight of bird
     * @param eyeColor          The eye color of bird
     * @param feathersColor     The feathers color of bird
     * @param flightAltitude    The flight altitude of bird
     */
    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor, int flightAltitude) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = flightAltitude;
    }

    /**
     * It is a constructor for FlyingBird class (altitude will be zero)
     * @param height            The height of bird
     * @param weight            The weight of bird
     * @param eyeColor          The eye color of bird
     */
    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = 0;
    }

    /**
     * Returns the flight altitude of bird
     * @return this.flightAltitude
     */
    public int getFlightAltitude() {
        return this.flightAltitude;
    }

    @Override
    public String fly() {
        return String.format("I'm flying at %d meters\n", this.getFlightAltitude());
    }

    @Override
    public String toString() {
        return String.format("%s, Flight altitude: %s", super.toString(), this.getFlightAltitude());
    }
}
