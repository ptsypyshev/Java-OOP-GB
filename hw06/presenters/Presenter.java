package hw06.presenters;

import java.util.Date;
import java.util.List;

import hw06.models.animals.base.Animal;
import hw06.models.animals.pets.Cat;
import hw06.models.animals.pets.Dog;
import hw06.models.animals.birds.Hen;
import hw06.models.animals.birds.Stork;
import hw06.models.animals.wilds.Tiger;
import hw06.models.animals.wilds.Wolf;
import hw06.models.zoo.Zoo;
import hw06.utils.Msg;
import hw06.views.View;

/**
 * Presenter class of MVP
 */
public class Presenter {
    private View view;
    private Zoo zoo;

    /**
     * It is a constructor for Presenter class
     * @param view      View interface implementation
     * @param zoo       Zoo model
     */
    public Presenter(View view, Zoo zoo) {
        this.view = view;
        this.zoo = zoo;
    }

    /**
     * Runs main functionality
     */
    public void Run() {
        this.view.Welcome();
        while (true) {
            this.view.MainMenu();
            int cmd = view.getInt(Msg.getIndexlMsg);
            switch (cmd) {
                case 0:
                    this.view.Bye();
                    return;
                case 1:
                    Animal animal = getAnimal();
                    if (animal != null) {
                        this.zoo.addAnimal(animal);
                        view.AddedAnimalMsg();
                    }
                    continue;
                case 2, 3, 4, 5, 6, 7, 8, 9:
                    if (this.zoo.isEmpty()) {
                        this.view.PrintZooEmpty();
                        continue;
                    }
                    break;
                default:
                    this.view.NotImplemented();
                    continue;
            }

            switch (cmd) {
                case 4:
                    this.view.PrintAnimals(this.zoo.getAnimals());
                    continue;
                case 6:
                    this.view.SoundAnimals(this.zoo.getAnimals());
                    continue;
                default:
                    break;
            }

            int animalIndex = view.getInt(Msg.getAnimalIDMsg);
            if (animalIndex < 0 || animalIndex >= this.zoo.getAnimals().size()) {
                this.view.BadIndex();
                continue;
            }

            Animal animal = this.zoo.getAnimal(animalIndex);
            switch (cmd) {
                case 2:
                    this.zoo.removeAnimal(animalIndex);
                    view.RemovedAnimalMsg();
                    break;
                case 3:
                    this.view.PrintAnimal(animal);
                    break;
                case 5:
                    this.view.SoundAnimal(animal);
                    break;
                case 7:
                    this.view.FlyAnimal(animal);
                    break;
                case 8:
                    this.view.PetAnimal(animal);
                    break;
                case 9:
                    this.view.TrainAnimal(animal);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Creates Animal object from user input
     * @return
     */
    private Animal getAnimal() {
        view.NewAnimalMsg();
        int animalType = view.getInt(Msg.askAnimalClassMsg);
        double height = view.getDouble(Msg.askAnimalHeightMsg);
        double weight = view.getDouble(Msg.askAnimalWeightMsg);
        String eyeColor = view.getString(Msg.askAnimalEyeColorMsg);
        switch (animalType) {
            case 1, 2:
                String name = view.getString(Msg.askPetNameMsg);
                String breed = view.getString(Msg.askPetBreedMsg);
                List<String> vaccinations = view.getListString(Msg.askPetVaccinationsMsg);
                String furColor = view.getString(Msg.askPetFurColorMsg);
                Date birthDate = view.getDate(Msg.askPetBirthDaterMsg);
                if (animalType == 1) {
                    boolean woolly = view.getBoolean(Msg.askIsCatWoollyMsg);
                    return new Cat(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, woolly);
                }
                boolean trained = view.getBoolean(Msg.askIsDogTrainedMsg);
                return new Dog(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, trained);
            case 3, 4:
                String habitat = view.getString(Msg.askWildAnimalHabitatMsg);
                Date foundDate = view.getDate(Msg.askWildAnimalFoundDateMsg);
                if (animalType == 3) {
                    return new Tiger(height, weight, eyeColor, habitat, foundDate);
                }
                boolean leader = view.getBoolean(Msg.askIsWolfLeaderdMsg);
                return new Wolf(height, weight, eyeColor, habitat, foundDate, leader);
            case 5, 6:
                String feathersColor = view.getString(Msg.askBirdFeathersColorMsg);
                if (animalType == 5) {
                    return new Hen(height, weight, eyeColor, feathersColor);
                }
                int flightAltitude = view.getInt(Msg.askBirdFlightAltitudeMsg);
                return new Stork(height, weight, eyeColor, feathersColor, flightAltitude);
            default:
                view.NotImplemented();
                return null;
        }
    }
}
