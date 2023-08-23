/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MCatadd;



import java.sql.ResultSet;
/**
 *
 * @author UC
 */
public class CCatadd {
    public static void addcat(int cid,String cname,String cdesc ){
        MCatadd mca=new MCatadd();
        mca.addcatogary(cid, cname, cdesc);
    }
    ResultSet rst;
    public ResultSet sendcatogary(){
        MCatadd mcv=new MCatadd();
        rst=mcv.viewcatogary();
        return rst;
    }
    public void catedit(int cid,String cname,String cdesc ){
        MCatadd mse =new MCatadd();
        mse.catagoryedit(cid, cname, cdesc);
    }
    public void delcatogory(int cid){
      MCatadd mca=new MCatadd();
      mca.deletecatogory(cid);
      }
}
