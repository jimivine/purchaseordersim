package coursework2;

/**
 * Models the full name of a private individual customer.
 * @author upz12dyu
 */
public class Name 
{
    private String title;
    private String initials;
    private String surname;
    
//  Constructor
    public Name(String title, String initials, String surname) 
    {
        this.title = title;
        this.initials = initials;
        this.surname = surname;
    }
    
    /**
    * Accessor method
    * @return the title of this
    */
    String getTitle()
    {
        return title;
    }
    
    /**
    * Accessor method
    * @return the initials of this
    */
    String getInitials()
    {
        return initials;
    }
    
    /**
    * Accessor method
    * @return the surname of this
    */
    String getSurname()
    {
        return surname;
    }
    
    /**
    * toString method for Name
    * @return toString
    */
    public String toString()
    {
        StringBuilder returnVal = new StringBuilder();
        returnVal.append("Name: ").append(title).append(" ")
                 .append(initials).append(" ").append(surname);
        return returnVal.toString();
    }

}
