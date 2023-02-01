package hw06.models.animals.wilds;

import java.util.Date;

/**
 * Tiger is a class inherited from classes Animal -> WildAnimal
 */
public class Tiger extends WildAnimal{
    /**
     * It is a constructor for Tiger class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param habitat           The habitat of animal
     * @param foundDate         The found date of animal
     */
    public Tiger(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor, habitat, foundDate);
    }

    @Override
    public String sound() {
        return "R-O-O-O-O-A-R-R-R-R!";
    }

    @Override
    public String toString() {
        return String.format("Tiger (%s)", super.toString());
    }
}
