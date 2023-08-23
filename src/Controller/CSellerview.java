/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MSellerview;
import java.sql.ResultSet;

/**
 *
 * @author UC
 */
public class CSellerview {
    ResultSet rst;
    public ResultSet sendseller(){
        MSellerview msv=new MSellerview();
        rst=msv.viewseller();
        return rst;
    }
}
