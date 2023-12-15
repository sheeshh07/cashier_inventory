package finals_cashier_inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ShoppingListInterface {
    // Create
    public void addProduct(String name, String quantity, String price);
    // To locate
    public List<Map<String, Object>> getAllProducts();
    public Map<String, Object> getProduct(String name); 
    //Search
    public boolean isExisting (String name);
    // Update
    public void updateQuantity(String name, int quantity);
    // Delete
    public void removeProduct(String name);
    // Other useful methods
    public double getTotalPrice();
    public int getTotalQuantity();
    public void clearCart() ;
}
    

