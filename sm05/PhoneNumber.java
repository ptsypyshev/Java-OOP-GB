package sm05;

public class PhoneNumber {
    private String _phoneNumber;

    public PhoneNumber(String phoneNumber) {
        // if (isValid(phoneNumber)) {
            this._phoneNumber = phoneNumber;
        // }
    }

    public String get_phoneNumber() {
        return this._phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    private static boolean isValid(String phoneNumber) throws NumberFormatException{
        if (phoneNumber.charAt(0) == '+') {
            Integer.parseInt(phoneNumber.substring(1));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.get_phoneNumber();
    }
}
