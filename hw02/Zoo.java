package hw02;

import java.util.ArrayList;
import java.util.List;

/**
 * Zoo is a class to manage animals in object instance
 */
public class Zoo {
    private List<Animal> animals;

    /**
     * It is a constructor for Zoo class
     * 
     * @param animals The list of animals which lives in zoo
     */
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * It is a default constructor for Zoo class
     */
    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    /**
     * Returns a list of animals which lives in zoo
     * 
     * @return
     */
    public List<Animal> getAnimals() {
        return this.animals;
    }

    /**
     * Returns an animal from zoo by its ID
     * 
     * @param idx animal ID
     * @return the Animal object
     */
    public Animal getAnimal(int idx) {
        return this.animals.get(idx);
    }

    /**
     * Adds an animal to zoo
     * 
     * @param animal the Animal object
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    /**
     * Removes an animal from zoo
     * 
     * @param idx animal ID
     */
    public void removeAnimal(int idx) {
        this.animals.remove(idx);
    }

    /**
     * Prints an animal information by its ID
     * 
     * @param idx animal ID
     */
    public void printAnimal(int idx) {
        System.out.println(this.getAnimal(idx));
    }

    /**
     * Prints information about all animals in zoo
     */
    public void printAllAnimals() {
        for (int i = 0; i < this.getAnimals().size(); i++) {
            System.out.printf("%d - %s\n", i, this.getAnimal(i));
        }
    }

    /**
     * Makes animal sound by its ID
     * 
     * @param idx animal ID
     */
    public void soundAnimal(int idx) {
        this.getAnimal(idx).sound();
    }

    /**
     * Makes sound of all animals in zoo
     */
    public void soundAllAnimals() {
        for (Animal animal : this.getAnimals()) {
            animal.sound();
        }
    }

    /**
     * Checks if zoo is empty
     * 
     * @return Zoo empty status
     */
    public boolean isEmpty() {
        return this.getAnimals().size() == 0;
    }

    /**
     * Checks if animal ID is valid
     * 
     * @param idx
     * @return
     */
    public boolean isAnimalIDValid(int idx) {
        if (idx >= 0 && idx < this.getAnimals().size()) {
            return true;
        }
        return false;
    }

    /**
     * Makes fly the animal by ID  if it possible
     */
    public void flyAnimal(int idx) {
        this.getAnimal(idx).fly();
    }

    /**
     * Pets the animal by ID if it possible
     */
    public void petAnimal(int idx) {
        this.getAnimal(idx).pet();
    }

    /**
     * Trains the animal by ID  if it possible
     */
    public void trainAnimal(int idx) {
        this.getAnimal(idx).train();
    }
}
