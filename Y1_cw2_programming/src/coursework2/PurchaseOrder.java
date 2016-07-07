package coursework2;

/**
 *
 * @author upz12dyu
 */
public class PurchaseOrder 
{
    private String date;
    private String customerID;
    private int discount;
    private int quantity;
    Product product;
    private double finalPrice;

//  Constructor
    public PurchaseOrder(String date, String customerID, int discount, 
            Product product, int quantity) 
    {
        this.date = date;
        this.customerID = customerID;
        this.discount = discount;
        this.quantity = quantity;
        this.product = product;
    }

    /**
    * Accessor method
    * @return the fullPrice of this
    */
    public double getFullPrice() 
    {
        return product.getPricePerUnit()*quantity;
    }

    /**
    * Accessor method
    * @return the finalPrice of this after invoice
    */
    public double getFinalPrice() 
    {
        finalPrice = getFullPrice()*(1-((double)discount/100));
        return finalPrice;
    }
    
    /**
    * toString method for PurchaseOrder
    * @return toString
    */
    @Override
    public String toString() 
    {
        return "PurchaseOrder{" + "date=" + date + ", \n"
                                + "customerID=" + customerID + ", \n"
                                + "discount=" + discount + ", \n"
                                + "quantity=" + quantity + ", \n"
                                + "product=" + product + ", \n"
                                + "finalPrice=" + finalPrice + '}';
    }
  
}
