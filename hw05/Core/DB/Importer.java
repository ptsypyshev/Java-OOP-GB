package hw05.Core.DB;

import hw05.Core.Models.PhoneBook;

/**
 * Interface which should be implemented to load Phonebook data
 */
public interface Importer {
    /**
     * Returns PhoneBook implementation object by loading from External sources
     * @return  PhoneBook object
     */
    public PhoneBook load();
}
