package hw06.views;

import java.util.Date;
import java.util.List;

public interface InputChecker {
    /**
     * Checks and returns integer value from user input
     * @param message   Message that will be showed to user
     * @return          Integer value from user input
     */
    public int getInt(String message);

    /**
     * Checks and returns double value from user input
     * @param message   Message that will be showed to user
     * @return          Double value from user input
     */
    public double getDouble(String message);

    /**
     * Returns string value from user input
     * @param message   Message that will be showed to user
     * @return          String value from user input
     */
    public String getString(String message);

    /**
     * Checks and returns boolean value from user input
     * @param message   Message that will be showed to user
     * @return          boolean value from user input
     */
    public boolean getBoolean(String message);

    /**
     * Checks and returns Date value from user input
     * @param message   Message that will be showed to user
     * @return          Date value from user input (java.util.Date)
     */
    public Date getDate(String message);

    /**
     * Returns list of string values from user input
     * @param message   Message that will be showed to user
     * @return          list of string values from user input
     */
    public List<String> getListString(String message);
}
