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
public class CNAPassword {
    public void updatpass(String name,String password){
        MNAPassword mna=new MNAPassword();
        mna.updatpassword(name, password);
    }
}
