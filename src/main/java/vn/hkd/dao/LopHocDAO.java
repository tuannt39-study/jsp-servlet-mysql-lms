package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.LopHoc;

public class LopHocDAO {
	
	// get danh sách các lớp học
	public ArrayList<LopHoc> getListLopHoc() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.lophoc";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<LopHoc> list = new ArrayList<>();
		while (rs.next()) {
			LopHoc lophoc = new LopHoc();
			lophoc.setIdLopHoc(rs.getLong("id_loph"));
			lophoc.setTenLopHoc(rs.getString("ten_loph"));
			lophoc.setDbLopHoc(rs.getString("bd_loph"));
			lophoc.setKtLopHoc(rs.getString("kt_loph"));
			list.add(lophoc);
		}
		return list;
	}

    // thêm mới dữ liệu
    public static boolean insertLopHoc(LopHoc c) throws ClassNotFoundException, SQLException {
        Connection connection = MySQLConnection.getMySQLConnection();
        String sql = "INSERT INTO `lms`.`lophoc` (`id_loph`, `ten_loph`, `bd_loph`, `kt_loph`) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, c.getIdLopHoc());
            ps.setString(2, c.getTenLopHoc());
            ps.setString(3, c.getDbLopHoc());
            ps.setString(4, c.getKtLopHoc());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
        return false;
    }

    // cập nhật dữ liệu
    public static boolean updateLopHoc(LopHoc c) throws ClassNotFoundException, SQLException {
        Connection connection = MySQLConnection.getMySQLConnection();
        String sql = "UPDATE `lms`.`lophoc` SET `ten_loph` = ?, `bd_loph` = ?, `kt_loph` = ? WHERE `id_loph` = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, c.getTenLopHoc());
            ps.setString(2, c.getDbLopHoc());
            ps.setString(3, c.getKtLopHoc());
            ps.setLong(4, c.getIdLopHoc());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
        return false;
    }

    // xóa dữ liệu
    public static boolean deleteLopHoc(long id_loph) throws ClassNotFoundException, SQLException {
        Connection connection = MySQLConnection.getMySQLConnection();
        String sql = "DELETE FROM `lms`.`lophoc` WHERE `id_loph` = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, id_loph);
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
        return false;
    }
}
