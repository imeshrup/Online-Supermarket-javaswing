/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MSeller;

import java.sql.ResultSet;

/**
 *
 * @author UC
 */
public class CSeller {
    public void sell(int sid,String sname,String spassword ,String gender){
        MSeller ms =new MSeller();
        ms.addseller(sid, sname, spassword, gender);
    }
    
     
   
}
