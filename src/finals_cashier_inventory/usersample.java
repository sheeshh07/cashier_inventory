package finals_cashier_inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class usersample extends javax.swing.JFrame {
  
    private ButtonGroup buttonGroup;
    ShoppingList cart = new ShoppingList();

    public usersample() throws SQLException{
        initComponents();

        int count = 0;
        
    Database db = new Database();
    db.connect();
   
    buttonGroup = new ButtonGroup();

    String sql = "SELECT * FROM inv";
    ResultSet resultSet = db.executeSearch(sql);

    while (resultSet.next()) {
    String text = resultSet.getString("pname");

    JRadioButton radioButton = new JRadioButton(text);
    buttonGroup.add(radioButton);
    buttonPannel.add(radioButton);

    radioButton.setBounds(10, 10 + (count * 20), 200, 20);
    count++;
    }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPannel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnremove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnqty = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        checkout = new javax.swing.JButton();
        clearcart = new javax.swing.JButton();
        btn_bck = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 239, 239));
        setPreferredSize(new java.awt.Dimension(1077, 805));
        setResizable(false);
        setSize(new java.awt.Dimension(1077, 805));

        buttonPannel.setBackground(new java.awt.Color(243, 225, 225));

        jPanel2.setBackground(new java.awt.Color(103, 2, 11));

        btnremove.setBackground(new java.awt.Color(228, 212, 212));
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Quantity : ");
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentAdded(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(228, 212, 212));
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        prodTable.setBackground(new java.awt.Color(233, 227, 227));
        prodTable.setForeground(new java.awt.Color(153, 153, 153));
        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodTable);

        checkout.setBackground(new java.awt.Color(228, 212, 212));
        checkout.setText("PROCEED TO CHECKOUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        clearcart.setBackground(new java.awt.Color(228, 212, 212));
        clearcart.setText("CLEAR CART");
        clearcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearcartActionPerformed(evt);
            }
        });

        btn_bck.setBackground(new java.awt.Color(228, 212, 212));
        btn_bck.setText("Back");
        btn_bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bckActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 225, 225));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("TOTAL:");

        jLabel3.setText("PAYMENT :");

        payment.setBackground(new java.awt.Color(204, 204, 204));
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        jLabel4.setText("CHANGE  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnqty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_bck, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearcart)
                        .addGap(18, 18, 18)
                        .addComponent(checkout)))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkout)
                    .addComponent(clearcart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bck, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout buttonPannelLayout = new javax.swing.GroupLayout(buttonPannel);
        buttonPannel.setLayout(buttonPannelLayout);
        buttonPannelLayout.setHorizontalGroup(
            buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPannelLayout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        buttonPannelLayout.setVerticalGroup(
            buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buttonPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        String selectedTxt=null;
        Enumeration <AbstractButton> elements = buttonGroup.getElements();
        
        while(elements.hasMoreElements()){
            AbstractButton model = elements.nextElement();
           
            if(model.isSelected()){
               selectedTxt = model.getActionCommand();
           }
       }
            cart.removeProduct(selectedTxt);
            DefaultTableModel tablemodel = (DefaultTableModel) prodTable.getModel();
            tablemodel.setRowCount(0);
        
            List<Map<String, Object>> products = cart.getAllProducts();
                for (int i = 0; i < products.size(); i++){
                   Map<String, Object> product = products.get(i);
                   Object[] row = {"", product.get("pname"), product.get("pprice"), product.get("pqty")};
                   tablemodel.addRow(row);
                }
                total.setText(Double.toString(cart.getTotalPrice()));
                change.setText(Double.toString(Integer.parseInt(payment.getText()) - cart.getTotalPrice ()));
    }//GEN-LAST:event_btnremoveActionPerformed

    private void jLabel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentAdded

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       Database db = new Database();
       db.connect();
       String selectedTxt = null;
       
       Enumeration <AbstractButton> elements = buttonGroup.getElements();
       while(elements.hasMoreElements()){
            AbstractButton model = elements.nextElement();
           
            if(model.isSelected()){
                selectedTxt = model.getActionCommand();
           }
       }
       
       
        
        String sql = "SELECT * FROM inv WHERE pname = '{pname}' ";
        String translatedsql = db.replaceWildcards(sql, "{pname}", selectedTxt);
        
        ResultSet result = db.executeSearch(translatedsql);
        
        try{ 
            while (result.next()){
                int curr_qty;
                Map<String, Object> current_product;
                if (cart.isExisting(result.getString("pname"))){
                     current_product = cart.getProduct(result.getString("pname"));
                     curr_qty = Integer.parseInt(( (String) current_product.get("pqty")));
                }
                else{
                    curr_qty = 0;
                }
                
                
          if(payment.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please add payment","Payment Error", JOptionPane.ERROR_MESSAGE);
          }
          else{
               if(db.getQty(selectedTxt) >= (int) btnqty.getValue() && (curr_qty + (int) btnqty.getValue()) <= db.getQty(selectedTxt) ){
                   if(cart.isExisting(result.getString("pname"))){
                       
                DefaultTableModel tablemodel = (DefaultTableModel) prodTable.getModel();
                tablemodel.setRowCount(0);
                current_product = cart.getProduct(result.getString("pname"));
                int newQuantity = Integer.parseInt(current_product.get("pqty").toString()) + (int)(btnqty.getValue());
                cart.updateQuantity(result.getString("pname"), newQuantity);
                List<Map<String, Object>> products = cart.getAllProducts();
                for (int i = 0; i < products.size(); i++){
                Map<String, Object> product = products.get(i);
                Object[] row = {"", product.get("pname"), product.get("pprice"), product.get("pqty")};
                tablemodel.addRow(row);
                }
                System.out.println("Product quantity updated successfully!");              
                
            }
            else{
                 DefaultTableModel tablemodel = (DefaultTableModel) prodTable.getModel();
                tablemodel.setRowCount(0);
                cart.addProduct(result.getString("pname"),Integer.toString((int) btnqty.getValue()) , result.getString("pprice"));
                
                List<Map<String, Object>> products = cart.getAllProducts();
                for (int i = 0; i < products.size(); i++){
                   Map<String, Object> product = products.get(i);
                   Object[] row = {"", product.get("pname"), product.get("pprice"), product.get("pqty")};
                   tablemodel.addRow(row);
                }
            }
             
             
         }
         else{
             JOptionPane.showMessageDialog(null, "Quantity is greater than available stocks","Out of Stocks", JOptionPane.ERROR_MESSAGE);
         }
          }
                 
        
                          
            }
            total.setText(Double.toString(cart.getTotalPrice()));         
            change.setText(Double.toString(Integer.parseInt(payment.getText()) - cart.getTotalPrice ()));
         }
        
        
        catch (SQLException e){
            System.out.println(e);
        }        
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
            Receipt rcpt = new Receipt(change.getText(), payment.getText(), cart);       
            rcpt.setVisible(true);
            this.dispose();
            
            Database db = new Database();
            db.connect();
       
           /* current_product = cart.getProduct(result.getString("pname"));
            int newQuantity = Integer.parseInt(current_product.get("pqty")) + (int)(btnqty.getValue());
            cart.updateQuantity(result.getString("pname"), newQuantity);
            ShoppingList upProd = new ShoppingList();
            cart.updateQuantity(ShoppingList upProd, cart.updateQuantity); */
    }//GEN-LAST:event_checkoutActionPerformed

    private void clearcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearcartActionPerformed
            cart.clearCart();
            DefaultTableModel tablemodel = (DefaultTableModel) prodTable.getModel();
            tablemodel.setRowCount(0);
    }//GEN-LAST:event_clearcartActionPerformed

    private void btn_bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bckActionPerformed
        Welcome newWelc = new Welcome();
        newWelc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_bckActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(usersample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new usersample().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(usersample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bck;
    private javax.swing.JButton btnadd;
    private javax.swing.JSpinner btnqty;
    private javax.swing.JButton btnremove;
    private javax.swing.JPanel buttonPannel;
    private javax.swing.JLabel change;
    private javax.swing.JButton checkout;
    private javax.swing.JButton clearcart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField payment;
    private javax.swing.JTable prodTable;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
