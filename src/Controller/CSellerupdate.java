/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MSellerupdate;
/**
 *
 * @author UC
 */
public class CSellerupdate {
     public void selledit(int sid,String sname,String spassword ,String gender){
        MSellerupdate msu =new MSellerupdate();
        msu.selleredit(sid, sname, spassword, gender);
    }
}
