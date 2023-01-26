package hw02;

import java.util.Date;
import java.util.List;

/**
 * Cat is a class inherited from classes Animal -> Pet
 */
public class Dog extends Pet{
    protected boolean trained;

    /**
     * It is a constructor for Dog class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param name              The name of animal
     * @param breed             The breed of animal
     * @param vaccinations      The vaccinations list of animal
     * @param furColor          The fur color of animal
     * @param birthDate         The birthdate of animal
     * @param trained           The trained status of animal
     */
    public Dog(double height, double weight, String eyeColor, String name, String breed,
            List<String> vaccinations, String furColor, Date birdhDate, boolean trained) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = trained;
    }
    
    /**
     * It is a constructor for Dog class (trained status will be false)
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param name              The name of animal
     * @param breed             The breed of animal
     * @param vaccinations      The vaccinations list of animal
     * @param furColor          The fur color of animal
     * @param birthDate         The birthdate of animal
     * @param trained           The trained status of animal
     */
    public Dog(double height, double weight, String eyeColor, String name, String breed,
            List<String> vaccinations, String furColor, Date birdhDate) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = false;
    }

    /**
     * Returns is the animal trained or not
     * @return this.trained
     */
    public boolean isTrained() {
        return this.trained;
    }
    
    public void train() {
        this.trained = true;
        System.out.printf("The dog %s was trained successfully\n", this.getName());
    }

    @Override
    public void sound() {
        System.out.println("Woof-woof!");
    }
    
    @Override
    public String toString() {
        return String.format("Dog (%s, is trained: %b)", super.toString(), this.isTrained());
    }
}
