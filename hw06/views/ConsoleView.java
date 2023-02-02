package hw06.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import hw06.models.animals.base.Animal;
import hw06.models.interfaces.Flier;
import hw06.models.interfaces.Petter;
import hw06.models.interfaces.Trainer;
import hw06.utils.Msg;

public class ConsoleView implements View {
    private Scanner scan;

    /**
     * * It is a constructor for ConsoleView class
     * @param scan      Scanner object (java.util.Scanner)
     */
    public ConsoleView(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void Welcome() {
        System.out.println(Msg.welcomeMsg);

    }

    @Override
    public void MainMenu() {
        System.out.println(Msg.chooseActionsMsg);
        for (int i = 1; i <= Msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i % 10, Msg.mainMenuEntries.get(i % 10));
        }
    }

    @Override
    public void BadIndex() {
        System.out.printf("\n%s\n\n", Msg.invalidAnimalIDMsg);
    }

    @Override
    public void NewAnimalMsg() {
        System.out.printf("\n%s\n", Msg.addAnimalMsg);
    }

    @Override
    public void AddedAnimalMsg() {
        System.out.printf("\n%s\n\n", Msg.animalWasAddedMsg);
    }

    @Override
    public void RemovedAnimalMsg() {
        System.out.printf("\n%s\n\n", Msg.animalWasRemovedMsg);
    }

    @Override
    public void PrintZooEmpty() {
        System.out.printf("\n%s\n\n", Msg.nobodyLivesInZooMsg);
    }

    @Override
    public void PrintAnimal(Animal animal) {
        System.out.printf("%s\n\n", animal);

    }

    @Override
    public void PrintAnimals(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("%d - %s\n", i, animals.get(i));
        }
        System.out.println();
    }

    @Override
    public void SoundAnimal(Animal animal) {
        System.out.printf("%s\n\n", animal.sound());

    }

    @Override
    public void SoundAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            SoundAnimal(animal);
        }
    }

    @Override
    public void FlyAnimal(Animal animal) {
        if (animal instanceof Flier) {
            System.out.println(((Flier) animal).fly());
        } else {
            System.out.println(Msg.cannotFlyMsg);
        }

    }

    @Override
    public void PetAnimal(Animal animal) {
        if (animal instanceof Petter) {
            System.out.println(((Petter) animal).pet());
        } else {
            System.out.println(Msg.cannotPetMsg);
        }
    }

    @Override
    public void TrainAnimal(Animal animal) {
        if (animal instanceof Trainer) {
            System.out.println(((Trainer) animal).train());
        } else {
            System.out.println(Msg.cannotTrainMsg);
        }
    }

    @Override
    public void NotImplemented() {
        System.out.printf("\n%s\n\n", Msg.notImplementedMsg);
    }

    @Override
    public void Bye() {
        System.out.println(Msg.byeMsg);

    }

    @Override
    public int getInt(String message) {
        while (true) {
            System.out.print(message);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            System.out.println(Msg.incorrectInputMsg);
            scan.next();
        }
    }

    @Override
    public double getDouble(String message) {
        while (true) {
            System.out.print(message);
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            }
            System.out.println(Msg.incorrectInputMsg);
            scan.next();
        }
    }

    @Override
    public String getString(String message) {
        System.out.print(message);
        return scan.next();
    }

    @Override
    public boolean getBoolean(String message) {
        System.out.print(message);
        if (scan.next().toLowerCase() == "y") {
            return true;
        }
        return false;
    }

    @Override
    public Date getDate(String message) {
        DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            System.out.print(message);
            String strDate = scan.next();
            try {
                return parser.parse(strDate);
            } catch (Exception e) {
                System.out.println(Msg.incorrectInputMsg);
            }
        }
    }

    @Override
    public List<String> getListString(String message) {
        System.out.print(message);
        List<String> result = new ArrayList<String>();
        result.add(scan.next());
        for (String elem : scan.nextLine().split(" ")) {
            if (elem != "") {
                result.add(elem);
            }
        }
        return result;
    }
}
