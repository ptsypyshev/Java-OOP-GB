package hw06;

import java.util.Scanner;

import hw06.models.zoo.Zoo;
import hw06.presenters.Presenter;
import hw06.views.ConsoleView;
import hw06.views.View;

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
