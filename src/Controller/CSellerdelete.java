/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MSellerdelete;

/**
 *
 * @author UC
 */
public class CSellerdelete {
     public void delseller(int sid){
      MSellerdelete mds=new MSellerdelete();
      mds.deleteseller(sid);
      }
}
