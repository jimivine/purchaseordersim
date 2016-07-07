package coursework2;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author upz12dyu
 */
public class OrderDate 
{
    private String date;
     
    /**
    * Creates a new OrderDate
    * @param date      must have the format "dd/mm/yy" otherwise
    * @throws IllegalDateFormatException
    */
    public OrderDate(String date) throws IllegalDateFormatException
    {
        if (checkDateValid(date) == true)
        {
            this.date = date;
        } 
        else 
        {
              throw new IllegalDateFormatException("Illegal Date Format");
        }
    }
   
    public boolean checkDateValid(String checkDate)
    {
        if(checkDate == null)
        {
            return false;
        }
                
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            sdf.setLenient(false);
                
	try 
        {
            Date validDate = sdf.parse(checkDate);
	} 
        
        catch (ParseException e) 
        {
            e.printStackTrace();
            return false;
        }
        
	return true;
    }

}
