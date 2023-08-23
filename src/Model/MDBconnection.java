/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UC
 */
public class MDBconnection {
     public static Connection con;
    public static Connection createDBconnection()
    {
        try{
            String dbpath="jdbc:mysql://localhost:3306/gym_management";
            con=DriverManager.getConnection(dbpath,"root", "");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
