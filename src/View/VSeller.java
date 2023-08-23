/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.*;
import com.mysql.cj.protocol.Resultset;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author UC
 */
public class VSeller extends javax.swing.JFrame {

    /**
     * Creates new form VSeller
     */
    public String namepattern="^[A-Za-z\\s]+$";
    public VSeller() {
        initComponents();
        selectseller();
    }

    public void selectseller(){
        CSellerview csv=new CSellerview();
        ResultSet rst=csv.sendseller();
        
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NAME");
        dtm.addColumn("PASSWORD");
        dtm.addColumn("GENDER");
        try{
            while (rst.next()) {                
                String[] data=new String[4];
                data[0]=rst.getString(1);
                data[1]=rst.getString(2);
                data[2]=rst.getString(3);
                data[3]=rst.getString(4);
                dtm.addRow(data);
            }
    }
        catch(SQLException e){
            
        }
        tbl_seller.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_seller = new javax.swing.JTextField();
        txt_sname = new javax.swing.JTextField();
        txt_spass = new javax.swing.JTextField();
        cmb_gender = new javax.swing.JComboBox();
        btn_sAdd = new javax.swing.JButton();
        btn_sdelete = new javax.swing.JButton();
        btn_sEdit = new javax.swing.JButton();
        btn_sClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_seller = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("SELLERS LIST");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SellerID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        txt_seller.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_sname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_spass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        btn_sAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sAdd.setIcon(new javax.swing.ImageIcon("D:\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\add to cart.png")); // NOI18N
        btn_sAdd.setText("Add");
        btn_sAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sAddActionPerformed(evt);
            }
        });

        btn_sdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sdelete.setIcon(new javax.swing.ImageIcon("D:\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\delete.png")); // NOI18N
        btn_sdelete.setText("Delete");
        btn_sdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sdeleteActionPerformed(evt);
            }
        });

        btn_sEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\UC\\Pictures\\R1.png")); // NOI18N
        btn_sEdit.setText("Edit");
        btn_sEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sEditActionPerformed(evt);
            }
        });

        btn_sClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sClear.setIcon(new javax.swing.ImageIcon("D:\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\clear.png")); // NOI18N
        btn_sClear.setText("Clear");
        btn_sClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sClearActionPerformed(evt);
            }
        });

        tbl_seller.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_seller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        tbl_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sellerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_seller);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("MANAGE SELLERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_seller, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_spass, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(btn_sAdd)
                        .addGap(85, 85, 85)
                        .addComponent(btn_sEdit)
                        .addGap(88, 88, 88)
                        .addComponent(btn_sdelete)
                        .addGap(108, 108, 108)
                        .addComponent(btn_sClear)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(456, 456, 456))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_seller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_spass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sAdd)
                    .addComponent(btn_sEdit)
                    .addComponent(btn_sdelete)
                    .addComponent(btn_sClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        lbl_close.setBackground(new java.awt.Color(204, 204, 204));
        lbl_close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_close.setText("x");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CATEGORY");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BILL");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRODUCTS");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LOGOUT");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_close)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel10)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(102, 102, 102))))
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

    private void btn_sAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sAddActionPerformed
        if(txt_seller.getText().isEmpty() || txt_sname.getText().isEmpty() || txt_spass.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "missing informations"); 
        }
        else{
             try{
        int sid=Integer.valueOf(txt_seller.getText());
        String sname=txt_sname.getText();
        String spassword=txt_spass.getText();
        String gender=cmb_gender.getSelectedItem().toString();
        if (!sname.matches(namepattern)){
            JOptionPane.showMessageDialog(null, "name is incorrect");
        }
        CSeller cs=new CSeller();
        cs.sell(sid, sname, spassword, gender);
        selectseller();
             }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "enter only numbers for seller id");
         }
        catch(Exception e){
            
        }
        }
       
    }//GEN-LAST:event_btn_sAddActionPerformed

    private void tbl_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sellerMouseClicked
        DefaultTableModel dtm2=(DefaultTableModel)tbl_seller.getModel();
        int myindex=tbl_seller.getSelectedRow();
        txt_seller.setText(dtm2.getValueAt(myindex,0 ).toString());
        txt_sname.setText(dtm2.getValueAt(myindex,1 ).toString());
        txt_spass.setText(dtm2.getValueAt(myindex,2 ).toString());
    }//GEN-LAST:event_tbl_sellerMouseClicked

    private void btn_sClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sClearActionPerformed
        txt_seller.setText("");
        txt_sname.setText("");
        txt_spass.setText("");
    }//GEN-LAST:event_btn_sClearActionPerformed

    private void btn_sdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sdeleteActionPerformed
        if(txt_seller.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "give an id");
        }
        else{
            try{
                int sid=Integer.valueOf(txt_seller.getText());
                CSellerdelete cds =new CSellerdelete();
                cds.delseller(sid);
                selectseller();
                JOptionPane.showMessageDialog(null, "succesfully deleted");
                selectseller();
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "enter only numbers for seller id");
         }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_btn_sdeleteActionPerformed

    private void btn_sEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sEditActionPerformed
        if(txt_seller.getText().isEmpty() || txt_sname.getText().isEmpty() || txt_spass.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "missing informations"); 
        }
        else{
             try{
        int sid=Integer.valueOf(txt_seller.getText());
        String sname=txt_sname.getText();
        String spassword=txt_spass.getText();
        String gender=cmb_gender.getSelectedItem().toString();
        CSellerupdate cse=new CSellerupdate();
        cse.selledit(sid, sname, spassword, gender);
        JOptionPane.showMessageDialog(null, "succesfully updated");
        selectseller();
             }
         catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "enter only numbers for seller id");
         }
        catch(Exception e){
            
        }
        }
    }//GEN-LAST:event_btn_sEditActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        VCategories loj=new VCategories();
         loj.show();
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        VProducts loj=new VProducts();
         loj.show();
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        VBill1 loj=new VBill1();
         loj.show();
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Vlogin loj=new Vlogin();
         loj.show();
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(VSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sAdd;
    private javax.swing.JButton btn_sClear;
    private javax.swing.JButton btn_sEdit;
    private javax.swing.JButton btn_sdelete;
    private javax.swing.JComboBox cmb_gender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JTable tbl_seller;
    private javax.swing.JTextField txt_seller;
    private javax.swing.JTextField txt_sname;
    private javax.swing.JTextField txt_spass;
    // End of variables declaration//GEN-END:variables
}
