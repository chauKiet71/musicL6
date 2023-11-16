package utils;

import java.sql.*;

public class XJdbcc {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=Music";   
    static String user = "sa";
    static String pass = "123";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStm(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement stm;
        if (sql.trim().startsWith("{")) {
            stm = con.prepareCall(sql); // gọi thủ tục lưu
        } else {
            stm = con.prepareStatement(sql); // tạo một prepareStm để thực hiện thao tác và truy vấn đến cơ sở dữ liệu
        }
        for (int i = 0; i < args.length; i++) {
            stm.setObject(i + 1, args[i]);
        }
        return stm;
    }

    public static int update(String sql, Object... args) throws SQLException {
        try {
            PreparedStatement stm = XJdbcc.getStm(sql, args);
            try {
                return stm.executeUpdate();
            } finally {
                stm.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stm = XJdbcc.getStm(sql, args);
        return stm.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = XJdbcc.query(sql, args);
            while (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
