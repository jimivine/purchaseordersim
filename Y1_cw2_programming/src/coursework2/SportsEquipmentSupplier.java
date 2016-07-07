package coursework2;

/**
 *
 * @author upz12dyu
 */
public class SportsEquipmentSupplier 
{
    private int month;
    private int year;
    Product product;
    CustomerDetailsList customerDetails;
    PurchaseOrderList orders;

//  Constructor 
    public SportsEquipmentSupplier(int month, int year, Product product,
                                   CustomerDetailsList customerDetails, 
                                   PurchaseOrderList orders) 
    {
        this.month = month;
        this.year = year;
        this.product = product;

        customerDetails = new CustomerDetailsList();
        orders = new PurchaseOrderList();
    }

    /**
    * Accessor method
    * @return the customer details of this
    */
    public CustomerDetailsList getCustomerDetails() 
    {
        return customerDetails;
    }

    /**
    * Accessor method
    * @return the month of this
    */
    public int getMonth() 
    {
        return month;
    }

    /**
    * Accessor method
    * @return the year of this
    */
    public int getYear() 
    {
        return year;
    }

    /**
    * Accessor method
    * @return the product details of this
    */
    public Product getProduct() 
    {
        return product;
    }

    /**
    * Accessor method
    * @return the purchase orders of this
    */
    public PurchaseOrderList getOrders() 
    {
        return orders;
    }

    /**
    * Stores details of new Customers into the CustomerDetailsList.
    * @param newCustomer the new customer to be stored.
    */
    public void addCustomerDetails(CustomerDetails newCustomer) 
    {
        customerDetails.addCustomerDetails(newCustomer);
    }

    /**
    * Generates a new purchase order record for the current month and updates
    * record of purchasing customer
    *
    * @param date          a String with format "dd/mm/yy"
    * @param customerID    must be the ID of a customer in the the company’s
    *                      customer records
    * @param productCode   must be in the company’s current product range
    * @param quantity      the number of items required of the product
    * @throws IncorrectPurchaseOrderException
    */
    public void addNewPurchaseOrder(String date, String customerID,
            String productCode, int quantity)
            throws IncorrectPurchaseOrderException 
    {
        
    }

    /**
    * increments the index of the current month. 12 (December) is followed by 1
    * (January). Updates this supplier’s records as appropriate.
    * 
    * @param month the month as an integer
    */
    public void updateMonth(int month) 
    {
        if(month==12)
        {
            month = 1;
            orders.clearPurchaseOrder();
        }
        month++;
    }
    
    /**
    * toString method for SportsEquipmentSupplier
    * @return toString
    */
    @Override
    public String toString() 
    {
        return "SportsEquipmentSupplier{" + "month=" + month + ", \n"
                                + "year=" + year + ", \n"
                                + "product=" + product + ", \n"
                                + "customerDetails=" + customerDetails + ", \n"
                                + "orders=" + orders + '}';
    }
}
