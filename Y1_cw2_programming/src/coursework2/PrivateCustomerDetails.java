package coursework2;

/**
 *
 * @author upz12dyu
 */
public class PrivateCustomerDetails extends CustomerDetails
{
    Name name;
    Address address;

//  Constructor
    public PrivateCustomerDetails(Name name, String customerID, Address address, 
                            String regionalCode, int totalValueOfOrders) 
                                throws IllegalCustomerIDException 
    {
        super(customerID, address, regionalCode, totalValueOfOrders);
        this.name = name;
    }

    /**
    * Accessor method
    * @return the name of this
    */
    public Name getName() 
    {
        return name;
    }

    /**
    * Method to determine the discount for the customer.
    * @return           The total discount 
    */
    @Override
    public int getDiscount() 
    {
        if(this.totalValueOfOrders >=500)
        {
            discount = 15; //max value of discount is 15% 
        }
        else
        {
            discount = 15*this.totalValueOfOrders/500;
        }
        
        return discount;
    }

    
}
