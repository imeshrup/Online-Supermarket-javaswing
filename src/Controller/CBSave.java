/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
/**
 *
 * @author UC
 */
public class CBSave {
    public void billsave(int bd,String name,double uprice,int qty,double prodtot){
    MBSave mbs=new MBSave();
    mbs.sbill(bd, name, uprice, qty, prodtot);
}
}
