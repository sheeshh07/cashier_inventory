/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals_cashier_inventory;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Winmri
 */
public class ShoppingListTester {
    
    
    public static void main(String[] args) {
        ShoppingList cart = new ShoppingList();
        
        cart.addProduct("Piatos", "25", "20");
        List<Map<String, Object>> current_cart = cart.getAllProducts();
        
        
        Scanner input= new Scanner(System.in);
        String pname, pqty, pprice; 

        
        System.out.println("Enter Product Name");
        pname = input.nextLine();
        
        System.out.println("Enter Product Quantity");
        pqty = input.nextLine();
        
        
        System.out.println("Enter Product Price");
        pprice = input.nextLine();
        
        
        if(cart.isExisting(pname)){
            Map<String, Object> current_product = cart.getProduct(pname);
            int newQuantity = Integer.parseInt(current_product.get("pqty").toString()) + Integer.parseInt(pqty);
            cart.updateQuantity(pname, newQuantity);

            System.out.println("Product quantity updated successfully!");
        }
        else{
            cart.addProduct(pname, pqty, pprice);
        }
        
        List<Map<String, Object>> products = cart.getAllProducts();
        for (int i = 0; i < products.size(); i++){
            Map<String, Object> product = products.get(i);
            System.out.println("Name: " + product.get("pname"));
            System.out.println("Quantity: " + product.get("pqty"));
        }
        
        
       
        
}
    
}
