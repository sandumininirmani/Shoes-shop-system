/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package costume.shoes.project;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SoftwareDeveloper
 */
public class RegisterForm extends javax.swing.JFrame {

    String un="root";
    String pw="";
    String datacon="jdbc:mysql://localhost:3306/pc";
    
    Connection sqlcon=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btRegister = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 199, 215));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(113, 121, 121));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("User Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 30));

        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel3.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 230, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setText("Re-Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Contact No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        txtContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel3.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 30));

        btRegister.setBackground(new java.awt.Color(45, 2, 16));
        btRegister.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btRegister.setForeground(new java.awt.Color(255, 255, 255));
        btRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/register.png"))); // NOI18N
        btRegister.setText(" Register");
        btRegister.setToolTipText("");
        btRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

        txtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 230, 30));

        txtRePassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRePasswordKeyPressed(evt);
            }
        });
        jPanel3.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 230, 30));

        jButton3.setBackground(new java.awt.Color(45, 2, 16));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/clear.png"))); // NOI18N
        jButton3.setText(" Clear");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 200, 40));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 10, 56));
        jLabel1.setText("Register Now");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 370));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Shoes Sales System");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 440, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/icons8-shoes-64.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 450));

        jButton2.setBackground(new java.awt.Color(113, 121, 121));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 110, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/kki.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
            
            String InsertQuery="INSERT INTO `login`(`username`, `name`, `password`, `contact`) VALUES (?,?,?,?)";
            
            String UsertName=txtUserName.getText();
            String Name=txtName.getText();
            String Password=txtPassword.getText();
            String Repassword=txtRePassword.getText();
            String Contact=txtContact.getText();
            
            if((!UsertName.equals(""))&&(!Name.equals(""))&&(!Password.equals(""))&&(!Repassword.equals(""))&&(!Contact.equals(""))){
                String usernameQuery="SELECT `username` FROM `login` WHERE username=?;";
                String chkUsername="";
                pst=sqlcon.prepareStatement(usernameQuery);
                pst.setString(1, UsertName);
                rs=pst.executeQuery();
                while(rs.next()){
                    chkUsername=rs.getString("username");
                }
                
                if(chkUsername.equals("")){
                    if(Password.equals(Repassword)){
                        pst=sqlcon.prepareStatement(InsertQuery);
                        pst.setString(1, UsertName);
                        pst.setString(2, Name);
                        pst.setString(3, Password);
//                        pst.setString(4, Repassword);
                        pst.setString(4, Contact);
                        
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Successfully Registered !", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        new Login().setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(this, "Password doesn't match !", "Registration Error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText(null);
                        txtRePassword.setText(null);
                        txtPassword.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "User already exists !", "Registration Error", JOptionPane.WARNING_MESSAGE);
                    txtUserName.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "One or more fields are Empty !", "Registration Error", JOptionPane.ERROR_MESSAGE);
                txtContact.requestFocus();
            } 
            
            
            
            
         
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

       this.setVisible(false);
       new Login().setVisible(true);      
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtUserName.setText(null);
        txtName.setText(null);
        txtPassword.setText(null);
        txtRePassword.setText(null);
        txtContact.setText(null);

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
//        int position=txtUserName.getCaretPosition();
//        txtUserName.setText(txtUserName.getText().toUpperCase(Locale.ITALY));
//        txtUserName.setCaretPosition(position);

    
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             txtName.requestFocus();
               }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             txtPassword.requestFocus();
               }
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             txtRePassword.requestFocus();
               }
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtRePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePasswordKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             txtContact.requestFocus();
               }
        
    }//GEN-LAST:event_txtRePasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegister;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
