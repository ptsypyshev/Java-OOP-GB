package hw06.views;

import java.util.List;

import hw06.models.animals.base.Animal;

/**
 * Processes commands for Animals (interface)
 */
public interface AnimalProcesser {
    /**
     * Prints the animal information
     * @param animal    Animal object
     */
    public void PrintAnimal(Animal animal);

    /**
     * Prints information about all the animals in the list
     * @param animals   List of animals
     */
    public void PrintAnimals(List<Animal> animals);

    /**
     * Makes animal sound
     * @param animal    Animal object
     */
    public void SoundAnimal(Animal animal);

    /**
     * Makes sound of all the animals in the list
     * @param animals   List of animals
     */
    public void SoundAnimals(List<Animal> animals);

    /**
     * Tries to fly animal
     * @param animal    Animal object
     */
    public void FlyAnimal(Animal animal);

    /**
     * Tries to pet animal
     * @param animal    Animal object
     */
    public void PetAnimal(Animal animal);

    /**
     * Tries to train animal
     * @param animal    Animal object
     */
    public void TrainAnimal(Animal animal);
}
