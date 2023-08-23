/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.MSProduct;
import java.sql.ResultSet;
/**
 *
 * @author UC
 */
public class CVProduct {
    ResultSet rst;
    public ResultSet selectproduct(String product){
        MSProduct msp=new MSProduct();
        rst=msp.getpoduct(product);
        return rst;
    }
}
