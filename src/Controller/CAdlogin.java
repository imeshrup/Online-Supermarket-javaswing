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
public class CAdlogin {
    ResultSet rst;
    public ResultSet alog(String username,String password){
        MAdlogin msv=new MAdlogin();
        rst=msv.alogin(username, password);
        return rst;
    }
}
