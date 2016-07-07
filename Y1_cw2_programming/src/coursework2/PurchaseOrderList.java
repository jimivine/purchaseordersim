package coursework2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author upz12dyu
 */
public class PurchaseOrderList 
{
    private ArrayList<PurchaseOrder> orders;

    /**
    * Creates a Purchase Order List.
    */
    public PurchaseOrderList()
    {
        orders = new ArrayList<PurchaseOrder>();
    }
     
    /**
    * @return  an array containing all the purchase orders in this list,
    *          if this list is not empty, otherwise null.
    */
   public PurchaseOrder [] getPurchaseOrders()
   {
        if(orders.size()>1) //if array size is greater than 1, returns array
        {
            Object[] stockArray;
            stockArray = orders.toArray();
            PurchaseOrder[] array = Arrays.copyOf(stockArray, stockArray.length,
                                    PurchaseOrder[].class);
            return array;
        }
        else
        {
            return null;
        }
   }
   
    /**
    * Stores details of new purchase orders into the PurchaseOrderList.
    * @param newPurchaseOrder the new purchase order to be stored.
    */
    public void addPurchaseOrder(PurchaseOrder newPurchaseOrder)
    {
        orders.add(newPurchaseOrder);
    }
    
    /**
    * Clears a Purchase Order List.
    */
    public void clearPurchaseOrder()
    {
        orders.clear();
    }
}
