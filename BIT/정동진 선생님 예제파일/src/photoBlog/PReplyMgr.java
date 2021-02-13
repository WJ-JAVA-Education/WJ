package photoBlog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

//PhotoBlog 댓글 기능과 관련된 SQL문 메소드
public class PReplyMgr {

	private DBConnectionMgr pool;
	
	public PReplyMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//PReply Insert : 댓글 입력
	public void insertPReply(PReplyBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			//num : 포토포스트 , id는 댓글를 쓴 작성자
			sql = "insert tblPReply(num,id,rdate,comment)"
					+ "values(?,?,now(),?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			pstmt.setString(2, bean.getId());
			pstmt.setString(3, bean.getComment());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//PReply Delete : 댓글 삭제
	public void deletePReply(int rnum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			//rnum : 댓글을 구분하는 PK값
			sql = "delete from tblPReply where rnum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rnum);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//PReply All Delete : PhotoBlog 삭제시 관련된 댓글 모두 삭제
	//PBlogDeleteServlet.java에서 호출
	public void deleteAllPReply(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "delete from tblPReply where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//PReply List :댓글 리스트
	public Vector<PReplyBean> listPReply(int num){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<PReplyBean> vlist = new Vector<PReplyBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblPReply where num=? order by rnum desc";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PReplyBean bean = new PReplyBean();
				bean.setRnum(rs.getInt(1));
				bean.setNum(rs.getInt(2));
				bean.setId(rs.getString(3));
				bean.setRdate(rs.getString(4));
				bean.setComment(rs.getString(5));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
}












