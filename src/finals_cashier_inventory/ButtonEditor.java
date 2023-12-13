package finals_cashier_inventory;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sherj
 */
public class ButtonEditor extends DefaultCellEditor implements ActionListener {

    private static final long serialVersionUID = 1L;

    protected JButton button;
    private JTable table;
    private int row;
    private int column;

    public ButtonEditor(JCheckBox checkBox, String text) {
        super(checkBox);
        button = new JButton(text);
        button.setText(text);
        button.addActionListener(this);
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        this.column = column;

        button.setText((value == null) ? "" : value.toString());
        
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        // You can access table data using row and column variables
        
        System.out.println(e);
        System.out.println("Clicked");
    }
}

