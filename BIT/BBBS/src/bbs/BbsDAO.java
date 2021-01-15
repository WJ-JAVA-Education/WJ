package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAO {
		
		private Connection conn;
	    //pstmt는 메소드에서 각자 새로 만든다. ( 중복의 문제 발생 )
		private ResultSet rs;
		
		public BbsDAO() {
			try {
				String dbURL = "jdbc:mysql://localhost:3306/BBS?useSSL=false";
				String dbID = "root";
				String dbPassword = "root";
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//DB연결 닫기
		public void closeAll() {	
			try {
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		//현재 날짜를 DB에서 검색해 리턴
		public String getDate() {
			String SQL = "select now()";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					return rs.getString(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return ""; //데이터베이스 오류
		}
		// 가장 최근에 적은 글의 ID + 1 을 리턴
		public int getNext() {
			String SQL = "select bbsID from BBS order by bbsID desc";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					return rs.getInt(1) + 1;
				}
				return 1; //첫 번째 게시물인 경우
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return -1; //데이터베이스 오류
		}
		// 새 게시판 글을 DB에 입력
		public int write(String bbsTitle, String userID, String bbsContent) {
			
			int next = getNext();
			String now = getDate();
			
			String SQL = "insert into bbs values(?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				pstmt.setInt(1, next);
				pstmt.setString(2, bbsTitle);
				pstmt.setString(3, userID);
				pstmt.setString(4, now);
				pstmt.setString(5, bbsContent);
				pstmt.setInt(6, 1);  	//삭제되지 않은 글
				return pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeAll();
			}
			return -1; //데이터베이스 오류
		}
		
		
		
}
