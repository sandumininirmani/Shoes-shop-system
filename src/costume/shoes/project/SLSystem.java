/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package costume.shoes.project;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
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
 * @author user
 */
public class SLSystem extends javax.swing.JFrame {

    String un="root";
    String pw="";
    String datacon="jdbc:mysql://localhost:3306/pc";
    
    Connection sqlcon=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public SLSystem() {
        initComponents();
    }

    public void Allrecode(){
        Object[] row=new Object[4];
        Object[] coloumn={"itemname","itemcode","quantity","unitprice"};
        DefaultTableModel model=new DefaultTableModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
           
            String quary="SELECT `itemname`,`itemcode`,`quantity`,`unitprice` FROM `itemtable`";
         
            pst=sqlcon.prepareStatement(quary);
            rs=pst.executeQuery(quary);
            
            ResultSetMetaData setData=rs.getMetaData();
            int q=setData.getColumnCount();
            
            DefaultTableModel RecordTable=(DefaultTableModel)tblStore.getModel();
            RecordTable.setRowCount(0);
           
             while(rs.next()){
                Vector cData=new Vector();
                for(int i=1;i<q; i++){
                    cData.add(rs.getString("itemname"));
                    cData.add(rs.getString("itemcode"));
                    cData.add(rs.getString("quantity"));
                    cData.add(rs.getString("unitprice"));
                  
                }
                RecordTable.addRow(cData);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
     public SLSystem(String UN) {
        initComponents();
        txtUser.setText("Hello "+UN);
    }

    int f;
    
      public void UpdateTable(){
          
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
            
             int NewQty=Integer.parseInt(txtQuantity.getText());
            
            String UpQuery="SELECT  `quantity` FROM `itemtable` WHERE `itemcode`=?";
            String AvQty ="";
            
            pst=sqlcon.prepareStatement(UpQuery);
            pst.setString(1,txtProduct.getText());
            rs=pst.executeQuery();
            
            while(rs.next()){
            AvQty=rs.getString("quantity");
            
            }
            int upQty=(Integer.parseInt(AvQty))-NewQty;
            
            
            
            String Query="UPDATE `itemtable` SET `quantity`=? WHERE`itemcode`=?;";
            
            pst=sqlcon.prepareStatement(Query);
            
            pst.setInt(1,upQty);
            pst.setString(2,txtProduct.getText());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      }
    
     Object[] row3=new Object[4];
     Object[] coloumn3={"Product No","Name","Available Quantity","Unit Price"};
     DefaultTableModel model3=new DefaultTableModel();
     
      public void NewTable(){
        model3.setColumnIdentifiers(coloumn3);
        model3.addRow(row3);
        tblStore.setModel(model3);
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             sqlcon=DriverManager.getConnection(datacon,un,pw);
             
              String query="SELECT * FROM `itemtable`;";
            
            pst=sqlcon.prepareStatement(query);
             
             rs=pst.executeQuery(query);
             
             ResultSetMetaData setData=rs.getMetaData();
             
             int q=setData.getColumnCount();
             
             DefaultTableModel RecordTable1=(DefaultTableModel) tblStore.getModel();
             
             RecordTable1.setRowCount(0);
             
             while(rs.next()){
             Vector columndata=new Vector();
                for(int i=1;i<=q;i++){
                columndata.add(rs.getString("itemcode"));
                columndata.add(rs.getString("itemname"));
                columndata.add(rs.getString("quantity"));
                columndata.add(rs.getString("unitprice"));
                
                
                }
                
                RecordTable1.addRow(columndata);
             }
             
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        Object[] row=new Object[4];
        Object[] coloumn={"Product No","Name","Available Quantity","Unit Price"};
        DefaultTableModel model=new DefaultTableModel();
        
        Object[] row2=new Object[5];
        Object[] coloumn2={"Product No","Name","Available Quantity","Unit Price","Total Price"};
        DefaultTableModel model2=new DefaultTableModel();
            
  private void formWindowOpened(java.awt.event.WindowEvent evt) {
        model.setColumnIdentifiers(coloumn);
        model.addRow(row);
        tblStore.setModel(model);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
            
            String query="SELECT * FROM `itemtable`;";
            
            pst=sqlcon.prepareStatement(query);
             
             rs=pst.executeQuery(query);
             
             ResultSetMetaData stData=rs.getMetaData();
             
             int q=stData.getColumnCount();
             
             DefaultTableModel RecordTable=(DefaultTableModel) tblStore.getModel();
             
             RecordTable.setRowCount(0);
             
             while(rs.next()){
             Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                columnData.add(rs.getString("itemcode"));
                columnData.add(rs.getString("itemname"));
                columnData.add(rs.getString("quantity"));
                columnData.add(rs.getString("unitprice"));
                
                
                }
                
                RecordTable.addRow(columnData);
             }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
  
  
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStore = new javax.swing.JTable();
        btAdditem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTotal = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        btCal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        btBillPrw = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product No", "Name", "Available Quantity", "Unit Price"
            }
        ));
        jScrollPane1.setViewportView(tblStore);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 250));

        btAdditem.setBackground(new java.awt.Color(242, 235, 202));
        btAdditem.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btAdditem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/add-to-queue.png"))); // NOI18N
        btAdditem.setText(" ADD ITEM");
        btAdditem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAdditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdditemActionPerformed(evt);
            }
        });
        jPanel2.add(btAdditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 40));

        jLabel1.setFont(new java.awt.Font("SLSCII1134a", 1, 18)); // NOI18N
        jLabel1.setText("Product No");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 20));

        txtProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductMouseClicked(evt);
            }
        });
        txtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductKeyPressed(evt);
            }
        });
        jPanel2.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 40));

        jLabel3.setFont(new java.awt.Font("SLSCII1134a", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, 20));

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, 40));

        txtUnitPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 110, 40));

        jLabel4.setFont(new java.awt.Font("SLSCII1134a", 1, 18)); // NOI18N
        jLabel4.setText("Unit Price");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, 20));

        txtQuantity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuantityMouseClicked(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });
        jPanel2.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 100, 40));

        jLabel5.setFont(new java.awt.Font("SLSCII1134a", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 90, 20));

        jLabel6.setFont(new java.awt.Font("SLSCII1134a", 1, 18)); // NOI18N
        jLabel6.setText("Total Price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, 20));

        txtTotal.setBackground(new java.awt.Color(242, 235, 202));
        txtTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalKeyPressed(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 100, 40));

        btAdd.setBackground(new java.awt.Color(242, 235, 202));
        btAdd.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/add-file.png"))); // NOI18N
        btAdd.setText(" ADD");
        btAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jPanel2.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 240, 40));

        jButton2.setBackground(new java.awt.Color(242, 235, 202));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/add-list.png"))); // NOI18N
        jButton2.setText("  ALL ITEMS");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 430, 530));

        jPanel4.setBackground(new java.awt.Color(87, 87, 87));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product No", "Name", "Unit Price", "Quantity ", "Total Price"
            }
        ));
        jScrollPane2.setViewportView(tblTotal);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 300));

        jPanel6.setBackground(new java.awt.Color(113, 121, 121));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SLSCII1134a", 1, 24)); // NOI18N
        jLabel8.setText("Total");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        jLabel9.setFont(new java.awt.Font("SLSCII1134a", 1, 24)); // NOI18N
        jLabel9.setText("Cash");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        jLabel10.setFont(new java.awt.Font("SLSCII1134a", 1, 24)); // NOI18N
        jLabel10.setText("Balance");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 30));

        txtNetTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNetTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNetTotalKeyPressed(evt);
            }
        });
        jPanel6.add(txtNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 280, 30));

        txtCash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashKeyPressed(evt);
            }
        });
        jPanel6.add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 280, 30));

        txtBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 280, 30));

        btCal.setBackground(new java.awt.Color(242, 235, 202));
        btCal.setFont(new java.awt.Font("SLSCII1134a", 1, 24)); // NOI18N
        btCal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/calculator.png"))); // NOI18N
        btCal.setText(" Calculate");
        btCal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalActionPerformed(evt);
            }
        });
        jPanel6.add(btCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 240, 40));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 460, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 480, 530));

        jPanel5.setBackground(new java.awt.Color(87, 87, 87));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBill.setColumns(20);
        txtBill.setRows(5);
        txtBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane3.setViewportView(txtBill);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 450));

        btBillPrw.setBackground(new java.awt.Color(242, 235, 202));
        btBillPrw.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btBillPrw.setText("Bill Preview");
        btBillPrw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBillPrw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBillPrwActionPerformed(evt);
            }
        });
        jPanel5.add(btBillPrw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 40));

        btPrint.setBackground(new java.awt.Color(242, 235, 202));
        btPrint.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/printer.png"))); // NOI18N
        btPrint.setText(" Print Bill");
        btPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });
        jPanel5.add(btPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 170, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 410, 530));

        jPanel3.setBackground(new java.awt.Color(4, 10, 56));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcom :-");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 40));

        lblUser.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 290, 40));

        jPanel7.setBackground(new java.awt.Color(4, 10, 56));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.white));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Shoes Sales System");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 350, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 430, 50));

        jButton1.setBackground(new java.awt.Color(242, 235, 202));
        jButton1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/logout.png"))); // NOI18N
        jButton1.setText(" Log out");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 174, 38));

        txtUser.setBackground(new java.awt.Color(87, 87, 87));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 100, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costume/shoes/project/icons8-shoes-64.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdditemActionPerformed
        this.setVisible(false);
        new ItemForm().setVisible(true);

    }//GEN-LAST:event_btAdditemActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
  model2.setColumnIdentifiers(coloumn2);
  model2.addRow(row2);
  tblTotal.setModel(model2);

        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
            
            DefaultTableModel TotalTable=(DefaultTableModel)tblTotal.getModel();
        
        TotalTable.setRowCount(f);
        
        Vector columnData=new Vector();
        columnData.add(txtProduct.getText());
        columnData.add(txtName.getText());
        columnData.add(txtUnitPrice.getText());
        columnData.add(txtQuantity.getText());
        columnData.add(txtTotal.getText());
        
        TotalTable.addRow(columnData);
        
        f=f+1;
            
        
        UpdateTable();
        NewTable();
        
        int f=tblTotal.getRowCount();
        float nettot =0.0f;
        float tot=0.0f;
        
        for(int x=0; x<f; x++){
        tot=Float.parseFloat(model2.getValueAt(x,4).toString());
        //tot=Float.parseFloat(txtTotal.getText());
        nettot=nettot+tot;
        
        
        }
        
        txtNetTotal.setText(Float.toString(nettot));
        
        txtProduct.setText("");
        txtName.setText("");
        txtUnitPrice.setText("");
        txtQuantity.setText("");
        txtTotal.setText("");
        
        txtProduct.requestFocus();
        txtTotal.setEditable(true);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void txtProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductKeyPressed

         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 sqlcon=DriverManager.getConnection(datacon,un,pw);
                 
             String query="SELECT `itemname`, `itemcode`, `unitprice` FROM `itemtable` WHERE `itemcode`=?";
            
            pst=sqlcon.prepareStatement(query);    // to send sql database
            
            pst.setString(1,txtProduct.getText());       
            
            rs=pst.executeQuery();  //to get sql result to the result set
            
            while(rs.next()){
            txtProduct.setText(rs.getString("itemcode"));
            txtName.setText(rs.getString("itemname"));
            txtUnitPrice.setText(rs.getString("unitprice"));
           
            }
        
                 
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
             }
             
        txtQuantity.requestFocus();
        txtQuantity.setEditable(true);   
         }


       
    }//GEN-LAST:event_txtProductKeyPressed

    private void txtProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductMouseClicked
       txtProduct.setEditable(true);
       txtName.setEditable(false);
       txtQuantity.setEditable(false);
       txtProduct.requestFocus();    
    }//GEN-LAST:event_txtProductMouseClicked

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        float quantity=Float.parseFloat(txtQuantity.getText());
        float unitprice=Float.parseFloat(txtUnitPrice.getText());
        float total;
        
        total=quantity*unitprice;
        
        //Float.toString(total);
        txtTotal.setText(Float.toString(total));
        txtTotal.requestFocus();
        }

      
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void txtQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantityMouseClicked
       txtQuantity.setEditable(true);
       txtName.setEditable(false);
       txtProduct.setEditable(false);
       txtQuantity.requestFocus();      
    }//GEN-LAST:event_txtQuantityMouseClicked

    private void txtNetTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetTotalKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtCash.requestFocus();
        txtCash.setEditable(true);
        txtNetTotal.setEditable(false);
        txtBalance.setEditable(false);
        }
    }//GEN-LAST:event_txtNetTotalKeyPressed

    private void txtCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       float nettot=Float.parseFloat(txtNetTotal.getText());
       float cash=Float.parseFloat(txtCash.getText());
       float balance=0;
       
       balance=cash-nettot;
       if(nettot<cash){
       
       txtBalance.setText(Float.toString(balance));
       }else{
        JOptionPane.showMessageDialog(this,"Please Check Cash Money Again");
        txtCash.setText("");
       }
       
       
       
       
       
       }
    }//GEN-LAST:event_txtCashKeyPressed

    private void btCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalActionPerformed
       float nettot=Float.parseFloat(txtNetTotal.getText());
       float cash=Float.parseFloat(txtCash.getText());
       float balance=0;
       
       balance=cash-nettot;
       if(nettot<cash){
       
       txtBalance.setText(Float.toString(balance));
       }else{
        JOptionPane.showMessageDialog(this,"Please Check Cash Money Again");
        txtCash.setText("");
       }
    }//GEN-LAST:event_btCalActionPerformed

    private void btBillPrwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBillPrwActionPerformed
    txtBill.setText("");
      
    
            txtBill.append("\t                HYPHENET SMART TECH SOLUTION\n");

            txtBill.append("___________________________________________________\n\n");
        String Name,Qty,UPrice,Total;
        for(int x=0; x<f; x++){
        Name=model2.getValueAt(x,1).toString();
        UPrice=model2.getValueAt(x,2).toString();
        Qty=model2.getValueAt(x,3).toString();
        Total=model2.getValueAt(x,4).toString();
        
        txtBill.append("\b "+Name+"    | Unit Price  RS. "+UPrice+"   | Qty  "+Qty+"  -------| Total  RS. "+Total+"\n");
        
        }
        
       String nettot=txtNetTotal.getText();
       String cash=txtCash.getText();
       String bal=txtBalance.getText();
       
       txtBill.append("\n------------------------------------\n"
                        +"\t\t * Net Total = "+nettot+"\n"
                        +"\t\t * Cash = "+cash+"\n"
                        +"\t\t * Balance = "+bal+"\n\n"
                        +"=============================\n\n"
                        +"\t   Thank For You..!\n"
                        +"\t      Please Come Again \n\n\n"
                        +"=============================\n\n"
                        +"\t  ~~ Software Developer NVQ 4 ~~");   
    }//GEN-LAST:event_btBillPrwActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        try {
            txtBill.print();
            model2.setRowCount(0);
            txtBill.setText(null);
            txtNetTotal.setText(null);
            txtCash.setText(null);
            txtBalance.setText(null);
            
        } catch (PrinterException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }//GEN-LAST:event_btPrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

          Allrecode(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         this.setVisible(false);
        new Login().setVisible(true);       
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyPressed

    txtTotal.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            model2.setColumnIdentifiers(coloumn2);
            model2.addRow(row2);
            tblTotal.setModel(model2);
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon=DriverManager.getConnection(datacon,un,pw);
            
               DefaultTableModel TotalTable=(DefaultTableModel)tblTotal.getModel();
        
        TotalTable.setRowCount(f);
        
        Vector columnData=new Vector();
        columnData.add(txtProduct.getText());
        columnData.add(txtName.getText());
        columnData.add(txtUnitPrice.getText());
        columnData.add(txtQuantity.getText());
        columnData.add(txtTotal.getText());
        
        TotalTable.addRow(columnData);
        
        f=f+1;
        
        
        
        UpdateTable();
        NewTable();
        
        int f=tblTotal.getRowCount();
        float nettot =0.0f;
        float tot=0.0f;
        
        for(int x=0; x<f; x++){
        tot=Float.parseFloat(model2.getValueAt(x,4).toString());
        //tot=Float.parseFloat(txtTotal.getText());
        nettot=nettot+tot;
        
        
        }
        
        txtNetTotal.setText(Float.toString(nettot));
        
        txtProduct.setText("");
        txtName.setText("");
        txtUnitPrice.setText("");
        txtQuantity.setText("");
        txtTotal.setText("");
        
        txtProduct.requestFocus();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SLSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
             
                     
       }     
    
    }//GEN-LAST:event_txtTotalKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(SLSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SLSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SLSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SLSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SLSystem().setVisible(true);
            }
        });
    }
    
     
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAdditem;
    private javax.swing.JButton btBillPrw;
    private javax.swing.JButton btCal;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lblUser;
    private javax.swing.JTable tblStore;
    private javax.swing.JTable tblTotal;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
