package Frames;

import java.awt.*;
import javax.swing.*;
import classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;



/**
 *
 * @author anasg
 */
public class pay extends javax.swing.JFrame {

    
    
    
    Seats s = Seats.getInstance();
    String seat_id = s.getSeatIdentifier();
    double paymentAmount ;
    DB_manager db = new DB_manager();    
    private static final float DEFAULT_TRANSPARENCY = 0.5f;
    /**
     * Creates new form pay
     */
    public pay() {
        setIcon();
    BG("/images/anna-sullivan-ZoQinVwi6-4-unsplash.jpeg");
    
        System.out.println("seat id:"+seat_id);
    try{ ResultSet rs= db.executeQuery("SELECT total_Cost FROM boardings where seat_identifier = '"+seat_id+"';");
    
    if(rs.next())
        paymentAmount = rs.getDouble(1);
    
    
    
    
    }
    catch(Exception e){};
    
        initComponents();
        pay_amount.setText(""+paymentAmount);
   
}
    
    
    
    public void BG(String imagePath){
            JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, DEFAULT_TRANSPARENCY));

                // Load image (error handling can be added)
                ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
                Image image = imageIcon.getImage();

                int imageWidth = image.getWidth(null);
                int imageHeight = image.getHeight(null);

                // Tile or scale the image to fit the panel (optional customization)
                int panelWidth = getWidth();
                int panelHeight = getHeight();
                for (int y = 0; y < panelHeight; y += imageHeight) {
                    for (int x = 0; x < panelWidth; x += imageWidth) {
                        g2d.drawImage(image, x, y, this);
                    }
                }
            }
            

            }; 
            
            backgroundPanel.setOpaque(false); // Make panel transparent

        // Add your other components to the background panel here

        setContentPane(backgroundPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Adjust frame size if needed
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true);
    }

    
    
    public void setIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/ico_oop.png"));
        setIconImage(icon.getImage());
        BackgroundPanel backgroundPanel = new BackgroundPanel("/images/ico_oop.png");
        setContentPane(backgroundPanel);
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pay_amount = new javax.swing.JLabel();
        number_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Payment amount: ");

        number_txt.setText("Enter card number");

        name_txt.setText("Enter name on card");

        jTextField2.setText("Expiary date");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("CVV");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Submmit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(number_txt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pay_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(name_txt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pay_amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frame_home home_frame= new Frame_home();
        home_frame.setVisible(true);
        home_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home_frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Retrieve input values
    String Card_name = name_txt.getText().trim();
    String Card_number = number_txt.getText().trim();
    String Expiration_date = jTextField2.getText().trim();
    String CVV = jTextField3.getText().trim();
    
    // Validate input values
    if (Card_name.isEmpty() || Card_name.equals("Name on card") ||
        Card_number.isEmpty() || Card_number.equals("Card number") ||
        Expiration_date.isEmpty() || Expiration_date.equals("Expiration date") ||
        CVV.isEmpty() || CVV.equals("CVV")) {
        JOptionPane.showMessageDialog(this, "Please fill in all payment information.");
        return; // Return without proceeding to the next frame
    }
    
    // Query the database to check if the card exists and has sufficient funds
    try {
        // Construct the SQL query to check if the card exists and has sufficient funds
        String query = "SELECT * FROM cards WHERE Card_name = ? AND Card_number = ? AND Expiration_date = ? AND CVV = ?";
        
        // Prepare the statement
        PreparedStatement preparedStatement = db.getConnection().prepareStatement(query);
        preparedStatement.setString(1, Card_name);
        preparedStatement.setString(2, Card_number);
        preparedStatement.setString(3, Expiration_date);
        preparedStatement.setString(4, CVV);
        
        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();
        
        // Check if a card with the provided details exists
        if (resultSet.next()) {
            // Card exists, check if it has sufficient funds
            double amount = resultSet.getDouble(6);
            
            //paymentAmount
            
            
            pay_amount.setText(""+paymentAmount);
            if (amount >= paymentAmount) {
                // Sufficient funds, deduct the payment amount from the card's balance
                double remainingAmount = amount - paymentAmount;
                // Update the card's balance in the database
                String updateQuery = "UPDATE cards SET amount = ? WHERE Card_name = ? AND Card_number = ? AND Expiration_date = ? AND CVV = ?";
                PreparedStatement updateStatement = db.getConnection().prepareStatement(updateQuery);
                updateStatement.setDouble(1, remainingAmount);
                updateStatement.setString(2, Card_name);
                updateStatement.setString(3, Card_number);
                updateStatement.setString(4, Expiration_date);
                updateStatement.setString(5, CVV);
                updateStatement.executeUpdate();
                
                
                //update the seat emtp
                String updateseat = "UPDATE flight_seats SET `empty` = ?;";
                PreparedStatement updateS_seat = db.getConnection().prepareStatement(updateseat);
                updateS_seat.setString(1, "0");  //0 for not empty
                        
                
                // Display a success message
                JOptionPane.showMessageDialog(this, "Payment successful!");
                
                // Proceed to the boarding frame
                Traveler_boarding tb = new Traveler_boarding();
                tb.setVisible(true);
                tb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tb.setLocationRelativeTo(null);
                this.dispose();
            } else {
                // Insufficient funds, display an error message
                JOptionPane.showMessageDialog(this, "Insufficient funds. Please use another card or check your balance.");
            }
        } else {
            // Card not found in the database, display an error message
            JOptionPane.showMessageDialog(this, "Invalid card details. Please check your card information.");
        }
        
        // Close the result set and statements
        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        // Handle the SQL exception properly
        JOptionPane.showMessageDialog(this, "Error accessing database. Please try again later.");
        ex.printStackTrace();
    }
    

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField number_txt;
    private javax.swing.JLabel pay_amount;
    // End of variables declaration//GEN-END:variables
}
