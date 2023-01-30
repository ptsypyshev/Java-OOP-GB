// View
// menu();
// add();
// read();
// readAll();
// edit();
// delete();
// search();

package sm05;

import java.util.Scanner;

public class View {    
    public void mainMenu(PhoneBook pb) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        while (true) {
            System.out.println("Menu items");
            int cmd = scan.nextInt();
            switch (cmd) {
                case 0:
                    scan.close();
                    return;
                case 1:
                    try {
                        pb.create(addContact(scan));
                    } catch (NumberFormatException e) {
                        System.out.println("number contact");
                    }
                    catch (BadEmailException e) {
                        System.out.println("email contact");
                    }
                    break;
                default:
                    System.out.println("Menu is not implemented");
            }
        }
    }

    private Contact addContact(Scanner scan) throws BadEmailException, NumberFormatException{
        System.out.print("Enter name: ");
        String name = scan.next();
        System.out.print("Enter email: ");
        String emailStr = scan.next();        
        System.out.print("Enter phone number: ");
        String pnString = scan.next();
        // try {
            Email email = new Email(emailStr);
            PhoneNumber phoneNumber = new PhoneNumber(pnString);
            Contact newContact = new Contact(name, email, phoneNumber);
            System.out.printf("Add contact %s\n", newContact);
            return newContact;
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }        
    }
    
}
