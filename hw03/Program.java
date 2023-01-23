package hw03;

import java.util.Scanner;
import hw03.FigureExceptions.*;

public class Program {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Msg.welcomeMsg);
        mainMenu(scan);
        scan.close();
    }

    /**
     * Provides main menu functionality
     * @param scan
     */
    public static void mainMenu(Scanner scan) {
        while (true) {
            printMainMenu();
            int action = getInt(scan, Msg.getIndexlMsg);
            switch (action) {
                case 0:
                    System.out.println(Msg.byeMsg);
                    return;
                case 1, 2, 3, 4, 5:
                    FiguresCmdMenu(scan, action);
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
        for (int i = 1; i < Msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i % 10, Msg.mainMenuEntries.get(i % 10));
        }
        System.out.printf("%d - %s\n", 0, Msg.mainMenuEntries.get(0));
    }

    /**
     * Provides commands functionality depending on action value
     * @param scan      Scanner object to read user input
     * @param action    An action which user has chosen
     */
    public static void FiguresCmdMenu(Scanner scan, int action) {
        System.out.printf("\n%s\n", Msg.mainMenuEntriesMsg.get(action));    
        FigureCollection myCollection = FigureCollection.getInstance();        
        if (myCollection.isEmpty() && action != 1) {
            System.out.println(Msg.noFiguresInCollectionMsg);
            return;
        }

        switch (action) {
            case 1:
                try {
                    Figure figure = getFigure(scan);
                    myCollection.addFigure(figure);
                } catch (Exception e) {
                    System.out.printf("Figure was not created: %s", e.getMessage());
                }                
                break;
            case 2:
                int idx = getInt(scan, Msg.getFigureIDMsg);
                myCollection.removeFigure(idx);
                break;
            case 3:
                idx = getInt(scan, Msg.getFigureIDMsg);
                try {
                    Figure newFigure = getFigure(scan);
                    myCollection.changeFigure(idx, newFigure);
                } catch (Exception e) {
                    System.out.printf("Figure cannot be changed: %s", e);
                }                
                break;
            case 4:
                myCollection.printFigures();
                break;
            case 5:
                myCollection.sort();
                myCollection.printFigures();
                break;
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
     * Returns a Figure object depends on user's answers
     * @param scan                              Scanner object to read user input
     * @return                                  The Animal object converted from user input     
     * @throws InvalidFigureTypeException       if figure type is not implemented
     * @throws InvalidLengthException           if received invalid length of side or radius 
     * @throws InvalidTriangleSidesException    if the triangle does not exist
     */
    public static Figure getFigure(Scanner scan) throws InvalidFigureTypeException, InvalidLengthException, InvalidTriangleSidesException {
        System.out.println(Msg.getFigureMsg);
        int figureType = getInt(scan, Msg.askFigureClassMsg);
        switch (figureType) {
            case 1:
                double radius = getDouble(scan, Msg.askCircleRadiusMsg);
                return new Circle(radius);
            case 2:
                double[] sides = new double[Polygon.TRIANGLE_SIDES];
                for (int i = 0; i < Polygon.TRIANGLE_SIDES; i++) {
                    sides[i] = getDouble(scan, Msg.askFigureSideLengthMsg);
                }
                return new Triangle(sides);
            case 3:
                double length = getDouble(scan, Msg.askFigureSideLengthMsg);
                double width = getDouble(scan, Msg.askFigureSideLengthMsg);
                return new Rectangle(length, width);
            case 4:
                double side = getDouble(scan, Msg.askFigureSideLengthMsg);
                return new Square(side);        
            default:
                throw new InvalidFigureTypeException();
        }
    }
}
