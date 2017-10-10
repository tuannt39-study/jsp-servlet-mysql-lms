package vn.hkd.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String database_name = "lms";
		String user_name = "tuan";
		String password = "1234";
		String server_name = "localhost";
		String port_number = "3306";
		Connection conn = null;
		try {
			Class.forName(driver);
			String db_url = "jdbc:mysql://" + server_name + ":" + port_number + "/" + database_name + "?autoReconnect=true&useSSL=false";
			conn = DriverManager.getConnection(db_url, user_name, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
