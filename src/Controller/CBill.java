/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MBill;

/**
 *
 * @author UC
 */
public class CBill {
    public void editbprod(int bid,int pqty){
        MBill mr =new MBill();
        mr.editbproduct(bid, pqty);
    }
}
