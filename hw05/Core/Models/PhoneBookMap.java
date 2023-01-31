package hw05.Core.Models;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class is implementation of PhoneBook interface which uses HashMap to store the Contact objects
 */
public class PhoneBookMap implements PhoneBook {
    private Map<String,Contact> contacts;

    /**
     * It is a constructor for PhoneBookMap class
     * @param contacts      Map of contacts
     */
    public PhoneBookMap(Map<String,Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * It is a constructor for PhoneBookMap class (inits new empty Map of contacts)
     */
    public PhoneBookMap() {
        this.contacts = new HashMap<String, Contact>();
    }

    /**
     * Returns Map of contacts
     * @return this.contacts
     */
    private Map<String,Contact> getContacts() {
        return this.contacts;
    }

    /**
     * Set the contact to the Map of contacts
     * @param contact       Contact object
     * @return              true if contact was set
     */
    private boolean setContact(Contact contact) {
        try {
            this.contacts.put(contact.getName(), contact);
        } catch (UnsupportedOperationException | NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;        
    }
    
    @Override
    public boolean create(Contact contact) {
        return this.setContact(contact);
    }

    @Override
    public Contact read(String name) {
        if (this.getContacts().containsKey(name)) {
            return this.getContacts().get(name);
        }
        return null;
    }

    @Override
    public Map<String, Contact> readAll() {
        return this.getContacts();
    }

    @Override
    public boolean modify(Contact contact) {
        return this.setContact(contact);
    }    
    
    @Override
    public boolean delete(String name) {
        try {
            this.contacts.remove(name);
        } catch (UnsupportedOperationException | NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    @Override
    public Contact search(String name) {
        return this.getContacts().get(name);
    }
}
