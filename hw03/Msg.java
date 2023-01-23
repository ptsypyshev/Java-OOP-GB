package hw03;

import java.util.Map;
import static java.util.Map.entry;

/**
 * Class Msg provides messages for Figures program functionality
 */
public class Msg {
    static final String welcomeMsg = "Welcome to Figures Collection Program!\n";
    static final String byeMsg = "\nBye!";
    static final String chooseActionsMsg = "Choose one of next actions:";
    static final String getFigureMsg = """
        You should choose the figure type (see what types it can be)
        1 - Circle        
        2 - Triangle
        3 - Rectangle
        4 - Square
        """;
    
    static final String askFigureClassMsg = "What is its type? ";
    static final String askFigureSideLengthMsg = "What is its side length? ";
    static final String askCircleRadiusMsg = "What is its radius? ";
    
    static final String getIndexlMsg = "Enter number: ";
    static final String getFigureIDMsg = "Enter figure ID: ";
    static final String incorrectInputMsg = "This is not a valid answer, try again!";
    static final String cannotDoItMsg = "Cannot do it (invalid figure id)";

    static final String figureAddedMsg = "This figure is added to collection";
    static final String figureWasRemovedMsg = "Figure was removed from collection";
    static final String figureWasChangedMsg = "Figure was changed in collection";
    
    static final String noFiguresInCollectionMsg = "No figures are in the collection yet";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
        entry(1, "Add new figure to collection"),
        entry(2, "Remove an figure from collection"),
        entry(3, "Change the figure in the collection"),
        entry(4, "Print information about all figures in the collection"),
        entry(5, "Sort all figures in the collection by square"),
        entry(0, "Quit from program")
    );
    
    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
        entry(1, "You've chosen to add new figure."),
        entry(2, "You've chosen to remove figure. Next figures are in collection now:"),
        entry(3, "You've chosen to change figure. Next figures are in collection now"),
        entry(4, "You've chosen to print all figures information:"),        
        entry(5, "You've chosen to sort all figures.")
    );    
}