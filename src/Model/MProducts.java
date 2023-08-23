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
public class MProducts {
    public static void addproduct(int pid,String pname,int pqty,int price,String pcatogary )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("insert into products values('"+pid+"','"+pname+"','"+pqty+"','"+price+"','"+pcatogary+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is submitted");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
     public static void editproduct(int pid,String pname,int pqty,int price,String pcatogary )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("update products set pname='"+pname+"'"+",pqty='"+pqty+"'"+",price='"+price+"'"+",category='"+pcatogary+"'"+"where pid="+pid);
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is updated succesfully");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
      ResultSet rst;

    public ResultSet viewpoduct(){
        try{
          Statement st= MDBconnection.createDBconnection().createStatement();
          
          rst=st.executeQuery("select * from products");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
     public static void deleteproduct(int pid )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("Delete from products where pid="+pid);
            if(row_count>0){
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    } 
}
