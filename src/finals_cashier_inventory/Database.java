package finals_cashier_inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database implements DatabaseInterface{
    public Connection conn = null;

    @Override
    public void connect() {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/inventory","root","");  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void executeStatement(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public ResultSet executeSearch(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            return result;
        } catch (SQLException e) {
            System.out.println(e);
            ResultSet result = null;
            return result;
        }
    }

    @Override
    public void loopThroughResultSet(ResultSet resultSet) {
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                System.out.println("Row:");

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);
                    System.out.println("  " + columnName + ": " + columnValue);
                }
                System.out.println(); 
            }
        } catch (SQLException e) {
            System.out.println("Error while looping through ResultSet: " + e.getMessage());
        }
    }
 @Override
  public String replaceWildcards(String query, Object... keyValues) {
    if (keyValues.length % 2 != 0) {
        throw new IllegalArgumentException("Number of key-value pairs must be even.");
    }

    for (int i = 0; i < keyValues.length; i += 2) {
        String wildcard = (String) keyValues[i];
        Object replacement = keyValues[i + 1];

        if (replacement instanceof String) {
            query = query.replace(wildcard, (String) replacement);
        } else if (replacement instanceof Integer) {
            query = query.replace(wildcard, String.valueOf((Integer) replacement));
        } else if (replacement instanceof Float) {
            query = query.replace(wildcard, String.valueOf((Float) replacement));
        } else {
            System.out.println("Error");
        }
    }
    return query;
}
     @Override
    public void getProducts(){
        ResultSet result = executeSearch("SELECT * FROM inv");
        loopThroughResultSet(result);  
    } 
    // db.getQty(selected_text);         if (Interger.parseInt(selected_text) <= db.getQty(selected_text) ... else ... error.setText(Quantity Exceeded the Stocks)
    public int getQty(String product_name){
        String sql = "SELECT * FROM inv WHERE pname = \'" + product_name + "\'";
        ResultSet result = executeSearch(sql);
        
        try {
            result.next();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            return Integer.parseInt(result.getString("pqty"));
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
     @Override
    public void addProduct(String product_name, String product_price, String product_qty){
        String sql = "INSERT INTO inv (pname, pqty, pprice) VALUES ('{pname}', '{pqty}', '{pprice}')";
        String translated_sql = replaceWildcards(sql, "{pname}", product_name, "{pqty}", product_qty, "{pprice}", product_price);
        executeStatement(translated_sql);
    }
     @Override
    public Product isProductExisting(String name) {
        try{
              String sql = "SELECT * FROM inv WHERE pname = '{pname}'";
        String newsql = replaceWildcards(sql, "{pname}", name);
        ResultSet result = executeSearch(newsql);       
        if (!result.isBeforeFirst()){
            return null;
        }
        else{
            result.next();
            return new Product(result.getString("pname"), "1", result.getString("pqty"));
        }
    }
    catch (SQLException e){
            System.out.println(e);
}    
        return null;
}    
}