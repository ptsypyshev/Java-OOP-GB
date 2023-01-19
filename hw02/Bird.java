package hw02;

/**
 * Bird is an abstract class inherited from base Animal class
 */
public abstract class Bird extends Animal implements Flier{
    protected int flightAltitude;

    /**
     * It is a constructor for Bird class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param flightAltitude    The flight altitude of animal
     */
    protected Bird(double height, double weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    /**
     * It is a constructor for Bird class (altitude will be zero)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     */
    protected Bird(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
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
    public void fly() {
        System.out.printf("I'm flying at %d meters\n", this.getFlightAltitude());
    }

    @Override
    public String toString() {
        return String.format("%s, Flight altitude: %s", super.toString(), this.getFlightAltitude());
    }
}
