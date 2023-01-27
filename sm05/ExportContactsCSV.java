package sm05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ExportContactsCSV implements Exporter{
    @Override
    public void save(PhoneBook pb) {
        File file = new File("db.csv");
        try {
            FileWriter fw = new FileWriter(file);
            for (Contact contact : pb.getContacts().values()) {
                System.out.println(String.format("%s;%s;%s\n", contact.getName(), contact.getEmails(), contact.getPhoneNumbers()));
                fw.write(String.format("%s;%s;%s\n", contact.getName(), contact.getEmails(), contact.getPhoneNumbers()));
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }        
    }    
}
