import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 * 
 * A class representing the GUI for updating a product in the inventory system.
 * 
 * Extends JFrame and implements ActionListener interface.
 */

public class ProductUpdate extends JFrame implements ActionListener {
    private JTextField txtProdID, txtProdName, txtProdCost, txtProdStock;

    /**
     * 
     * Constructor for ProductUpdate class.
     * Initializes the GUI components, sets the title, default close operation,
     * size and location of the window.
     */
    public ProductUpdate() {
        setTitle("Update Product");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);

        // Create welcome message label
        JLabel welcomeLabel = new JLabel(
                "<html>Please update the selected Product</html>");
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
        welcomeLabel.setForeground(new Color(0x009688));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create form panel
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBackground(new Color(0xFFFFFF));
        JLabel idLabel = new JLabel("Product ID:");
        txtProdID = new JTextField();
        txtProdID.setColumns(10);
        JLabel firstNameLabel = new JLabel("Product Name:");
        txtProdName = new JTextField();
        txtProdName.setColumns(10);
        JLabel lastNameLabel = new JLabel("Product Cost:");
        txtProdCost = new JTextField();
        txtProdCost.setColumns(10);
        JLabel addressLabel = new JLabel("Product Stock:");
        txtProdStock = new JTextField();
        txtProdStock.setColumns(10);
        formPanel.add(idLabel);
        formPanel.add(txtProdID);
        formPanel.add(firstNameLabel);
        formPanel.add(txtProdName);
        formPanel.add(lastNameLabel);
        formPanel.add(txtProdCost);
        formPanel.add(addressLabel);
        formPanel.add(txtProdStock);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(new Color(0xFFFFFF));
        JButton updateButton = new JButton("Update");
        updateButton.setBackground(new Color(0x009688));
        updateButton.setForeground(new Color(0xFFFFFF));
        updateButton.setFocusPainted(false);
        updateButton.addActionListener(this);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(new Color(0x009688));
        cancelButton.setForeground(new Color(0xFFFFFF));
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(e -> {
            dispose();
            new ProductsPage().setVisible(true);
        });
        buttonPanel.add(updateButton);
        buttonPanel.add(cancelButton);

        // Wrap form panel and button panel in another panel
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.setBackground(new Color(0xFFFFFF));
        wrapperPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        wrapperPanel.add(formPanel, BorderLayout.CENTER);
        wrapperPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add components to the frame
        Container container = getContentPane();
        container.setLayout(new BorderLayout(0, 20));
        container.setBackground(new Color(0xFFFFFF));
        container.add(welcomeLabel, BorderLayout.NORTH);
        container.add(wrapperPanel, BorderLayout.CENTER);
    }

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        updateProduct();
    }

    private void updateProduct() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost:3306/purchases";
            String user = "root";
            String password = "Jamie1997";
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, user, password);

            // Prepare the SQL statement
            String sql = "UPDATE product SET ProdName=?, ProdCost=?, ProdStock=? WHERE ProdID=?";
            pstmt = conn.prepareStatement(sql);

            // Set the values of the parameters
            pstmt.setString(1, txtProdName.getText());
            pstmt.setString(2, txtProdCost.getText());
            pstmt.setString(3, txtProdStock.getText());
            pstmt.setString(4, txtProdID.getText());

            // Execute the SQL statement
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Product updated successfully");
                dispose();
                new ProductsPage().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update product");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while updating product: " + ex.getMessage());
        } finally {
            // Close the database resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,
                        "An error occurred while closing database resources: " + ex.getMessage());
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProductUpdate productUpdate = new ProductUpdate();
        productUpdate.setVisible(true);
    }
}
