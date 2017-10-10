package vn.hkd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.hkd.connect.MySQLConnection;
import vn.hkd.model.HocPhi;

public class HocPhiDAO {
	
	//GET danh sách các học phí
	public ArrayList<HocPhi> getListHocPhi() throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "SELECT * FROM lms.hocphi";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<HocPhi> list = new ArrayList<>();
		while (rs.next()) {
			HocPhi hocphi = new HocPhi();
			hocphi.setIdHocPhi(rs.getLong("id_hp"));
			hocphi.setHpPhaiNop(rs.getInt("phainop_hp"));
			hocphi.setHpNop1(rs.getInt("lan1_hp"));
			hocphi.setNgayNop1(rs.getString("ngaynop1_hp"));
			hocphi.setHpNop2(rs.getInt("lan2_hp"));
			hocphi.setNgayNop2(rs.getString("ngaynop2_hp"));
			hocphi.setHpNop3(rs.getInt("lan3_hp"));
			hocphi.setNgayNop3(rs.getString("ngaynop3_hp"));
			hocphi.setHpNop4(rs.getInt("lan4_hp"));
			hocphi.setNgayNop4(rs.getString("ngaynop4_hp"));
			list.add(hocphi);
		}
		return list;
	}
	
	//Thêm dữ liệu mới
	public static boolean insertHocPhi(HocPhi c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "INSERT INTO `lms`.`hocphi` (`id_hp`, `phainop_hp`, `lan1_hp`, `ngaynop1_hp`, `lan2_hp`, `ngaynop2_hp`, `lan3_hp`, `ngaynop3_hp`, `lan4_hp`, `ngaynop4_hp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getIdHocPhi());
			ps.setInt(2, c.getHpPhaiNop());
			ps.setInt(3, c.getHpNop1());
			ps.setString(4, c.getNgayNop1());
			ps.setInt(5, c.getHpNop2());
			ps.setString(6, c.getNgayNop2());
			ps.setInt(7, c.getHpNop3());
			ps.setString(8, c.getNgayNop3());
			ps.setInt(9, c.getHpNop4());
			ps.setString(10, c.getNgayNop4());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Cập nhật dữ liệu
	public static boolean updateHocPhi(HocPhi c) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "UPDATE `lms`.`hocphi` SET `phainop_hp` = ?, `lan1_hp` = ?, `ngaynop1_hp` = ?, `lan2_hp` = ?, `ngaynop2_hp` = ?, `lan3_hp` = ?, `ngaynop3_hp` = ?, `lan4_hp` = ?, `ngaynop4_hp` = ? WHERE `id_hp` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setInt(1, c.getHpPhaiNop());
			ps.setInt(2, c.getHpNop1());
			ps.setString(3, c.getNgayNop1());
			ps.setInt(4, c.getHpNop2());
			ps.setString(5, c.getNgayNop2());
			ps.setInt(6, c.getHpNop3());
			ps.setString(7, c.getNgayNop3());
			ps.setInt(8, c.getHpNop4());
			ps.setString(9, c.getNgayNop4());
			ps.setLong(10, c.getIdHocPhi());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(LopHocDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	//Xóa nhật dữ liệu
	public static boolean deleteHocPhi(long id_hp) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getMySQLConnection();
		String sql = "DELETE FROM `lms`.`hocphi` WHERE `id_hp` = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_hp);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(HocPhiDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
