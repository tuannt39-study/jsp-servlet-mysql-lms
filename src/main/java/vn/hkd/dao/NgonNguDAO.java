package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.NgonNgu;

public class NgonNguDAO {
	
	//GET danh sách các ngôn ngữ
	public ArrayList<NgonNgu> getListNgonNgu() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.ngonngu";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<NgonNgu> list = new ArrayList<>();
		while (rs.next()) {
			NgonNgu ngonngu = new NgonNgu();
			ngonngu.setIdNgonNgu(rs.getLong("id_nn"));
			ngonngu.setTenNgonNgu(rs.getString("ten_nn"));
			list.add(ngonngu);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertNgonNgu(NgonNgu c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`ngonngu` (`id_nn`, `ten_nn`) VALUES (?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdNgonNgu());
			ps.setString(2, c.getTenNgonNgu());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateNgonNgu(NgonNgu c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`ngonngu` SET `ten_nn` = ? WHERE `id_nn` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getTenNgonNgu());
			ps.setLong(2, c.getIdNgonNgu());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteNgonNgu(long id_nn) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`ngonngu` WHERE `id_nn` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_nn);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(NgonNguDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
