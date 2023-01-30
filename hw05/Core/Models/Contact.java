package hw05.Core.Models;

/**
 * Class of Contact objects
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private Email email;
    private PhoneNumber phoneNumber;

    /**
     * It is a constructor for Contact class
     * @param name          Contact name
     * @param email         Contact email
     * @param phoneNumber   Contact phone number
     */
    public Contact(String name, Email email, PhoneNumber phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns Contact name
     * @return  this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns Contact email
     * @return  this.email
     */
    public Email getEmail() {
        return this.email;
    }

    /**
     * Returns Contact phone number
     * @return  this.phoneNumber
     */
    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Email: %s; Phone: %s\n", this.getName(), this.getEmail(),
                this.getPhoneNumber());
    }

    @Override
    public int compareTo(Contact anotherContact) {
        return this.getName().compareTo(anotherContact.getName());
        
    }
}
