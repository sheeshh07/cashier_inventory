package finals_cashier_inventory;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class productForm extends javax.swing.JFrame {

    public productForm() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();
        prdSearch = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        forName = new javax.swing.JLabel();
        forPrice = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        forQty = new javax.swing.JLabel();
        prdAdd = new javax.swing.JButton();
        prdUpdate = new javax.swing.JButton();
        prdDelete = new javax.swing.JButton();
        btnAdm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(103, 2, 11));

        jTable1.setBackground(new java.awt.Color(243, 225, 225));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack2.setBackground(new java.awt.Color(228, 212, 212));
        btnBack2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        prdSearch.setBackground(new java.awt.Color(228, 212, 212));
        prdSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prdSearch.setText("Search");
        prdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdSearchActionPerformed(evt);
            }
        });

        id.setBackground(new java.awt.Color(204, 204, 204));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Product Id :");

        forName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        forName.setText("Product Name :");

        forPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        forPrice.setText("Product Price :");

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        price.setBackground(new java.awt.Color(204, 204, 204));

        qty.setBackground(new java.awt.Color(204, 204, 204));

        forQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        forQty.setText("Product Qty :");

        prdAdd.setBackground(new java.awt.Color(228, 212, 212));
        prdAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prdAdd.setText("Add");
        prdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdAddActionPerformed(evt);
            }
        });

        prdUpdate.setBackground(new java.awt.Color(228, 212, 212));
        prdUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prdUpdate.setText("Update");
        prdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdUpdateActionPerformed(evt);
            }
        });

        prdDelete.setBackground(new java.awt.Color(228, 212, 212));
        prdDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prdDelete.setText("Delete");
        prdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdDeleteActionPerformed(evt);
            }
        });

        btnAdm.setBackground(new java.awt.Color(228, 212, 212));
        btnAdm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdm.setText("Cashier");
        btnAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forName)
                            .addComponent(forPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forQty, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prdSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(132, 132, 132))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(forPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(prdSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(243, 225, 225));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("PRODUCT FORM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(457, 457, 457))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
     
    }//GEN-LAST:event_nameActionPerformed

    private void prdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdSearchActionPerformed
        Database db = new Database();
        db.connect();
        
        try{

        String sql = "SELECT * FROM inv WHERE pid = '{pid}'";
        String newsql = db.replaceWildcards(sql, "{pid}", id.getText());
        ResultSet result = db.executeSearch(newsql);
        
        if (!result.isBeforeFirst()){
            JOptionPane.showMessageDialog(null, "Product is Not Existing!!","Product isnt existing", JOptionPane.ERROR_MESSAGE);

        }
        else{ 
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            
            while(result.next())
            {
            Object[] rowData = {result.getString("pid"),result.getString("pname"),result.getString("pprice"),result.getString("pqty")};
            tableModel.addRow(rowData);    
            }
        }  
          }
    catch (SQLException e){
            System.out.println(e);
}
    }//GEN-LAST:event_prdSearchActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_idActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        Welcome welc2 = new Welcome();
        welc2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack2ActionPerformed
    private void prdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdDeleteActionPerformed
        
        
        
        if (name.getText().equals("") && qty.getText().equals("") && price.getText().equals("") ){
        JOptionPane.showMessageDialog(null, "Fill all the needed details!!","Delete", JOptionPane.ERROR_MESSAGE);
        }
        else {
        Database db = new Database();
        db.connect();

        String product_name = null, product_qty = null, product_price = null, product_id = null;

        product_name = name.getText();
        product_qty = qty.getText();
        product_price = price.getText();
        product_id = id.getText();

        String sql = "DELETE FROM inv WHERE pid='{pid}'";
        String translated_sql = db.replaceWildcards(sql, "{pid}", product_id);
        db.executeStatement(translated_sql);

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        tableModel.setRowCount(0);
        JOptionPane.showMessageDialog(null, "Product Deleted Successfully!!","Product Deleted", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_prdDeleteActionPerformed

//GEN-FIRST:event_prdUpdateActionPerformed
    private void prdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdUpdateActionPerformed
       
       
       if (name.getText().equals("") && qty.getText().equals("") && price.getText().equals("") ){
        JOptionPane.showMessageDialog(null, "Fill all the needed details!!","Update", JOptionPane.ERROR_MESSAGE);
        }
       
       else{
       Database db = new Database();
       db.connect();
        
       String product_name = null, product_qty = null, product_price = null, product_id = null;
        
       product_name = name.getText();
       product_qty = qty.getText();
       product_price = price.getText();
       product_id = id.getText();
      
       String sql = "UPDATE inv SET pname='{pname}', pprice='{pprice}', pqty='{pqty}' WHERE pid='{pid}'";
       String translated_sql = db.replaceWildcards(sql, "{pid}", product_id, "{pname}", product_name, "{pqty}", product_qty, "{pprice}", product_price);
       db.executeStatement(translated_sql);
       
       JOptionPane.showMessageDialog(null, "Product Updated Successfully!!","Product Update", JOptionPane.INFORMATION_MESSAGE);
       }

    }
//GEN-LAST:event_prdUpdateActionPerformed

    private void prdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdAddActionPerformed
        
        
        if (name.getText().equals("") && qty.getText().equals("") && price.getText().equals("") ){
        JOptionPane.showMessageDialog(null, "Fill all the needed details!!","Product Added", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
        Database db = new Database();
        db.connect();

        String product_name = null, product_qty = null, product_price = null, product_id = null;

        product_name = name.getText();
        product_qty = qty.getText();
        product_price = price.getText();
        product_id = id.getText();

        String sql = "INSERT INTO inv (pid, pname, pprice, pqty) VALUES ('{pid}','{pname}', '{pprice}',  '{pqty}')";
        String translated_sql = db.replaceWildcards(sql, "{pid}", product_id, "{pname}", product_name, "{pqty}", product_qty, "{pprice}", product_price);
        db.executeStatement(translated_sql);
        
        
        JOptionPane.showMessageDialog(null, "Product Added Successfully!!","Product Added", JOptionPane.INFORMATION_MESSAGE);        
        }
    }//GEN-LAST:event_prdAddActionPerformed

    private void btnAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmActionPerformed
        try {
            usersample cashier = new usersample();
            cashier.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(productForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAdmActionPerformed
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdm;
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel forName;
    private javax.swing.JLabel forPrice;
    private javax.swing.JLabel forQty;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JButton prdAdd;
    private javax.swing.JButton prdDelete;
    private javax.swing.JButton prdSearch;
    private javax.swing.JButton prdUpdate;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables

    
    
}