/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Controller.CCatadd;
import Controller.CProducts;
import Controller.CVProduct;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UC
 */
public class VBill1 extends javax.swing.JFrame {

    /**
     * Creates new form VBill1
     */
    public VBill1() {
        initComponents();
        getcat();
    }
    int billid,newqty;
     public void update(){
         try{
         int bqty =available-Integer.valueOf(txt_Qnty.getText());
         int bid=billid;
        //int pid=Integer.valueOf(txt_product.getText());
        //String sname=txt_name.getText();
        //int qnty=Integer.valueOf(txt_Qnty.getText());
        //int price=Integer.valueOf(txt_price.getText());; 
        //String category=cmb_category.getSelectedItem().toString();
        CBill cp=new CBill();
        cp.editbprod(bid, bqty);
        selectproducts();
             }
        catch(Exception e){
            
        }
    }
     public void selectproducts(){
        CProducts csv=new CProducts();
        ResultSet rst=csv.viewprod();
        
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("PID");
        dtm.addColumn("NAME");
        dtm.addColumn("QUANTITY");
        dtm.addColumn("PRICE");
        dtm.addColumn("CATEGORY");
        try{
            while (rst.next()) {                
                String[] data=new String[5];
                data[0]=rst.getString(1);
                data[1]=rst.getString(2);
                data[2]=rst.getString(3);
                data[3]=rst.getString(4);
                data[4]=rst.getString(5);
                dtm.addRow(data);
            }
        }
        catch(Exception e){
            
        }
        tbl_bill.setModel(dtm);
    }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_bill = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_Qnty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bill = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtext = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmb_category = new javax.swing.JComboBox();
        btn_filter = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_bAdd = new javax.swing.JButton();
        btn_bClear = new javax.swing.JButton();
        lbl_price = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_seller = new javax.swing.JLabel();
        lbl_products = new javax.swing.JLabel();
        lbl_category = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BillID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        txt_bill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_Qnty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tbl_bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        tbl_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_billMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bill);

        billtext.setColumns(20);
        billtext.setRows(5);
        jScrollPane2.setViewportView(billtext);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Category");

        cmb_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_filter.setText("Filter");
        btn_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filterActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_bAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_bAdd.setText("Add To Bill");
        btn_bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bAddActionPerformed(evt);
            }
        });

        btn_bClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_bClear.setText("Clear");
        btn_bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bClearActionPerformed(evt);
            }
        });

        lbl_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_price.setText("Rs");

        btn_print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_bAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_bClear))
                    .addComponent(txt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_filter)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refresh)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_price)
                .addGap(104, 104, 104)
                .addComponent(btn_print)
                .addGap(42, 42, 42)
                .addComponent(btn_clear)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Qnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_bAdd)
                            .addComponent(btn_bClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_filter)
                            .addComponent(btn_refresh))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_price)
                    .addComponent(btn_print)
                    .addComponent(btn_clear))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lbl_seller.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_seller.setForeground(new java.awt.Color(255, 255, 255));
        lbl_seller.setText("SELLER");
        lbl_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sellerMouseClicked(evt);
            }
        });

        lbl_products.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_products.setForeground(new java.awt.Color(255, 255, 255));
        lbl_products.setText("PRODUCT");
        lbl_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_productsMouseClicked(evt);
            }
        });

        lbl_category.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_category.setForeground(new java.awt.Color(255, 255, 255));
        lbl_category.setText("CATEGORY");
        lbl_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_categoryMouseClicked(evt);
            }
        });

        lbl_logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logout.setText("LOGOUT");
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_category)
                        .addComponent(lbl_seller, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_products, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lbl_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lbl_seller)
                .addGap(50, 50, 50)
                .addComponent(lbl_products)
                .addGap(43, 43, 43)
                .addComponent(lbl_category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_logout)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bClearActionPerformed
        txt_Qnty.setText("");
        txt_bill.setText("");
        txt_name.setText("");
    }//GEN-LAST:event_btn_bClearActionPerformed
int i=0;
    private void btn_bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bAddActionPerformed
     try{
         int bd=Integer.valueOf(txt_bill.getText());
         String name=txt_name.getText();
         int qty=Integer.valueOf(txt_Qnty.getText());
         if(txt_Qnty.getText().isEmpty() || txt_name.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "missing informations"); 
    }
    else if(available<=Integer.valueOf(txt_Qnty.getText())){
        JOptionPane.showMessageDialog(null, "no enough stock");
    }
    else{
        i++;
        prodtot=uprice*Integer.valueOf(txt_Qnty.getText());
        grdtot=grdtot+prodtot;
        if(i==1){
           billtext.setText(billtext.getText()+"     =========MINI SUPER MART==========\n"+"    NUM      PRODUCT     PRICE      QUANTITY     TOTAL\n"+i+"                  "+txt_name.getText()+"                  "+uprice+"                  "+txt_Qnty.getText()+"               "+prodtot+"\n");
        }
        else{
            billtext.setText(billtext.getText()+i+"                  "+txt_name.getText()+"                  "+uprice+"                  "+txt_Qnty.getText()+"               "+prodtot+"\n");
        }
        lbl_price.setText("Rs "+grdtot);
        update();
        txt_Qnty.setText("");
        txt_bill.setText("");
        txt_name.setText("");
        CBSave cb=new  CBSave();
        cb.billsave(bd,name,uprice,qty,prodtot);
                
        
    }
     }
    
     catch(Exception e){
         
     }
    }//GEN-LAST:event_btn_bAddActionPerformed
Double uprice,prodtot=0.00,grdtot=0.00;
int available;
    private void tbl_billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_billMouseClicked
        DefaultTableModel dtm2=(DefaultTableModel)tbl_bill.getModel();
        int myindex=tbl_bill.getSelectedRow();
        billid=Integer.valueOf(dtm2.getValueAt(myindex,0 ).toString());
        txt_name.setText(dtm2.getValueAt(myindex,1 ).toString());
        uprice=Double.valueOf(dtm2.getValueAt(myindex,3).toString());
        available=Integer.valueOf(dtm2.getValueAt(myindex,2).toString());
        newqty=available-Integer.valueOf(txt_Qnty.getText());
    }//GEN-LAST:event_tbl_billMouseClicked

    private void btn_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filterActionPerformed
        try{String product=cmb_category.getSelectedItem().toString();
        CVProduct cvp=new  CVProduct();
        ResultSet rs=cvp.selectproduct(product);
        
         
        
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("PID");
        dtm.addColumn("NAME");
        dtm.addColumn("QUANTITY");
        dtm.addColumn("PRICE");
        dtm.addColumn("CATEGORY");
        
            while (rs.next()) {                
                String[] data=new String[5];
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                dtm.addRow(data);
            }
      
        tbl_bill.setModel(dtm);
        
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_filterActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        selectproducts();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void lbl_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sellerMouseClicked
         new VSeller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_sellerMouseClicked

    private void lbl_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_productsMouseClicked
        new VProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_productsMouseClicked

    private void lbl_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_categoryMouseClicked
        new VCategories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_categoryMouseClicked

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
       new Vlogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
         try{
           billtext.print();
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_btn_printActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        billtext.setText("");
        lbl_price.setText("Rs" );
    }//GEN-LAST:event_btn_clearActionPerformed
      private void getcat(){
       try {
           CCatadd cps=new CCatadd();
        ResultSet rst=cps.sendcatogary();
           while (rst.next()) {               
              String mycat=rst.getString("cname");
              cmb_category.addItem(mycat);
           }
       }
       catch(NumberFormatException e){
           
       }
       catch(Exception e){
           
       }
    }
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
            java.util.logging.Logger.getLogger(VBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VBill1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billtext;
    private javax.swing.JButton btn_bAdd;
    private javax.swing.JButton btn_bClear;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_filter;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JComboBox cmb_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_products;
    private javax.swing.JLabel lbl_seller;
    private javax.swing.JTable tbl_bill;
    private javax.swing.JTextField txt_Qnty;
    private javax.swing.JTextField txt_bill;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
