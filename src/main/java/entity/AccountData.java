/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.File;

/**
 *
 * @author PC
 */
public class AccountData {

    private static String tenTK;
    private static String linkAnh;

    public static String getTenTK() {
        return tenTK;
    }
    public static void setTenTK(String name) {
        tenTK = name;

    }
    public static String getLink(){
        return linkAnh;
    }
    public static void setLink(String link){
        linkAnh = link;
    }

}
