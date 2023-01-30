package hw05.UI;

import java.util.Scanner;

import hw05.Core.DB.ExternalContactsCSV;
import hw05.Core.DB.ExternalData;
import hw05.Core.MVP.Model;
import hw05.Core.MVP.Presenter;
import hw05.Core.MVP.View;
import hw05.Core.Models.PhoneBook;
import hw05.Core.Models.PhoneBookMap;

/**
 * Main application class
 * Used to init all parameters, start the program and save information before exit
 */
public class App {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBookMap();
        ExternalData db = new ExternalContactsCSV(phoneBook, "db.csv");
        Model model = new Model(phoneBook, db);
        View view = new ConsoleUI(scan);
        Presenter presenter = new Presenter(model, view);

        presenter.load();
        presenter.mainMenu();
        presenter.save();

        scan.close();
    }
}
