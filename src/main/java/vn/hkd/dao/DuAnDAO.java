package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.DuAn;

public class DuAnDAO {
	
	//GET danh sách các dự án
	public ArrayList<DuAn> getListDuAn() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.duan";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<DuAn> list = new ArrayList<>();
		while (rs.next()) {
			DuAn duan = new DuAn();
			duan.setIdDuAn(rs.getLong("id_da"));
			duan.setTenDuAn(rs.getString("ten_da"));
			duan.setTenKhachHang(rs.getString("tenkhachhang_da"));
			duan.setBdDuAn(rs.getString("bd_da"));
			duan.setKtDuAn(rs.getString("kt_da"));
			list.add(duan);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertDuAn(DuAn c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`duan` (`id_da`, `ten_da`, `tenkhachhang_da`, `bd_da`, `kt_da`) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdDuAn());
			ps.setString(2, c.getTenDuAn());
			ps.setString(3, c.getTenKhachHang());
			ps.setString(4, c.getBdDuAn());
			ps.setString(5, c.getKtDuAn());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateDuAn(DuAn c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`duan` SET `ten_da` = ?, `tenkhachhang_da` = ?, `bd_da` = ?, `kt_da` = ? WHERE `id_da` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getTenDuAn());
			ps.setString(2, c.getTenKhachHang());
			ps.setString(3, c.getBdDuAn());
			ps.setString(4, c.getKtDuAn());
			ps.setLong(5, c.getIdDuAn());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteDuAn(long id_da) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`duan` WHERE `id_da` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_da);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(DuAnDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
