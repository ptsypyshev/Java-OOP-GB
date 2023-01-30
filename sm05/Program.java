package sm05;

public class Program {
    public static void main(String[] args) {        
        Exporter saver = new ExportContactsCSV();
        PhoneBook pb = new PhoneBook();
        View v = new View();
        v.mainMenu(pb);
        saver.save(pb);
    }
}
