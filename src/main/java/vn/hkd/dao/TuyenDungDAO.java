package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.TuyenDung;

public class TuyenDungDAO {
	
	//GET danh sách các tuyển dụng
	public ArrayList<TuyenDung> getListTuyenDung() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.tuyendung";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<TuyenDung> list = new ArrayList<>();
		while (rs.next()) {
			TuyenDung tuyendung = new TuyenDung();
			tuyendung.setIdTuyenDung(rs.getLong("id_td"));
			tuyendung.setTinTuyenDung(rs.getString("tin_td"));
			tuyendung.setBdTuyenDung(rs.getString("bd_td"));
			tuyendung.setKtTuyenDung(rs.getString("kt_td"));
			list.add(tuyendung);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertTuyenDung(TuyenDung c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`tuyendung` (`id_td`, `tin_td`, `bd_td`, `kt_td`) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdTuyenDung());
			ps.setString(2, c.getTinTuyenDung());
			ps.setString(3, c.getBdTuyenDung());
			ps.setString(4, c.getKtTuyenDung());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateTuyenDung(TuyenDung c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`tuyendung` SET `tin_td` = ?, `bd_td` = ?, `kt_td` = ? WHERE `id_td` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getTinTuyenDung());
			ps.setString(2, c.getBdTuyenDung());
			ps.setString(3, c.getKtTuyenDung());
			ps.setLong(4, c.getIdTuyenDung());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteTuyenDung(long id_td) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`tuyendung` WHERE `id_td` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_td);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(TuyenDungDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
