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
public class MCatadd {
     public static void addcatogary(int cid,String cname,String cdesc )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("insert into category values('"+cid+"','"+cname+"','"+cdesc+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is submitted");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    } 
     ResultSet rst;
    public ResultSet viewcatogary(){
        try{
          Statement st= MDBconnection.createDBconnection().createStatement();
          rst=st.executeQuery("select * from category");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    public static void catagoryedit(int cid,String cname,String cdesc)
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("update category set cname='"+cname+"'"+",cdesc='"+cdesc+"'"+"where cid="+cid);
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "record is updated succesfully");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
    public static void deletecatogory(int cid )
    {
        try{
            Statement st= MDBconnection.createDBconnection().createStatement();
            int row_count=st.executeUpdate("Delete from category where cid="+cid);
            if(row_count>0){
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
