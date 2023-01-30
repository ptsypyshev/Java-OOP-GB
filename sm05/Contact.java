package sm05;

// import java.util.List;

public class Contact {
    private String name;
    private Email emails;
    private PhoneNumber phoneNumbers;
    // private List<Email> emails;
    // private List<PhoneNumber> phoneNumbers;

    // public Contact(String name, List<Email> email, List<PhoneNumber> phoneNumber) {
    public Contact(String name, Email email, PhoneNumber phoneNumber) {
        this.name = name;
        this.emails = email;
        this.phoneNumbers = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public List<Email> getEmails() {
    //     return this.emails;
    // }

    public Email getEmails() {
        return this.emails;
    }

    // public void setEmail(int idx, Email email) {
    //     // if (idx >= this.emails.size()) {
    //     //     throw new IndexOutOfBoundsException();
    //     // }
    //     this.emails.set(idx, email);
    // }

    public PhoneNumber getPhoneNumbers() {
        return this.phoneNumbers;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s\n", this.getName(), this.getEmails(), this.getPhoneNumbers());
    }

    // public void setPhoneNumbers(int idx, PhoneNumber phoneNumber) {
    //     this.phoneNumbers.set(idx, phoneNumber);
    // }
}
