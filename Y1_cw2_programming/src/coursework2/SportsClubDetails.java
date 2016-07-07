package coursework2;

/**
 *
 * @author upz12dyu
 */
public class SportsClubDetails extends CustomerDetails
{
    private String clubName;
    private int clubDiscount = 20; //fixed discount price of 20%

//  Constructor
    public SportsClubDetails(String clubName, String customerID, 
                             Address address, String regionalCode, 
                             int totalValueOfOrders) 
                                 throws IllegalCustomerIDException 
    {
        super(customerID, address, regionalCode, totalValueOfOrders);
        this.clubName = clubName;
    }

    /**
    * Method to determine the discount for the sports club.
    * @return           The total discount 
    */
    @Override
    public int getDiscount() 
    {
        return clubDiscount;
    }
}
