/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;

/**
 *
 * @author thanhngocdang
 */
public class CSDL extends JFrame {
    private static Connection conn;
    public static Connection connect(){
        String DATABASE_URL="jdbc:mysql://localhost:3306/qlpg";
        String DATABASE_USERNAME="root";
        String DATABASE_PASSWORD="";
    try{
        conn = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
        System.out.println("Kết nối thành công !");
    }catch(Exception e){
        e.printStackTrace();
    }
    return conn;
    }
}
