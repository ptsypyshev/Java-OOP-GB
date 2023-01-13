package hw01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Foods extends Product{
    private Date ExpDate;    

    protected Foods(String name, double price, int qty, String unitOfMeasure, String ExpDate) {
        super(name, price, qty, unitOfMeasure);
        this.setExpDate(ExpDate);
    }

    protected Foods(String name, double price, int qty, String unitOfMeasure, Date ExpDate) {
        super(name, price, qty, unitOfMeasure);
        this.setExpDate(ExpDate);
    }

    public Date getExpDate() {
        return this.ExpDate;
    }    

    public void setExpDate(Date ExpDate) {
        this.ExpDate = ExpDate;
    }

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
