package hw05.Core.MVP;

import java.util.Map;

import hw05.Core.Models.Contact;

public interface View {
    public void welcome();
    public void bye();
    public void showMainMenu();
    public int getCmd();
    public String[] addContactMenu();
    public String[] editContactMenu(Map<String,Contact> contacts);
    public void invalidEmail();
    public void invalidPhoneNumber();
    public void invalidCmd();
    public void sucessAddContact();
    public void sucessEditContact();
    public String getSearchString();
    public void noContactFound();
    public void showContact(Contact contact);
    public void showAllContacts(Map<String,Contact> contacts);
    public boolean askAddNewContact();
}
