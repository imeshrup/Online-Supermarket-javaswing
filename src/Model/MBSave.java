/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author UC
 */
public class MBSave {
    public static void sbill(int bd,String name,double uprice,int qty,double prodtot)
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("insert into bill values('"+bd+"','"+name+"','"+uprice+"','"+qty+"','"+prodtot+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is submitted");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
