package hw05.UI;

import java.util.Map;
import java.util.Scanner;

import hw05.Core.MVP.View;
import hw05.Core.Models.Contact;

public class ConsoleUI implements View {
    private Scanner input;

    public ConsoleUI(Scanner input) {
        this.input = input;
    }

    public void welcome() {
        System.out.println(Msg.welcomeMsg);
    }

    public void bye() {
        System.out.println(Msg.byeMsg);
    }

    public void showMainMenu() {
        System.out.println(Msg.chooseActionsMsg);
        for (int i = 1; i < Msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i, Msg.mainMenuEntries.get(i));
        }
        System.out.printf("%d - %s\n", 0, Msg.mainMenuEntries.get(0));
    }

    public int getCmd() {
        return this.getInt(Msg.getCommandMsg);
    }

    public void invalidCmd() {
        System.out.println(Msg.invalidCmdMsg);
    }

    public String[] addContactMenu() {
        String name = getString(Msg.getNameMsg);
        String emailStr = getString(Msg.getEmailMsg);
        String phoneNumberStr = getString(Msg.getPhoneNumberMsg);
        return new String[] { name, emailStr, phoneNumberStr };
    }

    public String[] editContactMenu(Map<String,Contact> contacts) {
        showAllContacts(contacts);
        System.out.println(Msg.editContactMsg);
        String name = getString(Msg.getNameMsg);
        String emailStr = getString(Msg.getEmailMsg);
        String phoneNumberStr = getString(Msg.getPhoneNumberMsg);
        return new String[] { name, emailStr, phoneNumberStr };
    }

    public boolean askAddNewContact() {
        return this.getBoolean(Msg.askAddContactMsg);
    }

    public void sucessAddContact() {
        System.out.println(Msg.successAddMsg);
    }

    public void sucessEditContact() {
        System.out.println(Msg.successAddMsg);
    }

    public void invalidEmail() {
        System.out.println(Msg.invalidEmailMsg);
    }

    public void invalidPhoneNumber() {
        System.out.println(Msg.invalidPhoneNumberMsg);
    }

    public String getSearchString() {
        return this.getString(Msg.getSearchStrMsg);
    }

    public void noContactFound() {
        System.out.println(Msg.noContactFoundMsg);
    }

    public void showContact(Contact contact) {
        System.out.printf("%s - %s\n", Msg.ContactFoundMsg, contact);
    }

    public void showAllContacts(Map<String,Contact> contacts) {
        System.out.println(Msg.showAllContactsMsg);
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }

    /**
     * Service function which gets string value from user input
     * 
     * @param msg Message that will be showed to user
     * @return The string value from user input
     */
    private String getString(String msg) {
        System.out.print(msg);
        return this.input.next();
    }

    /**
     * Service function which gets integer value from user input
     * 
     * @param msg Message that will be showed to user
     * @return The integer value from user input
     */
    private int getInt(String msg) {
        while (true) {
            System.out.print(msg);
            if (this.input.hasNextInt()) {
                return this.input.nextInt();
            }
            System.out.println(Msg.notDigitMsg);
            this.input.next();
        }
    }

    /**
     * Service function which gets user input and converts it to boolean value
     * @param msg       Message that will be showed to user
     * @return          The boolean value converted from user input
     */
    private boolean getBoolean(String msg) {
        System.out.print(msg);
        if (this.input.next().toLowerCase() == "y") {
            return true;
        }
        return false;
    }
}
