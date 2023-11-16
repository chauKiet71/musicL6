/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.NguoiDung;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.*;
import utils.XJdbcc;

/**
 *
 * @author PC
 */
public class NguoiDungDangKyDAO extends MusicDAO<NguoiDung, String>{
    String INSERT = "INSERT INTO NguoiDung (HoTen, email, avatar, TenTK) VALUES (?, ?, ?, ?)";
    String UPDATE = "UPDATE NguoiDung SET avatar = ? WHERE TenTK = ?";
    String SELECT_BY_ID = "SELECT * FROM NguoiDung WHERE HoTen = ?";

    @Override
    public void insert(NguoiDung entity) {
        try {
            XJdbcc.update(INSERT, entity.getHoTen(), entity.getEmail(), entity.getAvatar(), entity.getTenTK());
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDangKyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NguoiDung entity) {
        try {
            XJdbcc.update(UPDATE, entity.getAvatar(), entity.getTenTK());
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDangKyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NguoiDung selectById(String Key) {
      List<NguoiDung> list = this.selectBySql(SELECT_BY_ID, Key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiDung> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<NguoiDung> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
