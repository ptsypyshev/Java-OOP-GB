package hw05.UI;

import java.util.Scanner;

import hw05.Core.DB.ExternalContactsCSV;
import hw05.Core.MVP.Model;
import hw05.Core.MVP.Presenter;
import hw05.Core.MVP.View;

public class App {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        Model model = new Model(new ExternalContactsCSV("db.csv"));
        View view = new ConsoleUI(scan);
        Presenter presenter = new Presenter(model, view);

        presenter.loadFromFile();
        presenter.mainMenu();
        presenter.saveToFile();
        
        scan.close();
    }
}
