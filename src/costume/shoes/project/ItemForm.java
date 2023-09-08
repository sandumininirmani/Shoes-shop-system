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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SoftwareDeveloper
 */
public class ItemForm extends javax.swing.JFrame {

    String un="root";
    String pw="";
    String datacon="jdbc:mysql://localhost:3306/pc";
    
     Connection sqlcon=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    /**
     * Creates new form ItemForm
     */
    public ItemForm() {
        initComponents();
    }

//      public void Allrecode(){
//        model.setColumnIdentifiers(column);
//        model.addRow(row);
//        tblStore.setModel(model);
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            sqlcon=DriverManager.getConnection(datacon,un,pw);
//            
//             String quary="SELECT `Product No`,`Name`,`Available Quantity`,`Unit Price` FROM `itemtable`";
//          
//            pst=sqlcon.prepareStatement(quary);
//            rs=pst.executeQuery(quary);
//            
//            ResultSetMetaData setData=rs.getMetaData();
//            int q=setData.getColumnCount();
//            
//            DefaultTableModel RecordTable=(DefaultTableModel)tblStore.getModel();
//            RecordTable.setRowCount(0);
//           
//             while(rs.next()){
//                Vector cData=new Vector();
//                for(int i=1;i<q; i++){
//                    cData.add(rs.getString("Product No"));
//                    cData.add(rs.getString("Name"));
//                    cData.add(rs.getString("Available Quantity"));
//                    cData.add(rs.getString("Unit Price"));
//                  
//                }
//                RecordTable.addRow(cData);
//            }
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ItemForm.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ItemForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/item.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 360));

        jPanel2.setBackground(new java.awt.Color(3, 21, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Registration");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, 60));

        jPanel3.setBackground(new java.awt.Color(113, 121, 121));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Item Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setText("Item Code");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Unit Price");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        txtItemName.setBackground(new java.awt.Color(203, 203, 203));
        txtItemName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemNameKeyPressed(evt);
            }
        });
        jPanel3.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 220, 40));

        txtItemCode.setBackground(new java.awt.Color(203, 203, 203));
        txtItemCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyPressed(evt);
            }
        });
        jPanel3.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 220, 40));

        txtQuantity.setBackground(new java.awt.Color(203, 203, 203));
        txtQuantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });
        jPanel3.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 40));

        txtUnitPrice.setBackground(new java.awt.Color(203, 203, 203));
        txtUnitPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 220, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 380, 260));

        btCancel.setBackground(new java.awt.Color(181, 177, 214));
        btCancel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/clear.png"))); // NOI18N
        btCancel.setText(" Cancel");
        btCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 260, 40));

        btAdd.setBackground(new java.awt.Color(181, 177, 214));
        btAdd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/add-file.png"))); // NOI18N
        btAdd.setText(" ADD");
        btAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jPanel1.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
       
             String insertQuery="INSERT INTO itemtable(itemname, itemcode, quantity, unitprice) VALUES (?,?,?,?);";
            
            
            String ItemName=txtItemName.getText();
            String ItemCode=txtItemCode.getText();
            String Quantity=txtQuantity.getText();
            String UnitPrice=txtUnitPrice.getText();
            
               if(!ItemName.equals("")){
            if(ItemCode.equals("")){
                JOptionPane.showMessageDialog(this,"Item Code is Required");
                txtItemCode.requestFocus();
                }
            if(!ItemCode.equals("")){
                String iQuery="SELECT  itemcode FROM itemtable WHERE itemcode =?;";
                String iCode="";
                pst=sqlcon.prepareStatement(iQuery);
                pst.setString(1,ItemCode);
                rs=pst.executeQuery();
                while(rs.next()){
                    iCode=rs.getString("itemcode");
                    }
                if(iCode.equals("")){
                pst=sqlcon.prepareStatement(insertQuery);
                pst.setString(1,ItemName);
                pst.setString(2,ItemCode);
                pst.setString(3,Quantity);
                pst.setString(4,UnitPrice);
                
                pst.executeUpdate();
                
                    JOptionPane.showMessageDialog(this," ITEM Registration Sucessfully");
                txtItemName.setText(null);
                txtItemCode.setText(null);
                txtQuantity.setText(null);
                txtUnitPrice.setText(null);
                
                txtItemName.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(this,"ITEM Code is Already Taken");
                    txtItemCode.setText(null);
                    txtItemCode.requestFocus();
                    }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Item Name is Required");
            txtItemName.requestFocus();
        }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btAddActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.setVisible(false);
        new SLSystem().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelActionPerformed

    private void txtItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtItemCode.requestFocus();
               }
    }//GEN-LAST:event_txtItemNameKeyPressed

    private void txtItemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtQuantity.requestFocus();
               }        
    }//GEN-LAST:event_txtItemCodeKeyPressed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtUnitPrice.requestFocus();
               }    
        
    }//GEN-LAST:event_txtQuantityKeyPressed

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
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
