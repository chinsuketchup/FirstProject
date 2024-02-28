/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import forms.FormHome;
import forms.FormLogin;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author thanhngocdang
 */
public class LoginBL extends javax.swing.JFrame{
    JButton bt ;
    public void loginTV( String tendangnhap, String matkhau){
        try(Connection ketNoi = CSDL.connect()){
            String sql = "select * from Login where tendangnhap ='"+tendangnhap+"'&& matkhau ='"+matkhau+"' ";
            java.sql.Statement sta= ketNoi.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane,"Đăng nhập thành công !");
                FormHome hm = new FormHome();
                hm.setVisible(true);
                FormLogin lg = new FormLogin();
                lg.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Thông tin sai hoặc Tài khoản không tồn tại !!");
            }
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }  
    }
}
