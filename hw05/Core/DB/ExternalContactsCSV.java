package hw05.Core.DB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import hw05.Core.CustomExceptions.BadCsvContentException;
import hw05.Core.CustomExceptions.BadEmailException;
import hw05.Core.Models.Contact;
import hw05.Core.Models.Email;
import hw05.Core.Models.PhoneBook;
import hw05.Core.Models.PhoneNumber;

public class ExternalContactsCSV implements ExternalData{
    private static final String CSV_HEADER = "name;emails;phones\n";
    private static final String CSV_DELIMITER = ";";
    private static final String CANNOT_READ_FILE_MSG = "Cannot read DB file, empty phone will be used";
    private static final String EMPTY_FILE_MSG = "Empty phone book found";
    private static final String BAD_FILE_MSG = "DB file is corrupted, empty phone will be used";
    private static final String CANNOT_WRITE_FILE_MSG = "Cannot save DB file...";
    
    private String dbPath;

    public ExternalContactsCSV(String dbPath) {
        this.dbPath = dbPath;
    }

    @Override
    public PhoneBook load() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.dbPath));
            String line = reader.readLine();
            if (hasValidHeader(line)) {
                PhoneBook phoneBook = processLines(reader);
                reader.close();
                return phoneBook;
            }
            reader.close();
            throw new BadCsvContentException();
		} catch (IOException e) {
            System.out.println(CANNOT_READ_FILE_MSG);
		} catch (NullPointerException e) {
            System.out.println(EMPTY_FILE_MSG);
        } catch (BadCsvContentException | BadEmailException e) {
            System.out.println(BAD_FILE_MSG);
		}
        return new PhoneBook();
    }

    private boolean hasValidHeader(String line) {
        return line.equals(CSV_HEADER.trim());
    }

    private PhoneBook processLines(BufferedReader reader) throws IOException, BadEmailException{        
        PhoneBook phoneBook = new PhoneBook();
        String line = reader.readLine();
        while (line != null) {
            String[] data = line.split(CSV_DELIMITER);
            String name = data[0];
            Email emails = new Email(data[1]);
            PhoneNumber phoneNumbers = new PhoneNumber(data[2]);
            Contact contact = new Contact(name, emails, phoneNumbers);
            phoneBook.create(contact);
            line = reader.readLine();
        }
        return phoneBook;
    }

    @Override
    public void save(PhoneBook pb) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.dbPath));
            writeHeader(writer);
            writeBody(writer, pb);
            writer.close();
        } catch (IOException e) {
            System.out.println(CANNOT_WRITE_FILE_MSG);
        }        
    }

    private void writeHeader(BufferedWriter writer) throws IOException{
        writer.write(CSV_HEADER);
    }

    private void writeBody(BufferedWriter writer, PhoneBook pb) throws IOException{
        for (Contact contact : pb.getContacts().values()) {
            writer.write(String.format("%s;%s;%s\n", contact.getName(), contact.getEmails(), contact.getPhoneNumbers()));
        }
    }    
}
