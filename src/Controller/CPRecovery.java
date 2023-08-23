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
public class CPRecovery {
    ResultSet rst;
    public ResultSet uprecov(String user,String question,String answer){
        MPRecovery msv=new MPRecovery();
        rst=msv.uprecovery(user,question, answer);
        return rst;
    } 
}
