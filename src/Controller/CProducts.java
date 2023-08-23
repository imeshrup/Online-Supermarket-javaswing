/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MProducts;
import java.sql.ResultSet;

/**
 *
 * @author UC
 */
public class CProducts {
    public void addprod(int pid,String pname,int pqty,int price,String pcatogary){
        MProducts mp =new MProducts();
        mp.addproduct(pid, pname, pqty, price, pcatogary);
    }
     public void editprod(int pid,String pname,int pqty,int price,String pcatogary){
        MProducts mr =new MProducts();
        mr.editproduct(pid, pname, pqty, price, pcatogary);
    }
     ResultSet rst;
    public ResultSet viewprod(){
        MProducts mp=new MProducts();
        rst=mp.viewpoduct();
        return rst;
    }
    public void deleteprod(int pid){
      MProducts mp=new MProducts();
      mp.deleteproduct(pid);
      }
}
