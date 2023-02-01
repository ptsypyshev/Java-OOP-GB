package hw06.models.zoo;

import java.util.ArrayList;
import java.util.List;

import hw06.models.animals.base.Animal;

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
     * Checks if zoo is empty
     * 
     * @return Zoo empty status
     */
    public boolean isEmpty() {
        return this.getAnimals().size() == 0;
    }
}
