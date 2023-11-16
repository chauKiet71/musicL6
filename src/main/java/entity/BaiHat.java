/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PC
 */
public class BaiHat {
    public String maBH;
    public String temBH;
    public String caSi;
    public String amThanh;
    public String anh;
    public String loiBaiHat;
    public String thoiGian;
    public int soLuotThich;
    public int soLuongNghe;
    public String maTheLoai;

    public BaiHat() {
    }

    public BaiHat(String maBH, String temBH, String caSi, String amThanh, String anh, String loiBaiHat, String thoiGian, int soLuotThich, int soLuongNghe, String maTheLoai) {
        this.maBH = maBH;
        this.temBH = temBH;
        this.caSi = caSi;
        this.amThanh = amThanh;
        this.anh = anh;
        this.loiBaiHat = loiBaiHat;
        this.thoiGian = thoiGian;
        this.soLuotThich = soLuotThich;
        this.soLuongNghe = soLuongNghe;
        this.maTheLoai = maTheLoai;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getTemBH() {
        return temBH;
    }

    public void setTemBH(String temBH) {
        this.temBH = temBH;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public String getAmThanh() {
        return amThanh;
    }

    public void setAmThanh(String amThanh) {
        this.amThanh = amThanh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getLoiBaiHat() {
        return loiBaiHat;
    }

    public void setLoiBaiHat(String loiBaiHat) {
        this.loiBaiHat = loiBaiHat;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getSoLuotThich() {
        return soLuotThich;
    }

    public void setSoLuotThich(int soLuotThich) {
        this.soLuotThich = soLuotThich;
    }

    public int getSoLuongNghe() {
        return soLuongNghe;
    }

    public void setSoLuongNghe(int soLuongNghe) {
        this.soLuongNghe = soLuongNghe;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
    
}
