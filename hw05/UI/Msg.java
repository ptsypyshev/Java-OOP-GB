package hw05.UI;

import java.util.Map;
import static java.util.Map.entry;

/**
 * Separated Messages class for ConsoleUI
 */
public class Msg {
    static final String welcomeMsg = "Welcome to Phonebook Program!\n";
    static final String byeMsg = "\nBye!";

    static final String chooseActionsMsg = "Choose one of next actions:";
    static final String invalidCmdMsg = "Bad command, try again";

    static final String getCommandMsg = "Enter command: ";
    static final String getNameMsg = "Enter name: ";
    static final String getEmailMsg = "Enter email: ";
    static final String getPhoneNumberMsg = "Enter phone number: ";
    static final String invalidEmailMsg = "Bad email error";
    static final String invalidPhoneNumberMsg = "Bad  phone number error";
    static final String successAddMsg = "Contact was sucessfully added to Phonebook";
    static final String successEditMsg = "Contact was sucessfully edited in Phonebook";
    static final String successRemovedMsg = "Contact was sucessfully removed from Phonebook";
    static final String ContactFoundMsg = "Next contact is found";
    static final String noContactFoundMsg = "There are no contacts found";

    static final String showAllContactsMsg = "Next contacts was found in Phonebook:";
    static final String editContactMsg = "To edit contact fill next fields:";
    static final String askAddContactMsg = "No contacts with edited name was found. Add new (y/n): ";

    static final String getSearchStrMsg = "Enter a name to search contact: ";
    static final String notDigitMsg = "This is not a digit, try again!";
    static final String removeContacMsg = "Next contact will be deleted:";
    static final String askRemoveContactMsg = "Are you sure? (y/n): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Add new contact"),
            entry(2, "Change the existing contact in the collection"),
            entry(3, "Remove the contact from collection"),
            entry(4, "Show all contacts"),
            entry(5, "Show detailed information about contact"),
            entry(0, "Quit from program"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "You've chosen to add new contact."),
            entry(2, "You've chosen to change contact."),
            entry(3, "You've chosen to remove contact."),
            entry(4, "You've chosen to print all contact information:"),
            entry(5, "You've chosen to print detail contact information."),
            entry(0, "Bye!"));
}
