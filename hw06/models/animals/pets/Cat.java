package hw06.models.animals.pets;

import java.util.Date;
import java.util.List;

/**
 * Cat is a class inherited from classes Animal -> Pet
 */
public class Cat extends Pet{
    private boolean woolly;

    /**
     * It is a constructor for Cat class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param name              The name of animal
     * @param breed             The breed of animal
     * @param vaccinations      The vaccinations list of animal
     * @param furColor          The fur color of animal
     * @param birthDate         The birthdate of animal
     * @param woolly            The woolly status of animal
     */
    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate, boolean woolly) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = woolly;
    }
    
    /**
     * It is a constructor for Cat class (woolly status will be false)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param name              The name of animal
     * @param breed             The breed of animal
     * @param vaccinations      The vaccinations list of animal
     * @param furColor          The fur color of animal
     * @param birthDate         The birthdate of animal
     * @param woolly            The woolly status of animal
     */
    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = false;
    }

    /**
     * Returns is the animal woolly or not
     * @return this.woolly
     */
    public boolean isWoolly() {
        return this.woolly;
    }

    @Override
    public String sound() {
        return "Meow-meow!";
    }

    @Override
    public String toString() {
        return String.format("Cat (%s, is woolly: %b)", super.toString(), this.isWoolly());
    }
}
