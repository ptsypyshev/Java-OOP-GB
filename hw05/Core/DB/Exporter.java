package hw05.Core.DB;

import hw05.Core.Models.PhoneBook;

public interface Exporter {
    public void save(PhoneBook pb);
}
