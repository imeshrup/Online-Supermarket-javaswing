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
public class CAdsignup {
    public void registeradmin(String name,String email,String password,String security,String answer,int tp){
        MAdsignup ms=new MAdsignup();
        ms.radmin(name, email, password, security, answer, tp);
    }
}
