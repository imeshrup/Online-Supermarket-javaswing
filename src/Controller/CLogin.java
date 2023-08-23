/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.ResultSet;

/**
 *
 * @author UC
 */
public class CLogin {
    ResultSet rst;
    public ResultSet ulog(String username,String password){
        MLogin msv=new MLogin();
        rst=msv.ulogin(username, password);
        return rst;
    }
}
