package hw01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class for Foods Products which extends base Product class
 */
public class Foods extends Product{
    private Date ExpDate;    

    /**
     * Constructor for Foods class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in String representation)
     */
    protected Foods(String name, double price, int qty, String unitOfMeasure, String ExpDate) {
        super(name, price, qty, unitOfMeasure);
        this.setExpDate(ExpDate);
    }

    /**
     * Constructor for Foods class instances
     * @param name          The name of Product
     * @param price         The price of Product
     * @param qty           The quantity of Product
     * @param unitOfMeasure The unit of measure for the Product
     * @param ExpDate       The expiration date of the Product (in Date representation)
     */
    protected Foods(String name, double price, int qty, String unitOfMeasure, Date ExpDate) {
        super(name, price, qty, unitOfMeasure);
        this.setExpDate(ExpDate);
    }

    /**
     * Returns the expiration date of the Product
     * @return this.ExpDate
     */
    public Date getExpDate() {
        return this.ExpDate;
    }    

    /**
     * Sets the expiration date of the Product
     * @param ExpDate (in Date representation)
     */
    public void setExpDate(Date ExpDate) {
        this.ExpDate = ExpDate;
    }

    /**
     * Sets the expiration date of the Product
     * @param ExpDate (in String representation, format "yyyy-MM-dd")
     */
    public void setExpDate(String ExpDate) {
        DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = parser.parse(ExpDate);
            this.ExpDate = date;
        } catch (ParseException e) {
            this.ExpDate = null;
        }
        
    }

    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return String.format(
            "%s, Expiration Date: %s",
            super.toString(), 
            formatter.format(this.getExpDate())
        );
    }
}
