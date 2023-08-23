/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MSignup;
/**
 *
 * @author UC
 */
public class CSignup {
    public void register(String name,String email,String password,String security,String answer,int tp){
        MSignup ms=new MSignup();
        ms.ruser(name, email, password, security, answer, tp);
    }
}
