package coursework2;

import java.util.ArrayList;

/**
 *
 * @author upz12dyu
 */
public class CustomerDetailsList 
{
    private ArrayList<CustomerDetails> customers;

    /**
    * Creates a Customer Details List.
    */
    public CustomerDetailsList()
    {
        customers = new ArrayList<CustomerDetails>();
    }
    
    /**
    * Stores details of new Customers into the CustomerDetailsList.
    * @param newCustomer the new customer to be stored.
    */
    public void addCustomerDetails(CustomerDetails newCustomer)
    {
        customers.add(newCustomer);
    }

    /**
    * Method to determine the number of customers in the list.
    * @return           The number of customers currently in the 
    *                   CustomerDetailsList.
    */
    public int numberOfCustomers()
    {
        return customers.size();
    }
    
    /** 
    *
    * @param givenID    the ID of a customer
    * @return           the customer’s details if found, exception thrown
    *                   otherwise.
    * @throws CustomerNotFoundException
    */
    public CustomerDetails findCustomer( String givenID )
                           throws CustomerNotFoundException
    {
        for(int i=0; i<customers.size(); i++)
        {
            if(customers.get(i).customerID==givenID)
            {
                return customers.get(i);
            }
            
        }
        throw new CustomerNotFoundException("CustomerID Not Found");

    } 
    
    
}
