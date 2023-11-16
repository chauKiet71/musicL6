/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.TaiKhoan;
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
public class TaiKhoanDangKyDAO extends MusicDAO<TaiKhoan, String>{
    String INSERT = "INSERT INTO TaiKhoan (TenTK, MatKhau, VaiTro, TrangThai) VALUES (?, ?, ?, ?)";
    String SELECT_BY_ID = "SELECR * FROM TaiKhoan WWHERE TenTK = ?";

    @Override
    public void insert(TaiKhoan entity) {
        try {
            XJdbcc.update(INSERT, entity.getTenTk(), entity.getMatKhau(), entity.isVaiTro(), entity.getTrangThai());
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDangKyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(TaiKhoan entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String Key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TaiKhoan selectById(String Key) {
        List<TaiKhoan> list = this.selectBySql(SELECT_BY_ID, Key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
