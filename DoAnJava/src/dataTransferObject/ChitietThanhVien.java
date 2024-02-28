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
public class ChitietThanhVien {
    private int iId;
    private String strTong,strBienlai,strThanhToan,strNgay,strTtboi;

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getStrTong() {
        return strTong;
    }

    public void setStrTong(String strTong) {
        this.strTong = strTong;
    }

    public String getStrBienlai() {
        return strBienlai;
    }

    public void setStrBienlai(String strBienlai) {
        this.strBienlai = strBienlai;
    }

    public String getStrThanhToan() {
        return strThanhToan;
    }

    public void setStrThanhToan(String strThanhToan) {
        this.strThanhToan = strThanhToan;
    }

    public String getStrNgay() {
        return strNgay;
    }

    public void setStrNgay(String strNgay) {
        this.strNgay = strNgay;
    }

    public String getStrTtboi() {
        return strTtboi;
    }

    public void setStrTtboi(String strTtboi) {
        this.strTtboi = strTtboi;
    }

    public ChitietThanhVien(int iId, String strTong, String strBienlai, String strThanhToan, String strNgay, String strTtboi) {
        this.iId = iId;
        this.strTong = strTong;
        this.strBienlai = strBienlai;
        this.strThanhToan = strThanhToan;
        this.strNgay = strNgay;
        this.strTtboi = strTtboi;
    }
    public ChitietThanhVien() {
        this.iId = 0;
        this.strTong = "";
        this.strBienlai = "";
        this.strThanhToan = "";
        this.strNgay = "";
        this.strTtboi = "";
    }
}
