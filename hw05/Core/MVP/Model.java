package hw05.Core.MVP;

import hw05.Core.DB.ExternalData;
import hw05.Core.Models.PhoneBook;

/**
 * Class to work with PhoneBook and ExternalData implementations
 */
public class Model {
    private PhoneBook phoneBook;
    private ExternalData db;

    /**
     * It is a constructor for Model class
     * @param phoneBook     Implementation of PhoneBook interface
     * @param db            Implementation of ExternalData interface
     */
    public Model(PhoneBook phoneBook, ExternalData db) {
        this.phoneBook = phoneBook;
        this.db = db;
    }

    /**
     * It is a constructor for Model class
     * @param db            Implementation of ExternalData interface
     */
    public Model(ExternalData db) {
        this.db = db;
        this.db.load();
    } 

    /**
     * Returns the PhoneBook object from Model
     * @return this.phoneBook
     */
    public PhoneBook getPhoneBook() {
        return this.phoneBook;
    }

    /**
     * Returns the ExternalData object from Model
     * @return  this.db
     */
    public ExternalData getDb() {
        return this.db;
    }

    /**
     * Loads data from ExternalData to PhoneBook
     */
    public void load() {
        this.phoneBook = db.load();
    }

    /**
     * Saves data from PhoneBook to ExternalData
     */
    public void save() {
        db.save(this.phoneBook);
    }
}
