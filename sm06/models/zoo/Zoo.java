package sm06.models.zoo;

import java.util.ArrayList;
import java.util.List;

import sm06.models.animals.base.Animal;
import sm06.models.interfaces.Flier;
import sm06.models.interfaces.Petter;
import sm06.models.interfaces.Trainer;

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
     * Makes animal sound by its ID
     * 
     * @param idx animal ID
     */
    public String soundAnimal(int idx) {
        return this.getAnimal(idx).sound();
    }

    /**
     * Makes sound of all animals in zoo
     */
    public String soundAllAnimals() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : this.getAnimals()) {
            sb.append(String.format("%s\n", animal.sound()));
        }
        return sb.toString();
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
     * Makes fly the animal by ID  if it possible
     */
    public String flyAnimal(int idx) {
        if (this.getAnimal(idx) instanceof Flier) {
            return ((Flier) this.getAnimal(idx)).fly();
        } else {
            return "The animal cannot fly... Sorry";
        }
    }

    /**
     * Pets the animal by ID if it possible
     */
    public String petAnimal(int idx) {
        if (this.getAnimal(idx) instanceof Petter) {
            return ((Petter) this.getAnimal(idx)).pet();
        } else {
            return "The animal cannot be petted... Sorry";
        }
    }

    /**
     * Trains the animal by ID  if it possible
     */
    public String trainAnimal(int idx) {
        if (this.getAnimal(idx) instanceof Trainer) {
            return ((Trainer) this.getAnimal(idx)).train();
        } else {
            return "The animal cannot be trained... Sorry";
        }
    }
}
