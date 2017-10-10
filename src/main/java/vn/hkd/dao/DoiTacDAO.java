package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.DoiTac;

public class DoiTacDAO {
	
	//GET danh sách các đối tác
	public ArrayList<DoiTac> getListDoiTac() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.doitac";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<DoiTac> list = new ArrayList<>();
		while (rs.next()) {
			DoiTac doitac = new DoiTac();
			doitac.setIdDoiTac(rs.getLong("id_dt"));
			doitac.setTenDoiTac(rs.getString("ten_dt"));
			doitac.setTruSoDoiTac(rs.getString("truso_dt"));
			doitac.setVanPhongDoiTac(rs.getString("vanphong_dt"));
			doitac.setSdtDoiTac(rs.getString("sdt_dt"));
			doitac.setEmailDoiTac(rs.getString("email_dt"));
			doitac.setWebsiteDoiTac(rs.getString("website_dt"));
			doitac.setBdDoiTac(rs.getString("bdhoptac_dt"));
			doitac.setKtDoiTac(rs.getString("kthoptac_dt"));
			list.add(doitac);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertDoiTac(DoiTac c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`doitac` (`id_dt`, `ten_dt`, `truso_dt`, `vanphong_dt`, `sdt_dt`, `email_dt`, `website_dt`, `bdhoptac_dt`, `kthoptac_dt`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdDoiTac());
			ps.setString(2, c.getTenDoiTac());
			ps.setString(3, c.getTruSoDoiTac());
			ps.setString(4, c.getVanPhongDoiTac());
			ps.setString(5, c.getSdtDoiTac());
			ps.setString(6, c.getEmailDoiTac());
			ps.setString(7, c.getWebsiteDoiTac());
			ps.setString(8, c.getBdDoiTac());
			ps.setString(9, c.getKtDoiTac());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateDoiTac(DoiTac c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`doitac` SET `ten_dt` = ?, `truso_dt` = ?, `vanphong_dt` = ?, `sdt_dt` = ?, `email_dt` = ?, `website_dt` = ?, `bdhoptac_dt` = ?, `kthoptac_dt` = ? WHERE `id_dt` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, c.getTenDoiTac());
			ps.setString(2, c.getTruSoDoiTac());
			ps.setString(3, c.getVanPhongDoiTac());
			ps.setString(4, c.getSdtDoiTac());
			ps.setString(5, c.getEmailDoiTac());
			ps.setString(6, c.getWebsiteDoiTac());
			ps.setString(7, c.getBdDoiTac());
			ps.setString(8, c.getKtDoiTac());
			ps.setLong(9, c.getIdDoiTac());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteDoiTac(long id_dt) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`doitac` WHERE `id_dt` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_dt);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(DoiTacDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
