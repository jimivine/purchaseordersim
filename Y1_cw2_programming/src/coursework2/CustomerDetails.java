package coursework2;

import java.util.regex.Pattern;

/**
 *
 * @author upz12dyu
 */
public abstract class CustomerDetails 
{
    protected String customerID;
    protected Address address;
    protected String regionalCode;
    protected int totalValueOfOrders;
    protected int discount;

    @Override
    public String toString() {
        return "Customer: " + customerID + "\n" +
               address + "\n" +
               "Reginal Code: " + regionalCode + "\n" +
               "Total value of Orders: " + totalValueOfOrders + "\n" +
               "Discount: " + discount;
    }
    
    public abstract int getDiscount();
  
//  Constructor
    public CustomerDetails(String customerID, Address address, 
                            String regionalCode, int totalValueOfOrders) 
           throws IllegalCustomerIDException
    {
        this.customerID = customerID;
        this.address = address;
        this.regionalCode = regionalCode;
        this.totalValueOfOrders = totalValueOfOrders;
        
        if(!Pattern.matches("[P|C](SC|WA|NI|NE|NW|MI|EA|SE|SW|GL)-\\d{4}",
                            this.customerID))
        {
            throw new IllegalCustomerIDException("Invalid CustomerID");
        } 
    
    }
    
    /**
    * Accessor method
    * @return the customerID of this
    */
    public String getCustomerID() 
    {
        return customerID;
    }

    /**
    * Accessor method
    * @return the address of this
    */
    public Address getAddress() 
    {
        return address;
    }

    /**
    * Accessor method
    * @return the regionalCode of this
    */
    public String getRegionalCode() 
    {
        return regionalCode;
    }

    /**
    * Accessor method
    * @return the totalValueOfOrders of this
    */
    public int getTotalValueOfOrders() 
    {
        return totalValueOfOrders;
    }
    
    /**
    * Mutator method - To reset the totalOrders to 0.
    * @param totalValueOfOrders    The total amount of orders a 
    *                              customer has made.
    */
    public void setTotalValueOfOrders(int totalValueOfOrders) 
    {
        this.totalValueOfOrders = 0;
    }

    
}
