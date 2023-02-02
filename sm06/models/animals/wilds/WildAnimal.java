package sm06.models.animals.wilds;

import java.util.Date;

import sm06.models.animals.base.Animal;

/**
 * WildAnimal is an abstract class inherited from base Animal class
 */
public abstract class WildAnimal extends Animal{
    private String habitat;
    private Date foundDate;

    /**
     * It is a constructor for WildAnimal class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param habitat           The habitat of animal
     * @param foundDate         The found date of animal
     */
    protected WildAnimal(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    /**
     * Returns the animal's habitat
     * @return this.habitat
     */
    public String getHabitat() {
        return this.habitat;
    }

    /**
     * Returns the animal's found date
     * @return this.foundDate
     */
    public Date getFoundDate() {
        return this.foundDate;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Habitat: %s, Found date: %s",
            super.toString(), this.getHabitat(), this.getFoundDate()
        );
    }
}
