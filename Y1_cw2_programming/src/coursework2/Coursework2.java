package coursework2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main method used for testing
 * @author upz12dyu
 */
public class Coursework2 
{

    public static void main(String[] args) 
    {
        System.out.println("Coursework to show basic Java Programming skills:");
        System.out.println("=== Coursework 2 from Programming Year 1 (March 2014) ===");
        System.out.println("");
        
        Boolean ck = true;
        while(ck == true){
            System.out.println("Please enter question number or type exit to quit system: ");
            String choice;

            Scanner i = new Scanner(System.in);
            choice = i.next();
            

            if(choice.contains("1")){
                //OrderDate Test       
                try 
                {
                    Scanner inputReg = new Scanner(System.in);
                    DateFormat df = new SimpleDateFormat("d/M/yyyy");
                    df.getCalendar().setLenient(false);
                    System.out.print("Enter new order date (DD/MM/YYYY): ");

                    Date theDate = null;
                    
                        String date=inputReg.nextLine();
                        System.out.println("date= "+ date);
                    //theDate = df.parse(date);
                    OrderDate orderDate = new OrderDate(date);
                     
                    //new OrderDate("26/02/2014");
                    System.out.println("New order date created");
                } 
                catch (IllegalDateFormatException e) 
                {
                    System.out.println(e);
                }
                ck = true;
            } else if(choice.contains("2")){
                //CustomerID validation test       
                CustomerDetailsList customerDetailsList = new CustomerDetailsList();
                try
                {      
                    customerDetailsList.addCustomerDetails(
                            new PrivateCustomerDetails(new Name("Mr","B","Bobbington"),
                                    "PSC-1234",
                                    new Address("234, lane road","Maldon","MLD 123"),
                                    "SC", 5));
                    System.out.println("New customer created PSC-1234");
                    CustomerDetails a = customerDetailsList.findCustomer("PSC-1234");
                    System.out.println("Test for finding customerID PSC-1234:");
                    System.out.println(a.toString());
                }
                catch(IllegalCustomerIDException e)
                {
                    System.out.println(e);
                } catch (CustomerNotFoundException ex) {
                    System.out.println(ex);
                } 
                ck = true;
            } else if(choice.contains("3")){
                //ProductCode validating test and discount test
                try
                {
                    System.out.println("Test for calculating the full and final price for customer PSC-1234:");
                    PurchaseOrder b = new PurchaseOrder("24/04/14","PSC-1234",15,
                                                        new Product("PV/573",15.50),5);
                    System.out.println("Full Price: " + b.getFullPrice());
                    System.out.println("Final Price: " + b.getFinalPrice());
                }
                catch(InvalidProductCodeException e)
                {
                    System.out.println(e);
                }
                ck = true;
            } else if(choice.contains("exit") || choice.contains("Exit")){
                System.exit(1);
                ck = false;
            } else{
                System.out.println("Error question number must be between 1 and 3");
                System.out.println("Type 'exit' to quit system.");
                ck = true;
            }
        }    
    }
}

    
    
    

