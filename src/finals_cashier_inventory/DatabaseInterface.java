package finals_cashier_inventory;

import java.sql.Connection;
import java.sql.ResultSet;


public interface DatabaseInterface {

    public Connection conn = null;

    public void connect();

    public void executeStatement(String sql);

    public ResultSet executeSearch(String sql);

    public void loopThroughResultSet(ResultSet resultSet);

    public String replaceWildcards(String query, Object... keyValues);

    
    
    
    public void getProducts();
    
    public void addProduct(String product_name, String product_price, String product_qty);
    
    
    public Product isProductExisting(String name);
        
    
    
  
    
}
