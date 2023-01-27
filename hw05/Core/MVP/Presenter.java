package hw05.Core.MVP;

import hw05.Core.CustomExceptions.BadEmailException;
import hw05.Core.Models.Contact;
import hw05.Core.Models.Email;
import hw05.Core.Models.PhoneNumber;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void loadFromFile() {
        model.load();
    }

    public void saveToFile() {
        model.save();
    }

    public void mainMenu() {        
        view.welcome();
        while (true) {
            view.showMainMenu();
            int cmd = view.getCmd();
            switch (cmd) {
                case 0:
                    view.bye();
                    return;
                case 1:
                    String[] newContactArr = view.addContactMenu();
                    addContact(newContactArr);
                    break;
                case 2:
                    String[] editContactArr = view.editContactMenu(this.model.getPhoneBook().getContacts());
                    editContact(editContactArr);
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

    private void addContact(String[] data){
        Contact contact = makeContact(data);
        this.model.getPhoneBook().create(contact);
        view.sucessAddContact();
    }

    private void readContact(String searchStr) {
        Contact contact = this.model.getPhoneBook().search(searchStr);
        if (contact == null) {
            view.noContactFound();
        } else {
            view.showContact(contact);
        }
    }

    private void readAllContacts() {
        view.showAllContacts(this.model.getPhoneBook().getContacts());
    }

    private boolean editContact(String[] data){
        String name = data[0];
        if (!this.model.getPhoneBook().getContacts().containsKey(name)) {
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
    
}
