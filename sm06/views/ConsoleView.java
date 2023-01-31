package sm06.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import sm06.utils.Msg;

public class ConsoleView implements View{
    private Scanner scan;

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
    public int getCommand() {
        return getInt(Msg.getAnimalIDMsg);
    }

    @Override
    public boolean addAnimal() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAnimal() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void printAnimal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void printAnimals() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void soundAnimal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void soundAnimals() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void flyAnimal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void petAnimal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void trainAnimal() {
        // TODO Auto-generated method stub
        
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
