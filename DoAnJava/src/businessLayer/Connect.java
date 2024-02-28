/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thanhngocdang
 */
public class Connect {
    final static String JBDC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DATABASE_URL = "jdbc:mysql://localhost:3306/qlpg";
    
    final static String USER = "root";
    final static String PASSWORD = "";
    
    private static Connection conn;
    
    public static Connection ketNoi(){
        try{
            Class.forName(JBDC_DRIVER);
            conn = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);
        }catch(Exception e){
            System.out.println("Bị lỗi "+e.getMessage());
        }
        return conn;
    }
}
