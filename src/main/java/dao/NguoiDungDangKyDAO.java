/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.NguoiDung;
import entity.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.*;
import utils.XJdbcc;

/**
 *
 * @author PC
 */
public class NguoiDungDangKyDAO extends MusicDAO<NguoiDung, String> {

    String INSERT = "INSERT INTO NguoiDung (HoTen, email, TenTK) VALUES (?, ?, ?)";
    String UPDATE = "UPDATE NguoiDung SET avatar = ? WHERE TenTK = ?";
//    String SELECT_BY_ID = "SELECT * FROM NguoiDung WHERE HoTen = ?";
    String SELECT_BY_ID = "select NguoiDung.TenTK, TaiKhoan.MatKhau, NguoiDung.avatar from NguoiDung join TaiKhoan on NguoiDung.TenTK = TaiKhoan.TenTK where TaiKhoan.TenTK = ?";

    @Override
    public void insert(NguoiDung entity) {
        try {
            XJdbcc.update(INSERT, entity.getHoTen(), entity.getEmail(),  entity.getTenTK());
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
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbcc.query(sql, args);
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setHoTen(rs.getString(2));
                nd.setEmail(rs.getString(3));
                nd.setAvatar(rs.getString(4));
                nd.setTenTK(rs.getString(5));
                list.add(nd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
