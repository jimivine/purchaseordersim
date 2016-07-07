package coursework2;

/**
 *
 * @author upz12dyu
 */

public class Address 
{
    private String firstAddress;
    private String city;
    private String postcode;

//  Constructor    
    public Address(String firstAddress, String city, String postcode) 
    {
        this.firstAddress = firstAddress;
        this.city = city;
        this.postcode = postcode;
    }
    
    /**
    * Accessor method
    * @return the firstAddress of this
    */
    String getFirstAddress()
    {
        return firstAddress;
    }
    
    /**
    * Accessor method
    * @return the city of this
    */
    String getCity()
    {
        return city;
    }
    
    /**
    * Accessor method
    * @return the postcode of this
    */
    String getPostcode()
    {
        return postcode;
    }
    
    /**
    * toString method for Address
    * @return toString
    */
    public String toString()
    {
        StringBuilder returnVal = new StringBuilder();
        returnVal.append("Address: ").append(firstAddress).append(", \n")
                 .append(city).append(", \n").append(postcode);
        return returnVal.toString();
    }
}
