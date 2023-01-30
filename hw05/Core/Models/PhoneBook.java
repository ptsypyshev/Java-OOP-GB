package hw05.Core.Models;

import java.util.Map;

/**
 * Interface which should be implemented to use CRUD operations with Phonebook
 */
public interface PhoneBook {
    /**
     * Creates the contact in the PhoneBook
     * @param contact       Contact object
     * @return              true if contact was created
     */
    public boolean create(Contact contact);

    /**
     * Reads the contact by its name from the PhoneBook 
     * @param name          Name of contact
     * @return              Contact object if name is found and null otherwise
     */
    public Contact read(String name);

    /**
     * Reads whole the PhoneBook 
     * @return      Map of Contacts
     */
    public Map<String,Contact> readAll();

    /**
     * Modifies the contact in the PhoneBook
     * @param contact       Contact object
     * @return              true if contact was modified
     */
    public boolean modify(Contact contact);

    /**
     * Removes the contact in the PhoneBook
     * @param name          Name of contact
     * @return              true if contact was removed
     */
    public boolean delete(String name);

    /**
     * Searches contact by its name in the PhoneBook
     * @param contact       Contact object
     * @return
     */
    public Contact search(String name);
}
