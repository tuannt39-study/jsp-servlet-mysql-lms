package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.TaiKhoan;

public class TaiKhoanDAO {
	
	//GET danh sách các tài khoản
	public ArrayList<TaiKhoan> getListTaiKhoan() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.taikhoan";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<TaiKhoan> list = new ArrayList<>();
		while (rs.next()) {
			TaiKhoan taikhoan = new TaiKhoan();
			taikhoan.setEmailTaiKhoan(rs.getString("email_tk"));
			taikhoan.setLoaiTaiKhoan(rs.getString("loai_tk"));
			taikhoan.setTenDayDu(rs.getString("fullname_tk"));
			taikhoan.setmatKhauTaiKhoan(rs.getString("matkhau_tk"));
			taikhoan.setMoTaiKhoan(rs.getString("ngaymo_tk"));
			taikhoan.setKhoaTaiKhoan(rs.getString("ngaykhoa_tk"));
			list.add(taikhoan);
		}
		return list;
	}

	//Kiểm tra email tồn tại chưa
	public boolean checkEmail(String email) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.taikhoan WHERE email_tk = '" + email + "'";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				connection.close();
				return true;
			}
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	//Kiểm tra đăng nhập
	public static TaiKhoan login(String email, String password) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.taikhoan WHERE email_tk = '" + email + "' AND matkhau_tk='" + password + "'";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TaiKhoan taikhoan = new TaiKhoan();
				taikhoan.setEmailTaiKhoan(rs.getString("email_tk"));
				taikhoan.setLoaiTaiKhoan(rs.getString("loai_tk"));
				taikhoan.setTenDayDu(rs.getString("fullname_tk"));
				taikhoan.setmatKhauTaiKhoan(rs.getString("matkhau_tk"));
				connection.close();
				return taikhoan;
			}
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	//Thêm dữ liệu mới
	public static boolean insertTaiKhoan(TaiKhoan c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`taikhoan` (`email_tk`, `loai_tk`, `fullname_tk`, `matkhau_tk`, `ngaymo_tk`, `ngaykhoa_tk`) VALUES  (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getEmailTaiKhoan());
			ps.setString(2, c.getLoaiTaiKhoan());
			ps.setString(3, c.getTenDayDu());
			ps.setString(4, c.getMatKhauTaiKhoan());
			ps.setString(5, c.getMoTaiKhoan());
			ps.setString(6, c.getKhoaTaiKhoan());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateTaiKhoan(TaiKhoan c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`taikhoan` SET `loai_tk` = ?, `fullname_tk` = ?, `matkhau_tk` = ?, `ngaymo_tk` = ?, `ngaykhoa_tk` = ? WHERE `email_tk` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getLoaiTaiKhoan());
			ps.setString(2, c.getTenDayDu());
			ps.setString(3, c.getMatKhauTaiKhoan());
			ps.setString(4, c.getMoTaiKhoan());
			ps.setString(5, c.getKhoaTaiKhoan());
			ps.setString(6, c.getEmailTaiKhoan());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteTaiKhoan(String email_tk) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`taikhoan` WHERE `email_tk` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, email_tk);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(TaiKhoanDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
