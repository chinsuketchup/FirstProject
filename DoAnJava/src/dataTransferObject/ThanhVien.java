/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

import java.util.ArrayList;

/**
 *
 * @author thanhngocdang
 */
public class ThanhVien {
    public static ArrayList<ThanhVien> lstThanhVien = new ArrayList<>();
    
    private int iId,iSdt,iIdtv;
    private String strChitiettt,strChitietbl,strDangkytren,strDangkyboi,strKhancap,strThanhtoan,strHoten,strNic,strDiachi,strEmail,strLienhe,strHangtv,strBiennhan,strHinhthuctt,strChieucao,strCannang,strNhanxet;
    private Boolean bGioitinh;

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }
    
    public int getiIdtv() {
        return iIdtv;
    }

    public void setiIdtv(int iIdtv) {
        this.iIdtv = iIdtv;
    }

    public int getiSdt() {
        return iSdt;
    }

    public void setiSdt(int iSdt) {
        this.iSdt = iSdt;
    }
    
    public String getStrChitiettt() {
        return strChitiettt;
    }

    public void setStrChitiettt(String strChitiettt) {
        this.strChitiettt = strChitiettt;
    }
    public String getStrChitietbl() {
        return strChitietbl;
    }

    public void setStrChitietbl(String strChitietbl) {
        this.strChitietbl = strChitietbl;
    }
    
    public String getStrDangkytren() {
        return strDangkytren;
    }

    public void setStrDangkytren(String strDangkytren) {
        this.strDangkytren = strDangkytren;
    }
    
    public String getStrDangkyboi() {
        return strDangkyboi;
    }

    public void setStrDangkyboi(String strDangkyboi) {
        this.strDangkyboi = strDangkyboi;
    }
    
    public String getStrKhancap() {
        return strKhancap;
    }

    public void setStrKhancap(String strKhancap) {
        this.strKhancap = strKhancap;
    }
    
    public String getStrHoten() {
        return strHoten;
    }

    public void setStrHoten(String strHoten) {
        this.strHoten = strHoten;
    }

    public String getStrNic() {
        return strNic;
    }

    public void setStrNic(String strNic) {
        this.strNic = strNic;
    }

    public String getStrDiachi() {
        return strDiachi;
    }

    public void setStrDiachi(String strDiachi) {
        this.strDiachi = strDiachi;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrLienhe() {
        return strLienhe;
    }

    public void setStrLienhe(String strLienhe) {
        this.strLienhe = strLienhe;
    }

    public String getStrHangtv() {
        return strHangtv;
    }

    public void setStrHangtv(String strHangtv) {
        this.strHangtv = strHangtv;
    }

    public String getStrBiennhan() {
        return strBiennhan;
    }

    public void setStrBiennhan(String strBiennhan) {
        this.strBiennhan = strBiennhan;
    }
    public String getStrThanhtoan() {
        return strThanhtoan;
    }

    public void setStrThanhtoan(String strThanhtoan) {
        this.strThanhtoan = strThanhtoan;
    }
    public String getStrHinhthuctt() {
        return strHinhthuctt;
    }

    public void setStrHinhthuctt(String strHinhthuctt) {
        this.strHinhthuctt = strHinhthuctt;
    }

    public String getStrChieucao() {
        return strChieucao;
    }

    public void setStrChieucao(String strChieucao) {
        this.strChieucao = strChieucao;
    }

    public String getStrCannang() {
        return strCannang;
    }

    public void setStrCannang(String strCannang) {
        this.strCannang = strCannang;
    }

    public String getStrNhanxet() {
        return strNhanxet;
    }

    public void setStrNhanxet(String strNhanxet) {
        this.strNhanxet = strNhanxet;
    }

    public Boolean getbGioitinh() {
        return bGioitinh;
    }

    public void setbGioitinh(Boolean bGioitinh) {
        this.bGioitinh = bGioitinh;
    }

    public ThanhVien(int iIdtv,int iId, int iSdt,String strChitiettt,String strChitietbl, String strDangkytren,String strDangkyboi,String strKhancap,String strThanhtoan, String strHoten, String strNic, String strDiachi, String strEmail, String strLienhe, String strHangtv, String strBiennhan, String strHinhthuctt, String strChieucao, String strCannang, String strNhanxet, Boolean bGioitinh) {
        this.iId = iId;
        this.iIdtv = iIdtv;
        this.strDangkyboi = strDangkyboi;
        this.strDangkytren = strDangkytren;
        this.strThanhtoan = strThanhtoan;
        this.strKhancap = strKhancap;
        this.strChitiettt = strChitiettt;
        this.strChitietbl = strChitietbl;
        this.iSdt = iSdt;
        this.strHoten = strHoten;
        this.strNic = strNic;
        this.strDiachi = strDiachi;
        this.strEmail = strEmail;
        this.strLienhe = strLienhe;
        this.strHangtv = strHangtv;
        this.strBiennhan = strBiennhan;
        this.strHinhthuctt = strHinhthuctt;
        this.strChieucao = strChieucao;
        this.strCannang = strCannang;
        this.strNhanxet = strNhanxet;
        this.bGioitinh = bGioitinh;
    }
    public ThanhVien() {
        this.iId = 0;
        this.iIdtv = 0;
        this.iSdt = 0;
        this.strChitiettt = "";
        this.strChitietbl = "";
        this.strDangkyboi = "";
        this.strDangkytren = "";
        this.strThanhtoan = "";
        this.strKhancap = "";
        this.strHoten = "";
        this.strNic = "";
        this.strDiachi = "";
        this.strEmail = "";
        this.strLienhe = "";
        this.strHangtv = "";
        this.strBiennhan = "";
        this.strHinhthuctt = "";
        this.strChieucao = "";
        this.strCannang = "";
        this.strNhanxet = "";
        this.bGioitinh = true;
    }
}
