package hw05.Core.DB;

import hw05.Core.Models.PhoneBook;

/**
 * Interface which should be implemented to save Phonebook data
 */
public interface Exporter {
    /**
     * Saves to External source the PhoneBook data
     * @param pb    PhoneBook implementation object
     */
    public void save(PhoneBook pb);
}
