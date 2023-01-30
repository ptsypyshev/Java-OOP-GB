package hw05.Core.MVP;

import java.util.Collection;

import hw05.Core.CustomExceptions.BadEmailException;
import hw05.Core.Models.Contact;
import hw05.Core.Models.Email;
import hw05.Core.Models.PhoneNumber;

/**
 * The Class which provides all business logics
 */
public class Presenter {
    private Model model;
    private View view;

    /**
     * It is a constructor for Presenter class
     * 
     * @param model Model object
     * @param view  Any implementation of View interface
     */
    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Loads information from DB
     */
    public void load() {
        model.load();
    }

    /**
     * Saves information from DB
     */
    public void save() {
        model.save();
    }

    /**
     * Provides main menu operations
     */
    public void mainMenu() {
        view.welcome();
        while (true) {
            view.showMainMenu();
            int cmd = view.getCmd();
            view.showChosenCmd(cmd);
            switch (cmd) {
                case 0:
                    return;
                case 1:
                    String[] newContactArr = view.addContactMenu();
                    addContact(newContactArr);
                    break;
                case 2:
                    Collection<Contact> contacts = this.model.getPhoneBook().readAll().values();
                    String[] editContactArr = view.editContactMenu(contacts);
                    editContact(editContactArr);
                    break;
                case 3:
                    contacts = this.model.getPhoneBook().readAll().values();
                    String contactToRemove = view.removeContactMenu(contacts);
                    removeContact(contactToRemove);
                    break;
                case 4:
                    readAllContacts();
                    break;
                case 5:
                    String searchStr = view.getSearchString();
                    readContact(searchStr);
                    break;
                default:
                    view.invalidCmd();
            }
        }
    }

    /**
     * Makes contact from String[] array of raw data
     * @param data      String[] array of raw data
     * @return          Contact object if all data valid or null otherwise
     */
    private Contact makeContact(String[] data) {
        String name = data[0];
        try {
            Email email = new Email(data[1]);
            PhoneNumber phoneNumber = new PhoneNumber(data[2]);
            return new Contact(name, email, phoneNumber);
        } catch (NumberFormatException e) {
            view.invalidPhoneNumber();
        } catch (BadEmailException e) {
            view.invalidEmail();
        }
        return null;
    }

    /**
     * Add contact command
     * @param data      String[] array of raw data
     * @return          true if contact was added sucessfully
     */
    private boolean addContact(String[] data) {
        Contact contact = makeContact(data);
        if (contact != null) {
            this.model.getPhoneBook().create(contact);
            view.sucessAddContact();
            return true;
        }
        return false;
    }

    /**
     * Edit contact command
     * @param data      String[] array of raw data
     * @return          true if contact was changed sucessfully
     */
    private boolean editContact(String[] data) {
        String name = data[0];
        if (!this.model.getPhoneBook().readAll().containsKey(name)) {
            if (!view.askAddNewContact()) {
                return false;
            } else {
                addContact(data);
                return true;
            }
        }
        Contact contact = makeContact(data);
        this.model.getPhoneBook().modify(contact);
        view.sucessEditContact();
        return true;
    }

    /**
     * Remove contact command
     * @param name      Name of contact to remove
     * @return          true if contact was removed sucessfully
     */
    private boolean removeContact(String name) {
        Contact contact = this.model.getPhoneBook().search(name);
        if (contact == null) {
            view.noContactFound();
            return false;
        }

        if (view.removeContactAccept(contact)) {
            this.model.getPhoneBook().delete(name);
            view.sucessRemovedContact();
            return true;
        }
        return false;
    }

    /**
     * Read contact command
     * @param searchStr     Search string (name)
     */
    private void readContact(String searchStr) {
        Contact contact = this.model.getPhoneBook().search(searchStr);
        if (contact == null) {
            view.noContactFound();
        } else {
            view.showContact(contact);
        }
    }

    /**
     * Read all contacts command
     */
    private void readAllContacts() {
        view.showAllContacts(this.model.getPhoneBook().readAll().values());
    }
}
