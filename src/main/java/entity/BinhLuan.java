/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author PC
 */
public class BinhLuan {
    public int maBinhLuan;
    public String noiDung;
    public Date ngayTao;
    public String maBH;
    public String maND;

    public BinhLuan() {
    }

    public BinhLuan(int maBinhLuan, String noiDung, Date ngayTao, String maBH, String maND) {
        this.maBinhLuan = maBinhLuan;
        this.noiDung = noiDung;
        this.ngayTao = ngayTao;
        this.maBH = maBH;
        this.maND = maND;
    }

    public int getMaBinhLuan() {
        return maBinhLuan;
    }

    public void setMaBinhLuan(int maBinhLuan) {
        this.maBinhLuan = maBinhLuan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }
    
}
