package sm06.presenters;

import java.util.Date;
import java.util.List;


import sm06.models.animals.pets.Cat;
import sm06.models.animals.pets.Dog;
import sm06.models.animals.base.Animal;
import sm06.models.animals.birds.Hen;
import sm06.models.animals.birds.Stork;
import sm06.models.animals.wilds.Wolf;
import sm06.models.zoo.Zoo;
import sm06.utils.Msg;
import sm06.models.animals.wilds.Tiger;
import sm06.views.View;

public class Presenter {
    private View view;
    private Zoo zoo;

    public Presenter(View view, Zoo zoo) {
        this.view = view;
        this.zoo = zoo;
    }

    public void Run() {
        this.view.Welcome();
        this.view.MainMenu();
        int cmd = view.getCommand();
        switch (cmd) {
            case 0:
                this.view.Bye();
                return;
            case 1:
                Animal animal = getAnimal();
                if (animal != null) {
                    this.zoo.addAnimal(animal);
                }
                break;
            case 2:
                // boolean removed = view.removeAnimal();
                break;
            case 3:
                view.printAnimal();
                break;
            case 4:
                view.printAnimals();
                break;
            case 5:
                view.soundAnimal();
                break;
            case 6:
                view.soundAnimals();
                break;
            case 7:
                view.flyAnimal();
                break;
            case 8:
                view.petAnimal();
                break;
            case 9:
                view.trainAnimal();
                break;
            default:
                break;
        }
        
    }

    private Animal getAnimal() {
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
                String feathersColor = view.getString(Msg.askWildAnimalHabitatMsg);
                if (animalType == 5) {
                    return new Hen(height, weight, eyeColor, feathersColor);
                }
                int flightAltitude = view.getInt(Msg.askBirdFlightAltitudeMsg);
                return new Stork(height, weight, eyeColor, feathersColor, flightAltitude);
            default:
                System.out.println("It is not implemented yet");
                return null;
        }
    }
}
