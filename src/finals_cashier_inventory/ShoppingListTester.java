/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals_cashier_inventory;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Winmri
 */
public class ShoppingListTester {
    
    
    public static void main(String[] args) {
        ShoppingList cart = new ShoppingList();
        
        cart.addProduct("Piatos", "25", "20");
        List<Map<String, Object>> current_cart = cart.getAllProducts();
        
        
        for (int i = 0; i < current_cart.size(); i++){
            Map<String, Object> product = current_cart.get(i);
        System.out.println("Product added:");
        System.out.println("Name: " + product.get("pname"));
        System.out.println("Quantity: " + product.get("pqty"));
        System.out.println("Price: " + product.get("pprice"));
        }
        
        
}
    
}
