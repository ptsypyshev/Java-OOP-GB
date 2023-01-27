package hw05.Core.Models;

import hw05.Core.CustomExceptions.BadEmailException;

public class Email {
    private String _email;

    public Email(String email) throws BadEmailException{
        if (isValid(email)) {
            this._email = email;
        } else {
            throw new BadEmailException();
        }        
    }

    private static boolean isValid(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    @Override
    public String toString() {
        return this.get_email();
    }
}
