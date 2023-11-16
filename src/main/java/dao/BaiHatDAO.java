
package dao;

import entity.BaiHatEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import utils.XJdbcc;


public class BaiHatDAO {
     String sql_insert = "insert into NhanVien(MaNV, MatKhau, HoTen, Email, VaiTro) values (?,?,?,?,?)";
    String sql_update = "update NhanVien set MatKhau = ?, HoTen = ?, Email = ?, VaiTro = ? where MaNV = ?";
    String sql_delete = "Delete from NhanVien where MaNV = ?";
    String sql_selectAll = "Select * from BaiHat";
    String sql_selectById = "Select * from BaiHat where MaBh = ?";
    String sql_selectByMatKhau = "Select * from NhanVien where MatKhau = ?";
    String sql_selectByEmail = "Select * from NhanVien where Email = ?";

    public List<BaiHatEntity> selectAll() {
        return this.selectBySql(sql_selectAll);
    }

    public BaiHatEntity selectById(String id) {
        List<BaiHatEntity> list = this.selectBySql(sql_selectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<BaiHatEntity> selectBySql(String sql, Object... args) {
        List<BaiHatEntity> list = new ArrayList<BaiHatEntity>();
        try {
            ResultSet rs = XJdbcc.query(sql, args);
            while (rs.next()) {
                BaiHatEntity entity = new BaiHatEntity();

                entity.setMaBh(rs.getString(1));
                entity.setTenBh(rs.getString(2));
                entity.setCaSi(rs.getString(3));
                entity.setNhacSi(rs.getString(4));
                entity.setAmThanh(rs.getString(5));
                entity.setAnh(rs.getString(6));
                entity.setLoiBh(rs.getString(7));
                entity.setThoiGian(rs.getString(8));
                entity.setSoLuotThich(rs.getInt(9));
                entity.setSoluotNghe(rs.getInt(10));
                entity.setMaTheLoai(rs.getString(11));
     
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
