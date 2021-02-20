package jspstudy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberMgr {
	
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public String listEmail(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String email = null;
		try {
			con = pool.getConnection();
			sql = "select email from _member order by num limit ?,1";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) 
				email = rs.getString(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return email;
	}
	
	public int getTotal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int total  = 0;
		try {
			con = pool.getConnection();
			sql = "select count(*) from _member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) 
				total = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return total;
	}
	
}









