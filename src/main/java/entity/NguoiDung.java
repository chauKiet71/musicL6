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
public class NguoiDung {
    public String maND;
    public String hoTen;
    public String email;
    public String avatar;
    public String tenTK;

    public NguoiDung() {
    }

    public NguoiDung(String maND, String hoTen, String email, String avatar, String tenTK) {
        this.maND = maND;
        this.hoTen = hoTen;
        this.email = email;
        this.avatar = avatar;
        this.tenTK = tenTK;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
    
}
