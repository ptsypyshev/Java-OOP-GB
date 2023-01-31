package sm06;

import java.util.Scanner;

import sm06.models.zoo.Zoo;
import sm06.presenters.Presenter;
import sm06.views.ConsoleView;
import sm06.views.View;

/**
 * Main program class
 */
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        View view = new ConsoleView(scan);
        Presenter presenter = new Presenter(view, javaZoo);
        presenter.Run();
        scan.close();
    }
}
