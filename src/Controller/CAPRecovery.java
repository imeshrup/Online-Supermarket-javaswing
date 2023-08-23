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
public class CAPRecovery {
    ResultSet rst;
    public ResultSet aprecov(String user,String question,String answer){
        MAPRecovery msv=new MAPRecovery();
        rst=msv.aprecovery(user,question, answer);
        return rst;
    } 
}
