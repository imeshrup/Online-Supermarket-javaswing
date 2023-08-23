/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author UC
 */
public class MSeller {
     public static void addseller(int sid,String sname,String spassword,String gender )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("insert into seller values('"+sid+"','"+sname+"','"+spassword+"','"+gender+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is submitted");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
     
}
