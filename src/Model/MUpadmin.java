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
public class MUpadmin {
    public static void updateadmin(String aname,String apassword)
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("update updateadmin set adpassword='"+apassword+"'"+"where adname="+aname);
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is updated succesfully");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
