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
public class CNUPassword {
    public void updatepass(String name,String password){
        MNUPassword mnu=new MNUPassword();
        mnu.updatepassword(name, password);
    }
}
