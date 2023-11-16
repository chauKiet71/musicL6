/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PC
 */
public class Playlist {
    public String maPlayList;
    public String tenPlaylist;
    public String maBH;
    public String maND;

    public Playlist() {
    }

    public Playlist(String maPlayList, String tenPlaylist, String maBH, String maND) {
        this.maPlayList = maPlayList;
        this.tenPlaylist = tenPlaylist;
        this.maBH = maBH;
        this.maND = maND;
    }

    public String getMaPlayList() {
        return maPlayList;
    }

    public void setMaPlayList(String maPlayList) {
        this.maPlayList = maPlayList;
    }

    public String getTenPlaylist() {
        return tenPlaylist;
    }

    public void setTenPlaylist(String tenPlaylist) {
        this.tenPlaylist = tenPlaylist;
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
