/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import forms.FormHome;
import dataTransferObject.ChitietThanhVien;
import dataTransferObject.ThanhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author thanhngocdang
 */
public class ThanhVienBL{
    public static List<ThanhVien> dsThanhVien(){
        List<ThanhVien> rs = null;
        try(Connection ketNoi = CSDL.connect()){
            rs = new ArrayList<>();
            java.sql.Statement sta = ketNoi.createStatement();
            String sql = "select * from Capnhattv";
            ResultSet resultSet = sta.executeQuery(sql);
            while(resultSet.next()){
                ThanhVien tv = new ThanhVien();
                tv.setStrHoten(resultSet.getString("hoten"));
                tv.setiSdt(resultSet.getInt("sdt"));
                tv.setStrDiachi(resultSet.getString("diachi"));
                tv.setStrDangkytren(resultSet.getString("dangkytren"));
                tv.setStrDangkyboi(resultSet.getString("dangkyboi"));

                rs.add(tv);
                
            }
            
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }  
        return rs;
    }
    public static List<ChitietThanhVien> dsChitietHd(){
        List<ChitietThanhVien> rs = null;
        try(Connection ketNoi = CSDL.connect()){
            rs = new ArrayList<>();
            java.sql.Statement sta = ketNoi.createStatement();
            String sql = "select * from Chitiet";
            ResultSet re = sta.executeQuery(sql);
            while(re.next()){
                ChitietThanhVien cttv = new ChitietThanhVien();
                cttv.setiId(re.getInt("id"));
                cttv.setStrTong(re.getString("tong"));
                cttv.setStrBienlai(re.getString("bienlai"));
                cttv.setStrThanhToan(re.getString("thanhtoan"));
                cttv.setStrNgay(re.getString("ngay"));
                cttv.setStrTtboi(re.getString("thanhtoanboi"));
                
                rs.add(cttv);
                
            }
            
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }  
        return rs;
    }
    public static void themmoiTV(int id , String hoten, String nic, int sdt,String diachi, String email, String lienhe, String hangtv, String biennhan, String hinhthuctt, boolean gioitinh, String chieucao, String cannang, String nhanxet){
        try(Connection ketNoi = CSDL.connect()){
            String sql = "insert into Themthanhvien (id,hoten,nic,sdt,diachi,email,lienhe,hangthanhvien,biennhan,hinhthucthanhtoan,gioitinh,chieucao,cannang,nhanxet)Values('"+id+"','"+hoten+"','"+nic+"','"+sdt+"','"+diachi+"','"+email+"','"+lienhe+"','"+hangtv+"','"+biennhan+"','"+hinhthuctt+"','"+gioitinh+"','"+chieucao+"','"+cannang+"','"+nhanxet+"')";
            java.sql.Statement sta= ketNoi.createStatement();
            sta.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }  
    }
    public static void capnhatTV(String hoten, String nic, int sdt,String diachi, String email, String hangtv, String idtv,String dangkytren,String dangkyboi, String biennhan, String hinhthuctt,String capnhatlc,String lienhe, boolean gioitinh, String chieucao, String cannang, String bmi, String nhanxet){
        try(Connection ketNoi = CSDL.connect()){
            String sql = "insert into Capnhattv (hoten,nic,sdt,diachi,email,hangthanhvien,idthanhvien,dangkytren,dangkyboi,biennhan,hinhthucthanhtoan,capnhatlancuoi,lienhe,gioitinh,chieucao,cannang,bmi,nhanxet)Values('"+hoten+"','"+nic+"','"+sdt+"','"+diachi+"','"+email+"','"+hangtv+"','"+idtv+"','"+dangkytren+"','"+dangkyboi+"','"+biennhan+"','"+hinhthuctt+"','"+capnhatlc+"','"+lienhe+"','"+gioitinh+"','"+chieucao+"','"+cannang+"','"+bmi+"','"+nhanxet+"')";
            PreparedStatement sta = ketNoi.prepareStatement(sql);
            sta.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }
    }
    public static void timkiemTV(int id){
        try(Connection ketNoi = CSDL.connect()){
            
            java.sql.Statement sta = ketNoi.createStatement();
            String sql = "select * from Themthanhvien where id = "+id;
            ResultSet res = sta.executeQuery(sql);
            while(res.next()){
                ThanhVien tv = new ThanhVien();
                tv.setStrHoten(res.getString("hoten"));
                tv.setStrNic(res.getString("nic"));
                tv.setiSdt(res.getInt("sdt"));
                tv.setStrDiachi(res.getString("diachi"));
                tv.setStrEmail(res.getString("email"));
                tv.setStrHangtv(res.getString("hangthanhvien"));
                tv.setiIdtv(res.getInt("id"));
                tv.setStrBiennhan(res.getString("biennhan"));
                tv.setStrThanhtoan(res.getString("hinhthucthanhtoan"));
                tv.setStrKhancap(res.getString("lienhe"));
                tv.setbGioitinh(res.getString("gioitinh") == "Nam"?true:false);
                tv.setStrChieucao(res.getString("chieucao"));
                tv.setStrCannang(res.getString("cannang"));
                tv.setStrNhanxet(res.getString("nhanxet"));
                
                tv.lstThanhVien.add(tv);
                
                
            }
            
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }
    }
    public static void xoaTV(int id){
        try(Connection ketNoi = CSDL.connect()){
            String sql = "delete from Themthanhvien where id = "+id;
            PreparedStatement sta = ketNoi.prepareStatement(sql);
            sta.execute();
        }catch(Exception e){
            System.out.println("Bị lỗi "+e.getMessage());
        }
    }
    public static void kiemtraIDtv(int id){
        try(Connection ketNoi = CSDL.connect()){
            java.sql.Statement sta = ketNoi.createStatement();
            String sql = "select * from Chitiet where id = "+id;
            ResultSet res = sta.executeQuery(sql);
            while(res.next()){
                ThanhVien tv = new ThanhVien();
                tv.setiId(res.getInt("id"));
                tv.setStrChitiettt(res.getString("thanhtoan"));
                tv.setStrChitietbl(res.getString("bienlai"));
                
                tv.lstThanhVien.add(tv);

            }
            
            
        }catch(Exception e){
            System.out.println("Bị lỗi "+e.getMessage());
        }
    }
    public static void Guihd(String tong,String bienlai,String tt,String ngay,String admin){
        try(Connection ketNoi = CSDL.connect()){
            String sql = "insert into Chitiet (tong,bienlai,thanhtoan,ngay,thanhtoanboi)Values('"+tong+"','"+bienlai+"','"+tt+"','"+ngay+"','"+admin+"')";
            java.sql.Statement sta= ketNoi.createStatement();
            sta.executeUpdate(sql);
            
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
            
        }  
    }
}
