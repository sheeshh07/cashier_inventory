/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals_cashier_inventory;

/**
 *
 * @author sherj
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableModel;

public class CashierApp extends JFrame {

    private JLabel lblProductName, lblPrice, lblQuantity;
    private JTextField txtProductName, txtPrice, txtQuantity;
    private JButton btnAdd, btnClear;
    private JTable tableProducts;
    private JScrollPane scrollPane;
    private ResultSet resultSet;

    public CashierApp(ResultSet resultSet) {
        this.resultSet = resultSet;
        initComponents();
    }

    private void initComponents() {
        setTitle("Cashier App");
        setSize(400, 300);
        setLayout(new GridBagLayout());

        // Product Name
        lblProductName = new JLabel("Product Name:");
        txtProductName = new JTextField(20);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        add(lblProductName, c);
        c.gridx = 1;
        add(txtProductName, c);

        // Price
        lblPrice = new JLabel("Price:");
        txtPrice = new JTextField(10);
        c.gridy = 1;
        add(lblPrice, c);
        c.gridx = 1;
        add(txtPrice, c);

        // Quantity
        lblQuantity = new JLabel("Quantity:");
        txtQuantity = new JTextField(10);
        c.gridy = 2;
        add(lblQuantity, c);
        c.gridx = 1;
        add(txtQuantity, c);

        // Add button
        btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProductToTable();
            }
        });
        c.gridy = 3;
        c.gridx = 1;
        c.insets = new Insets(10, 5, 5, 5);
        add(btnAdd, c);

        // Clear button
        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        c.gridx = 0;
        add(btnClear, c);

        // Table
        try {
            tableProducts = new JTable(buildTableModel(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scrollPane = new JScrollPane(tableProducts);
        c.gridy = 4;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1.0;
        add(scrollPane, c);

        setVisible(true);
    }

    private void addProductToTable() {
        // TODO: Implement logic to add product to table based on user input

    }

    private void clearFields() {
        txtProductName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }

    private TableModel buildTableModel(ResultSet resultSet) throws SQLException {
        // TODO: Implement logic to build a TableModel from the ResultSet
        // ...

        return tableModel; // replace with your implementation
    }

    public static void main(String[] args) {
        // Replace with your actual database connection code
        ResultSet resultSet = null; // ...

        new CashierApp(resultSet);
    }
}
