package finals_cashier_inventory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingList implements ShoppingListInterface{
    private List<Map<String, Object>> items;

    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addProduct(String name, String quantity, String price) {
        Map<String, Object> item = new HashMap<>();
        item.put("pname", name);
        item.put("pqty", quantity);
        item.put("pprice", price);
        items.add(item);
    }

    @Override
    public List<Map<String, Object>> getAllProducts() {
        return items;
    }

    @Override
    public Map<String, Object> getProduct(String name) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                return item;
            }
        }
        return null;
    }

    
    
    
    @Override
    public boolean isExisting (String name) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                return true;
            }
            
        }
        return false;
    }
    @Override
    public void updateQuantity(String name, int quantity) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                item.put("pqty", Integer.toString(quantity));
                return;
            }
        }
        throw new IllegalArgumentException("Product not found: " + name);
    }

    @Override
    public void removeProduct(String name) {
        items.removeIf(item -> item.get("pname").equals(name));
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map<String, Object> item : items) {
            totalPrice += Double.parseDouble((String)item.get("pqty"))  * Double.parseDouble((String)item.get("pprice"));
        }
        return totalPrice;
    }

    @Override
    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (Map<String, Object> item : items) {
            totalQuantity += (int) item.get("pqty");
        }
        return totalQuantity;
    }

    @Override
    public void clearCart() {
        items.clear();
    }
}