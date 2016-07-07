package coursework2;

import java.util.regex.Pattern;

/**
 *
 * @author upz12dyu
 */
public class Product 
{
    private String productCode;
    private double pricePerUnit;
    
//  Constructor
    public Product(String productCode, double pricePerUnit) 
                                 throws InvalidProductCodeException
    {
        this.productCode = productCode;
        this.pricePerUnit = pricePerUnit;
        
        if(!Pattern.matches("\\w{2}/\\d{3}",this.productCode))
        {
            throw new InvalidProductCodeException("Invalid Product Code");
        } 
      
    }
    
    /**
    * Mutator method - Sets the productCode of the item.
    * @param productCode        The product code of the item.
    */
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    /**
    * Mutator method - Sets the pricePerUnit of the item.
    * @param pricePerUnit        The price of the item per unit.
    */
    public void setPricePerUnit(double pricePerUnit) 
    {
        this.pricePerUnit = pricePerUnit;
    }

    /**
    * Accessor method
    * @return the productCode of this
    */
    public String getProductCode() 
    {
        return productCode;
    }

    /**
    * Accessor method
    * @return the pricePerUnit of this
    */
    public double getPricePerUnit() 
    {
        return pricePerUnit;
    }
}
