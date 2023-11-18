/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.TaiKhoan;

/**
 *
 * @author PC
 */
public class Auth {
    public static TaiKhoan tenTk;
    public static void clean(){
        Auth.tenTk = null;
    }
}
