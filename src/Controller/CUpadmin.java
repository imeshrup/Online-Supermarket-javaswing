/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MUpadmin;
/**
 *
 * @author UC
 */
public class CUpadmin {
    public static void upadmin(String aname,String apassword){
        MUpadmin mua=new MUpadmin();
        mua.updateadmin(aname, apassword);
    }
}
