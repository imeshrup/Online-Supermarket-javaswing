/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import Controller.*;
import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.*;
/**
 *
 * @author UC
 */
public class VAdsignup extends javax.swing.JFrame {

     public String emailpattern="^(.+)@(.+)$";
    public String numberpattern="/^\\d{10}$/";
    public String namepattern="^[A-Za-z\\s]+$";
    
    public VAdsignup() {
        initComponents();
        btnsavead.setEnabled(false);
        btn_login.setEnabled(false);
    }
     public void clear(){
        txt_aname.setText("");
        txt_Aanswer.setText("");
        txt_amobile.setText("");
        txt_apass.setText("");
        txt_aconfirm.setText("");
        txt_aemail.setText("");
        btnsavead.setEnabled(false);
       btn_login.setEnabled(false);
    }
    public void validatefields(){
         try
         {int tp;
         String name,email,password,security,answer;
         tp=Integer.valueOf(txt_amobile.getText());
         name=txt_aname.getText();
         email=txt_aemail.getText();
         password=txt_apass.getText();
         security=cmb_aqstn.getSelectedItem().toString();
         answer=txt_Aanswer.getText();
         
         if(!name.equals("") && !email.equals("") && !password.equals("") && !security.equals("") && !password.equals("") && !answer.equals("")){
             btnsavead.setEnabled(true);
             btn_login.setEnabled(false);
             
         } 
         }
         catch(NumberFormatException e){
            
         }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_aconfirm = new javax.swing.JPasswordField();
        cmb_aqstn = new javax.swing.JComboBox();
        txt_aemail = new javax.swing.JTextField();
        txt_amobile = new javax.swing.JTextField();
        txt_Aanswer = new javax.swing.JTextField();
        txt_apass = new javax.swing.JPasswordField();
        btnsavead = new javax.swing.JButton();
        btnclearad = new javax.swing.JButton();
        btnexitad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_aname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_aconfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_aconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aconfirmKeyReleased(evt);
            }
        });

        cmb_aqstn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_aqstn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your favourrite colour?", "what is your nick name?", "who is your favourite person?", "What is your favourrite place?", " " }));

        txt_aemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_aemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aemailActionPerformed(evt);
            }
        });
        txt_aemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aemailKeyReleased(evt);
            }
        });

        txt_amobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_amobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_amobileKeyReleased(evt);
            }
        });

        txt_Aanswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Aanswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AanswerKeyReleased(evt);
            }
        });

        txt_apass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apassKeyReleased(evt);
            }
        });

        btnsavead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsavead.setText("Save");
        btnsavead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveadActionPerformed(evt);
            }
        });

        btnclearad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclearad.setText("Clear");
        btnclearad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearadActionPerformed(evt);
            }
        });

        btnexitad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexitad.setText("Exit");
        btnexitad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("SIGN UP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Security Question");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Answer");

        txt_aname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_aname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_anameKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Confirm Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("ADMIN");

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_login)
                        .addGap(91, 91, 91)
                        .addComponent(jButton1)
                        .addGap(493, 493, 493))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(541, 541, 541))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(418, 418, 418)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_aemail, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(txt_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_amobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_apass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnsavead)
                                            .addGap(82, 82, 82)
                                            .addComponent(btnclearad)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnexitad))
                                        .addComponent(txt_Aanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                        .addComponent(txt_aconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmb_aqstn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(jButton1))
                .addGap(107, 107, 107))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(51, 51, 51))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_aemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_amobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_apass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_aconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cmb_aqstn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(txt_Aanswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsavead)
                        .addComponent(btnclearad)
                        .addComponent(btnexitad))
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_aconfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aconfirmKeyReleased
        validatefields();
    }//GEN-LAST:event_txt_aconfirmKeyReleased

    private void txt_aemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aemailKeyReleased

        validatefields();
    }//GEN-LAST:event_txt_aemailKeyReleased

    private void txt_amobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amobileKeyReleased
        validatefields();
    }//GEN-LAST:event_txt_amobileKeyReleased

    private void txt_AanswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AanswerKeyReleased
        validatefields();
    }//GEN-LAST:event_txt_AanswerKeyReleased

    private void txt_apassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apassKeyReleased
        validatefields();
    }//GEN-LAST:event_txt_apassKeyReleased

    private void btnsaveadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveadActionPerformed
        try{ int tp;
            String name,email,password,security,answer,cpassword,tl;
            tl=txt_amobile.getText();
            tp=Integer.valueOf(txt_amobile.getText());
            name=txt_aname.getText();
            email=txt_aemail.getText();
            password=txt_apass.getText();
            cpassword=txt_aconfirm.getText();
            security=cmb_aqstn.getSelectedItem().toString();
            answer=txt_Aanswer.getText();
            if(name.equals("") || email.equals("") || password.equals("") || security.equals("") || password.equals("") || answer.equals("")){
                JOptionPane.showMessageDialog(null, "missing fields");
            }
            else if(!name.matches(namepattern)){
                JOptionPane.showMessageDialog(null, "name is incorrect");
                name.equals("");
            }
            else if(!email.matches(emailpattern)){
                JOptionPane.showMessageDialog(null, "email is incorrect");
                email.equals("");
            }
            /*else if(!tl.matches(numberpattern)){
                JOptionPane.showMessageDialog(null, "number should have 10 digits");
            }*/
            else if(!cpassword.matches(password)){
                JOptionPane.showMessageDialog(null, "password not match");
                cpassword.equals("");

            }
            else{
                CAdsignup cs=new CAdsignup();
                cs.registeradmin(name, email, password, security, answer, tp);
                txt_aname.setText("");
        txt_Aanswer.setText("");
        txt_amobile.setText("");
        txt_apass.setText("");
        txt_aconfirm.setText("");
        txt_aemail.setText("");
        btnsavead.setEnabled(false);
                btn_login.setEnabled(true);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "enter only numbers for mobile number");
         }
        catch(Exception e){

        }

    }//GEN-LAST:event_btnsaveadActionPerformed

    private void btnclearadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearadActionPerformed
        clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearadActionPerformed

    private void btnexitadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitadActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitadActionPerformed

    private void txt_anameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anameKeyReleased

        validatefields();
    }//GEN-LAST:event_txt_anameKeyReleased

    private void txt_aemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aemailActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        new VReports().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vlogin loj=new Vlogin();
         loj.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VAdsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btnclearad;
    private javax.swing.JButton btnexitad;
    private javax.swing.JButton btnsavead;
    private javax.swing.JComboBox cmb_aqstn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Aanswer;
    private javax.swing.JPasswordField txt_aconfirm;
    private javax.swing.JTextField txt_aemail;
    private javax.swing.JTextField txt_amobile;
    private javax.swing.JTextField txt_aname;
    private javax.swing.JPasswordField txt_apass;
    // End of variables declaration//GEN-END:variables
}
