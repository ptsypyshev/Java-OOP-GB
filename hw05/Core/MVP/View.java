package hw05.Core.MVP;

import java.util.Collection;
import hw05.Core.Models.Contact;

/**
 * Interface which should be implemented to work with Presenter
 */
public interface View {
    /**
     * Shows the welcome message
     */
    public void welcome();

    /**
     * Shows the bye message
     */
    public void bye();

    /**
     * Shows the main menu message
     */
    public void showMainMenu();

    /**
     * Returns the command from user input
     * @return The command from user input
     */
    public int getCmd();

    /**
     * Shows the message if command is invalid
     */
    public void invalidCmd();

    /**
     * Shows the chosen command message
     */
    public void showChosenCmd(int cmd);

    /**
     * Returns raw data information from user input (to add contact)
     * @return raw data information to create contact
     */
    public String[] addContactMenu();

    /**
     * Returns raw data information from user input (to change contact)
     * @param contacts      Collection of Contact objects
     * @return              raw data information to change contact
     */
    public String[] editContactMenu(Collection<Contact> contacts);

    /**
     * Key of Contact to remove it from db
     * @param contacts      Collection of Contact objects
     * @return              key of Contact to remove it from db
     */
    public String removeContactMenu(Collection<Contact> contacts);

    /**
     * Shows detailed information about contact
     * @param contact       The Contact object
     */
    public void showContact(Contact contact);

    /**
     * Shows all contacts from PhoneBook
     * @param contacts      Collection of Contact objects
     */
    public void showAllContacts(Collection<Contact> contacts);

    
    /**
     * Shows the message if email is invalid
     */
    public void invalidEmail();

    /**
     * Shows the message if phone number is invalid
     */
    public void invalidPhoneNumber();    
      
    /**
     * Shows the message if no contacts found in PhoneBook
     */
    public void noContactFound();

    /**
     * Shows the message if contact added to PhoneBook sucessfully
     */
    public void sucessAddContact();

    /**
     * Shows the message if contact edited in PhoneBook sucessfully
     */
    public void sucessEditContact();

    /**
     * Shows the message if contact removed from PhoneBook sucessfully
     */
    public void sucessRemovedContact();

    /**
     * Returns answer the question about adding new contact
     * @return      true if we should add new contact
     */
    public boolean askAddNewContact();

    /**
     * Returns search string from user input
     * @return      search string
     */
    public String getSearchString();

    /**
     * Returns answer the question about removing contact
     * @param contact   The Contact object
     * @return          true if we should remove the contact from PhoneBook
     */
    public boolean removeContactAccept(Contact contact);
}
