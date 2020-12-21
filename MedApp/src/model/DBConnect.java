package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private final String USER = "scott";
	private final String PASSWRORD = "oracle";

	Connection conn = null;

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWRORD);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
