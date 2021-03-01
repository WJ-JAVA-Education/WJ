package tour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import tour.Gmail_Mail;


public class MemberMgr {

	private DBConnectionMgr pool;
	
	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//ID 중복확인
	public boolean checkId(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag  = false;
		try {
			con = pool.getConnection();
			sql = "select id from toMember where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();//sql문 실행
			flag = rs.next();//true이면 중복, false 중복아님.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}

	//회원가입
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert toMember(id,pwd,name,"
					+ "birthday,gender,email,hp)"
					+ "values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getBirthday());
			pstmt.setString(5, bean.getGender());
			pstmt.setString(6, bean.getEmail());
			pstmt.setString(7, bean.getHp());
			//pstmt.setString(8, bean.getGrade());
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//로그인
	public boolean loginMember(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "select id from toMember where id =? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			flag = rs.next();//조건에 맞는 id가 있다면 true
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}
	
	
	//회원정보 가져오기
	public MemberBean getMember(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from toMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setId(rs.getString("id"));
				bean.setPwd(rs.getString("pwd"));
				bean.setName(rs.getString("name"));
				bean.setBirthday(rs.getString("birthday"));
				bean.setGender(rs.getString("gender"));
				bean.setEmail(rs.getString("email"));
				bean.setHp(rs.getString("hp"));
				bean.setGrade(rs.getString("grade"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	//회원정보 수정
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update toMember set pwd=?, name=?, birthday=?,gender=?, email=?, hp=? where id=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getPwd());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getBirthday());
			pstmt.setString(4, bean.getGender());
			pstmt.setString(5, bean.getEmail());
			pstmt.setString(6, bean.getHp());
			pstmt.setString(7, bean.getId());
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//회원탈퇴
	public boolean deleteMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from toMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bean.getId());
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	///admin mode/////////////
		public Vector<MemberBean> getMemberList() {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			Vector<MemberBean> vlist = new Vector<>();
			try {
				con = pool.getConnection();
				sql = "select * from toMember";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					MemberBean bean = new MemberBean();
					bean.setId(rs.getString("id"));
					bean.setPwd(rs.getString("pwd"));
					bean.setName(rs.getString("name"));
					bean.setBirthday(rs.getString("birthday"));
					bean.setGender(rs.getString("gender"));
					bean.setEmail(rs.getString("email"));
					bean.setHp(rs.getString("hp"));
					bean.setGrade(rs.getString("grade"));
					vlist.addElement(bean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return vlist;
		}
		
		//Admin Login
		public boolean adminCheck(String admin_id, String admin_pwd) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "select admin_id, admin_pwd from tblAdmin where admin_id = ? and admin_pwd = ?";
				//일단은 tbladmin으로 남겨났습니다.
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, admin_id);
				pstmt.setString(2, admin_pwd);
				rs = pstmt.executeQuery();
				flag = rs.next();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con);
			}
			return flag;
		}
		//Send id,pwd
		public void sendAccount(String id) {
			MemberBean bean = getMember(id);
			String pwd = bean.getPwd();
			String title ="000.com에서 아이디와 비밀 번호 전송합니다.";
			String content = "id : "+id + "/ pwd : " + pwd;
			String toEmail = bean.getEmail();
			Gmail_Mail.send(title, content, toEmail);
		}
}
	






