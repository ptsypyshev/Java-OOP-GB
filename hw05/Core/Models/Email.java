package hw05.Core.Models;

import hw05.Core.CustomExceptions.BadEmailException;

/**
 * Class of Email objects
 */
public class Email {
    private String email;

    /**
     * It is a constructor for Email class
     * @param email                 Email address
     * @throws BadEmailException    if email is not valid
     */
    public Email(String email) throws BadEmailException{
        if (isValid(email)) {
            this.email = email;
        } else {
            throw new BadEmailException();
        }        
    }

    /**
     * Validates an email
     * @param email     Email address
     * @return          Result of validation
     */
    private static boolean isValid(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    /**
     * Returns email address
     * @return  this.email
     */
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.getEmail();
    }
}
