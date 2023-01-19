package hw02;

import java.util.Date;
import java.util.List;

/**
 * Pet is an abstract class inherited from base Animal class
 */
public abstract class Pet extends Animal{
    private String name;
    private String breed;
    private List<String> vaccinations;
    private String furColor;
    private Date birthDate;

    /**
     * It is a constructor for Pet class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param name              The name of animal
     * @param breed             The breed of animal
     * @param vaccinations      The vaccinations list of animal
     * @param furColor          The fur color of animal
     * @param birthDate         The birthdate of animal
     */
    public Pet(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.furColor = furColor;
        this.birthDate = birthDate;
    }

    /**
     * Returns the animal name
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the animal breed
     * @return this.breed
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Returns the animal's vaccinations list
     * @return this.vaccinations
     */
    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    /**
     * Returns the animal fur color
     * @return this.furColor
     */
    public String getFurColor() {
        return this.furColor;
    }

    /**
     * Returns Returns the animal birth date
     * @return this.birthDate
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    public void pet() {
        System.out.println("It has been petted. It loves you)");
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Name: %s, Breed: %s, Vaccinations: %s, Fur color: %s, Birth date: %s",
            super.toString(), this.getName(), this.getBreed(), this.getVaccinations(), this.getFurColor(), this.getBirthDate()
        );
    }
}
