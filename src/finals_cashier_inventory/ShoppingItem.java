/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals_cashier_inventory;

import java.util.Map;

/**
 *
 * @author sherj
 */
public class ShoppingItem {
     String pname;
     String pqty;
     String pprice;
     
    

    public ShoppingItem(String pname, String pqty, String pprice) {
        this.pname = pname;
        this.pqty = pqty;
        this.pprice = pprice;
       
    }
    
    
public boolean isProductNameExists(ShoppingItem[] shoppingList, String productName) {
    for (ShoppingItem item : shoppingList) {
        if (item != null && item.pname.equalsIgnoreCase(productName)) {
        
        }
            return true;
            
    }
    return false;
}
    // Getters and setters for each field
}
