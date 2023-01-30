package hw05.Core.Models;

/**
 * Class of PhoneNumber objects
 */
public class PhoneNumber {
    private String phoneNumber;

    /**
     * It is a constructor for PhoneNumber class
     * @param phoneNumber   Phone number (string)
     */
    public PhoneNumber(String phoneNumber) {
        if (isValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     * Returns phone number
     * @return this.phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Validates a phone number
     * @param phoneNumber               Phone number (string)
     * @return                          Result of validation
     * @throws NumberFormatException    if number has any characters except digits and '+'
     */
    private static boolean isValid(String phoneNumber) throws NumberFormatException{
        if (phoneNumber.charAt(0) == '+') {
            Integer.parseInt(phoneNumber.substring(1));
            return true;
        } else if (phoneNumber.charAt(0) == '-') {
            throw new NumberFormatException();
        }
        Integer.parseInt(phoneNumber);
        return true;
    }

    @Override
    public String toString() {
        return this.getPhoneNumber();
    }
}
