package mail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import upload.DBConnectionMgr;

public class MemberMgr {
	
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//id와 email를 조건 : pwd 리턴
	//select pwd from tblMember id=? and email=?
	public String findPwd(String id, String email) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String pwd = null;
		try {
			con = pool.getConnection();
			sql = "select pwd from tblMember where id=? and email=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			rs = pstmt.executeQuery();
			if(rs.next()) 
				pwd = rs.getString(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return pwd;
	}
}









