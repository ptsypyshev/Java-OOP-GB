package sm05;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook  {
    private Map<String,Contact> contacts;

    public PhoneBook(Map<String,Contact> contacts) {
        this.contacts = contacts;
    }

    public PhoneBook() {
        this.contacts = new HashMap<String, Contact>();
    }

    public Map<String,Contact> getContacts() {
        return this.contacts;
    }

    private void setContact(Contact contact) {
        this.contacts.put(contact.getName(), contact);
    }

    public void create(Contact contact) {
        this.setContact(contact);
    }

    public void modify(Contact contact) {
        this.setContact(contact);
    }

    public void delete(String name) {
        this.contacts.remove(name);
    }

    public Contact search(String name) {
        return this.getContacts().get(name);
    }

}
