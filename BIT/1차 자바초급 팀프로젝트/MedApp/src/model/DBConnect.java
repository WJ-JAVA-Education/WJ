package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private final String USER = "scott";
	private final String PASSWRORD = "tiger";

	Connection conn = null;

	public Connection getConnection() {
		//1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. DB연결
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWRORD);
			// DB 접속 메소드
			return conn; //연결되면 conn을 리턴
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//getConnection(url, user, password)
		return null;
	}

//	public static void main(String[] args) {
//		DBConnect connect = new DBConnect();
//
//		Connection conn = connect.getConnection();
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		String sql = "SELECT * FROM student";
//
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//
//			while(rs.next()) {
//				System.out.printf("%s ", rs.getNString("FULLNAME"));
//				System.out.printf("%s ", rs.getNString("EMAIL"));
//				System.out.printf("%s\n", rs.getNString("PASSWORD"));
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
