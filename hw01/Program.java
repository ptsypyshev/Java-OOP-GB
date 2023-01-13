package hw01;

import java.time.LocalDate;
import hw01.Diapers.DiapersTypes;
import java.sql.Date;

public class Program {
    public static void main(String[] args) {
        // Instances of Abstract classes (in this realisation they can be instantiated)
        Product product1 = new Product("Unknown Product", 100, 1, "kg");
        Product food1 = new Foods("Food", 200, 2, "kg", "2023-01-31");
        Product drink1 = new Drinks("Drink", 50, 10, "ml", 500);
        Product hig1 = new HygieneProducts("Hig", 80, 15, "box", 10);
        Product babyProduct1 = new BabyProducts("Baby", 1000, 30, "box", 1, true);

        // Instances of Real classes
        Product milk1 = new Milk("Prostokvashino Milk", 85, 20, "liters", 
            Date.valueOf(LocalDate.now().plusWeeks(1)), 2.5
        );
        Product lemonade1 = new Lemonade("Baykal Lemonade", 59.99, 50, "bottle", 1000);
        Product bread1 = new Bread("Simple bread", 40.99, 100, "unit", 
            Date.valueOf(LocalDate.now().plusDays(5)), Bread.FlourTypes.ALLPURPOSEFLOUR
        );        
        Product eggs1 = new Eggs("Chepfa eggs", 90, 100, "box", "2023-02-15", 10);
        Product mask1 = new FaceMasks("Max factor face mask", 299.99, 20, "sachet", 1);
        Product toiletPaper1 = new ToiletPaper("Zeva Deluxe", 300, 100, "package", 12, 3);
        Product pampers1 = new Diapers("Pampers", 2999.99, 30, "box", 
            0, false, 2, 3, 6, DiapersTypes.REGULAR_DIAPERS);
        Product pacifier1 = new Pacifier("Philips", 799.99, 3, "small_box", 
            0, true);        
        
        Product[] products = new Product[]{product1, food1, drink1, hig1, babyProduct1, milk1, lemonade1, bread1, eggs1, mask1, toiletPaper1, pampers1, pacifier1};
        for (Product product : products) {
            showProduct(product);
        }
    }
    
    public static void showProduct(Product product) {
        System.out.println(product);
    }
}
