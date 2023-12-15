package finals_cashier_inventory;

import java.util.List;
import java.util.Map;

public interface ShoppingListInterface {
    public void addProduct(String name, String quantity, String price);
    public List<Map<String, Object>> getAllProducts();
    public Map<String, Object> getProduct(String name); 
    public boolean isExisting (String name);
    public void updateQuantity(String name, int quantity);
    public void removeProduct(String name);
    public double getTotalPrice();
    public int getTotalQuantity();
    public void clearCart() ;
}
    

