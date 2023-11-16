/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PC
 */
public class TaiKhoan {
    public String tenTk;
    public String matKhau;
    public boolean vaiTro;
    public String trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenTk, String matKhau, boolean vaiTro, String trangThai) {
        this.tenTk = tenTk;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
   
    
}
