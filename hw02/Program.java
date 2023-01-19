package hw02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Main program class
 */
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        System.out.println(Msg.welcomeMsg);
        mainMenu(scan, javaZoo);
        scan.close();

    }

    /**
     * Provides main menu functionality
     * @param scan      Scanner object to read user input
     * @param zoo       Zoo object to manage animals
     */
    public static void mainMenu(Scanner scan, Zoo zoo) {
        while (true) {
            printMainMenu();
            int action = getInt(scan, Msg.getIndexlMsg);
            switch (action) {
                case 0:
                    return;
                case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    zooCmdMenu(scan, zoo, action);
                    break;
                default:
                    System.out.println(Msg.incorrectInputMsg);
                    break;
            }
            System.out.println();
        }
    }

    /**
     * Prints main menu message
     */
    public static void printMainMenu() {
        System.out.println(Msg.chooseActionsMsg);
        for (int i = 1; i <= Msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i % 10, Msg.mainMenuEntries.get(i % 10));
        }
    }

    /**
     * Provides commands functionality depending on action value
     * @param scan      Scanner object to read user input
     * @param zoo       Zoo object to manage animals
     * @param action    An action which user has chosen
     */
    public static void zooCmdMenu(Scanner scan, Zoo zoo, int action) {
        System.out.printf("\n%s\n", Msg.mainMenuEntriesMsg.get(action));
        if (zoo.isEmpty() && action != 1) {
            System.out.println(Msg.nobodyLivesInZooMsg);
            return;
        }

        switch (action) {
            case 1:
                Animal animal = getAnimal(scan);
                if (animal != null) {
                    zoo.addAnimal(animal);
                    System.out.println(Msg.animalAddedMsg);
                } else {
                    System.out.println(Msg.animalNotAddedMsg);
                }
                return;
            case 2:
                zoo.printAllAnimals();
                break;
            case 4:
                zoo.printAllAnimals();
                return;
            case 6:
                zoo.soundAllAnimals();
                return;
        }

        int idx = getInt(scan, Msg.getAnimalIDMsg);
        if (zoo.isAnimalIDValid(idx)) {
            switch (action) {
                case 2:
                    zoo.getAnimals().remove(idx);
                    System.out.println(Msg.animalWasRemovedMsg);
                    break;
                case 3:
                    zoo.printAnimal(idx);
                    break;
                case 5:
                    zoo.soundAnimal(idx);
                    break;
                case 7:
                    zoo.flyAnimal(idx);
                    break;
                case 8:
                    zoo.petAnimal(idx);
                    break;
                case 9:
                    zoo.trainAnimal(idx);
                    break;
                default:
                    System.out.println("Not implemented");
                    break;
            }
        } else {
            System.out.println(Msg.cannotDoItMsg);
        }
    }

    /**
     * Service function which gets integer value from user input
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The integer value from user input
     */
    public static int getInt(Scanner scan, String msg) {
        while (true) {
            System.out.print(msg);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            System.out.println(Msg.incorrectInputMsg);
            scan.next();
        }
    }

    /**
     * Service function which gets double value from user input
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The double value from user input
     */
    public static double getDouble(Scanner scan, String msg) {
        while (true) {
            System.out.print(msg);
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            }
            System.out.println(Msg.incorrectInputMsg);
            scan.next();
        }
    }

    /**
     * Service function which gets string value from user input
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The string value from user input
     */
    public static String getString(Scanner scan, String msg) {
        System.out.print(msg);
        return scan.next();
    }

    /**
     * Service function which gets string value from user input and converts it to list of strings
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The list object converted from user input
     */
    public static List<String> getListString(Scanner scan, String msg) {
        System.out.print(msg);
        List<String> result = new ArrayList<String>();
        result.add(scan.next());
        for (String elem : scan.nextLine().split(" ")) {
            if (elem != "") {
                result.add(elem);
            }
        }
        return result;
    }

    /**
     * Service function which gets user input and converts it to boolean value
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The boolean value converted from user input
     */
    public static boolean getBoolean(Scanner scan, String msg) {
        System.out.print(msg);
        if (scan.next().toLowerCase() == "y") {
            return true;
        }
        return false;
    }

    /**
     * Service function which gets user input and converts it to Date value
     * @param scan      Scanner object to read user input
     * @param msg       Message that will be showed to user
     * @return          The Date value converted from user input
     */
    public static Date getDate(Scanner scan, String msg) {
        DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            System.out.print(msg);
            String strDate = scan.next();
            try {
                return parser.parse(strDate);
            } catch (Exception e) {
                System.out.println(Msg.incorrectInputMsg);
            }
        }
    }

    /**
     * Returns an Animal object depends on user's answers
     * @param scan      Scanner object to read user input
     * @return          The Animal object converted from user input
     */
    public static Animal getAnimal(Scanner scan) {
        int animalType = getInt(scan, Msg.askAnimalClassMsg);
        double height = getDouble(scan, Msg.askAnimalHeightMsg);
        double weight = getDouble(scan, Msg.askAnimalWeightMsg);
        String eyeColor = getString(scan, Msg.askAnimalEyeColorMsg);
        switch (animalType) {
            case 1, 2:
                String name = getString(scan, Msg.askPetNameMsg);
                String breed = getString(scan, Msg.askPetBreedMsg);
                List<String> vaccinations = getListString(scan, Msg.askPetVaccinationsMsg);
                String furColor = getString(scan, Msg.askPetFurColorMsg);
                Date birthDate = getDate(scan, Msg.askPetBirthDaterMsg);
                if (animalType == 1) {
                    boolean woolly = getBoolean(scan, Msg.askIsCatWoollyMsg);
                    return new Cat(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, woolly);
                }
                boolean trained = getBoolean(scan, Msg.askIsDogTrainedMsg);
                return new Dog(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, trained);
            case 3, 4:
                String habitat = getString(scan, Msg.askWildAnimalHabitatMsg);
                Date foundDate = getDate(scan, Msg.askWildAnimalFoundDateMsg);
                if (animalType == 3) {
                    return new Tiger(height, weight, eyeColor, habitat, foundDate);
                }
                boolean leader = getBoolean(scan, Msg.askIsWolfLeaderdMsg);
                return new Wolf(height, weight, eyeColor, habitat, foundDate, leader);
            case 5, 6:
                if (animalType == 5) {
                    return new Hen(height, weight, eyeColor);
                }
                int flightAltitude = getInt(scan, Msg.askBirdFlightAltitudeMsg);
                return new Stork(height, weight, eyeColor, flightAltitude);
            default:
                System.out.println("It is not implemented yet");
                return null;
        }
    }
}
