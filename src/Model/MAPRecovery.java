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
public class MAPRecovery {
    ResultSet rst;

    public ResultSet aprecovery(String user,String question,String answer){
        try{
          Statement st= MDBconnection.createDBconnection().createStatement();
          
          rst=st.executeQuery("select * from user where name='"+user+"'securiy='"+question+"' and answer='"+answer+"'");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
}
