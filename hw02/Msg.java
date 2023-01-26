package hw02;

import java.util.Map;
import static java.util.Map.entry;

/**
 * Class Msg provides messages for Java Zoo program functionality
 */
public class Msg {
    static final String welcomeMsg = "Welcome to Java Zoo!\n";
    static final String chooseActionsMsg = "Choose one of next actions:";
    static final String addAnimalMsg = """
        You've chosen to add new animal (see what types it can be)
        1 - Cat        
        2 - Dog
        3 - Tiger
        4 - Wolf
        5 - Hen
        6 - Stork        
        """;
    
    static final String askAnimalClassMsg = "What is its type? ";
    static final String askAnimalHeightMsg = "What is its height? ";
    static final String askAnimalWeightMsg = "What is its weight? ";
    static final String askAnimalEyeColorMsg = "What is its eye color? ";
    static final String askPetNameMsg = "What is its name? ";
    static final String askPetBreedMsg = "What is its breed? ";
    static final String askPetVaccinationsMsg = "What vaccinations does it have (space separated)? ";
    static final String askPetFurColorMsg = "What is its fur color? ";
    static final String askPetBirthDaterMsg = "What is its birth date (format yyyy-mm-dd)? ";
    static final String askWildAnimalHabitatMsg = "What is its habitat? ";
    static final String askWildAnimalFoundDateMsg = "What is its found date (format yyyy-mm-dd)? ";
    static final String askBirdFlightAltitudeMsg = "What is its flight altitude? ";
    static final String askIsDogTrainedMsg = "Is the dog trained (answer y / n)? ";
    static final String askIsWolfLeaderdMsg = "Is the wolf leader (answer y / n)? ";
    static final String askIsCatWoollyMsg = "Is the cat woolly (answer y / n)? ";
    
    static final String getIndexlMsg = "Enter number: ";
    static final String getAnimalIDMsg = "Enter animal ID: ";
    static final String incorrectInputMsg = "This is not a valid answer, try again!";
    static final String cannotDoItMsg = "Cannot do it (invalid animal id)";

    static final String animalAddedMsg = "This animal is added to zoo";
    static final String animalNotAddedMsg = "This animal is not added to zoo";
    static final String nobodyRemovedMsg = "Nobody removed from zoo (invalid animal id)";
    static final String animalWasRemovedMsg = "Animal was removed from zoo";
    
    static final String nobodyLivesInZooMsg = "Nobody lives in zoo yet";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
        entry(1, "Add new animal to zoo"),
        entry(2, "Remove an animal from zoo"),
        entry(3, "Print information about a specific animal"),
        entry(4, "Print information about all the animals in the zoo"),
        entry(5, "Make a sound of specific animal"),
        entry(6, "Make sounds of all the animals in the zoo"),
        entry(7, "Try animal to fly"),
        entry(8, "Try animal to pet"),
        entry(9, "Try animal to train"),
        entry(0, "Quit from Java Zoo")
    );
    
    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
        entry(1, addAnimalMsg),
        entry(2, "You've chosen to remove animal. Next animals lives in zoo:"),
        entry(3, "You've chosen to print animal information."),
        entry(4, "You've chosen to print all animals information:"),        
        entry(5, "You've chosen to make animal sound."),
        entry(6, "You've chosen to make all animals sound:"),
        entry(7, "You will try to fly an animal"),
        entry(8, "You will try to pet an animal"),
        entry(9, "You will try to train an animal")
    );    
}