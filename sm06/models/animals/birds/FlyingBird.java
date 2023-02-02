package sm06.models.animals.birds;

import sm06.models.interfaces.Flier;

/**
 * Bird is an abstract class inherited from base Animal class
 */
public abstract class FlyingBird extends Bird implements Flier{
    protected int flightAltitude;

    /**
     * It is a constructor for Bird class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param flightAltitude    The flight altitude of animal
     */
    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor, int flightAltitude) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = flightAltitude;
    }

    /**
     * It is a constructor for Bird class (altitude will be zero)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     */
    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = 0;
    }

    /**
     * Returns the flight altitude of animal
     * @return this.flightAltitude
     */
    public int getFlightAltitude() {
        return this.flightAltitude;
    }

    /**
     * Makes animal fly
     */
    public String fly() {
        return String.format("I'm flying at %d meters\n", this.getFlightAltitude());
    }

    @Override
    public String toString() {
        return String.format("%s, Flight altitude: %s", super.toString(), this.getFlightAltitude());
    }
}
