package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.LichHoc;

public class LichHocDAO {
	
	//GET danh sách các lịch học
	public ArrayList<LichHoc> getListLichHoc() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.lichhoc";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<LichHoc> list = new ArrayList<>();
		while (rs.next()) {
			LichHoc lichhoc = new LichHoc();
			lichhoc.setIdLichHoc(rs.getLong("id_lichh"));
			lichhoc.setThu(rs.getString("thu"));
			lichhoc.setBdLichHoc(rs.getString("bd_lichh"));
			lichhoc.setKtLichHoc(rs.getString("kt_lichh"));
			lichhoc.setDiaDiemLichHoc(rs.getString("diadiem_lichh"));
			list.add(lichhoc);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertLichHoc(LichHoc c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`lichhoc` (`id_lichh`, `thu`, `bd_lichh`, `kt_lichh`, `diadiem_lichh`) VALUES  (?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdLichHoc());
			ps.setString(2, c.getThu());
			ps.setString(3, c.getBdLichHoc());
			ps.setString(4, c.getKtLichHoc());
			ps.setString(5, c.getDiaDiemLichHoc());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateLichHoc(LichHoc c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`lichhoc` SET `thu` = ?, `bd_lichh` = ?, `kt_lichh` = ?, `diadiem_lichh` = ? WHERE `id_lichh` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getThu());
			ps.setString(2, c.getBdLichHoc());
			ps.setString(3, c.getKtLichHoc());
			ps.setString(4, c.getDiaDiemLichHoc());
			ps.setLong(5, c.getIdLichHoc());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteLichHoc(long id_lichh) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`lichhoc` WHERE `id_lichh` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_lichh);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LichHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
