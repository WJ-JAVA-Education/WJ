package tour;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardMgr {
	
	private DBConnectionMgr pool;
	public static final String SAVEFOLDER = "C:/Jsp/eclipse-workspace/myapp/WebContent/tour/fileupload/";
	public static final String ENCTYPE = "EUC-KR";
	public static int MAXSIZE = 10*1024*1024;
	
	public BoardMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//Board Insert : 파일 업로드, ContentType, ref 상대적인 위치값
	public void insertBoard(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			///////파일 업로더////////
			File dir = new File(SAVEFOLDER);
			//폴더가 없다면 새롭게 만들어라.
			if(!dir.exists()) {
				dir.mkdirs();
			}
			MultipartRequest multi =  new MultipartRequest(req, SAVEFOLDER, MAXSIZE, ENCTYPE, new DefaultFileRenamePolicy());
			String filename = null;
			int filesize = 0;
			if(multi.getFilesystemName("filename")!=null) {
				filename = multi.getFilesystemName("filename");
				filesize = (int)multi.getFile("filename").length();
			}
			////////////////////////
			//게시물 내용(contentType : TEXT, HTML)
			String content = multi.getParameter("content");
			if(multi.getParameter("contentType").equals("TEXT")) {
				content = UtilMgr.replace(content, "<", "&lt;");
			}
			///////////////////////////////
			con = pool.getConnection();
			sql = "select max(num) from toBoard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int ref =1;
			if(rs.next())
				ref = rs.getInt(1)+1;//현재 저장된 num의 1 증가해서 ref 으로 리턴
			////////////////////////////////////////////////////////////////////
			sql = "insert toBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize)";
			sql += "values(?, ?, ?, ?, 0, 0, now(), ?, 0, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, multi.getParameter("name"));
			pstmt.setString(2, content);
			pstmt.setString(3, multi.getParameter("subject"));
			pstmt.setInt(4, ref);
			pstmt.setString(5, multi.getParameter("pass"));
			pstmt.setString(6, multi.getParameter("ip"));
			pstmt.setString(7,filename);
			pstmt.setInt(8,filesize);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return;
	}
	
	//Board Total Count(총 게시물 갯수)
	public int getTotalCount(String keyField, String keyWord) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int totalCount = 0;
		try {
			con = pool.getConnection();
			if(keyWord.equals("null")||keyWord.equals("")) {
				//검색이 아닌경우
				sql = "select count(*) from toBoard";
				pstmt = con.prepareStatement(sql);
			}else{
				//검색인 경우
				sql = "select count(*) from toBoard where "+keyField +" like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+keyWord+"%");
			}
			rs = pstmt.executeQuery();
			if(rs.next())
				totalCount = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return totalCount;
	}
	
	//Board List
	public Vector<BoardBean> getBoardList(String keyField, String keyWord, int start, int end ){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<BoardBean> vlist = new Vector<>(); 
		try {
			con = pool.getConnection();
			if(keyWord.equals("null")||keyWord.equals("")) {
				sql = "select * from toBoard order by ref desc, pos limit ?, ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, start);
				pstmt.setInt(2, end);
			}else{
				sql = "select * from toBoard where " + keyField +" like ? order by ref desc, pos limit ?, ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,  "%"+keyWord+"%");
				pstmt.setInt(2, start);
				pstmt.setInt(3, end);
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardBean bean = new BoardBean();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setSubject(rs.getString("subject"));
				bean.setPos(rs.getInt("pos"));
				bean.setRef(rs.getInt("ref"));
				bean.setDepth(rs.getInt("depth"));
				//regdate DB 에서 DATA타입이지만 모든 타입은 getString 가능 
				bean.setRegdate(rs.getString("regdate"));
				bean.setCount(rs.getInt("count"));
				bean.setFilename(rs.getString("filename"));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	//Board Get(한개의 게시물)
	public BoardBean getBoard(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		BoardBean bean = new BoardBean();
		try {
			con = pool.getConnection();
			sql = "select * from toBoard where num =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setSubject(rs.getString("subject"));
				bean.setContent(rs.getString("content"));
				bean.setPos(rs.getInt("pos"));
				bean.setRef(rs.getInt("ref"));
				bean.setDepth(rs.getInt("depth"));
				bean.setRegdate(rs.getString("regdate"));
				bean.setPass(rs.getString("pass"));
				bean.setIp(rs.getString("ip"));
				bean.setCount(rs.getInt("count"));
				bean.setFilename(rs.getString("filename"));
				bean.setFilesize(rs.getInt("filesize"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	//Count Up(조회수 증가)
	public void upCount(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "update toBoard set count =count+1 where num=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	//Board Delete(파일 삭제)
	public void deleteBoard(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "select filename from toBoard where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs = pstmt.executeQuery();
			if(rs.next()&&rs.getString(1)!=null) {
				if(!rs.getString(1).equals("")) {
					File file = new File(SAVEFOLDER+rs.getString(1));
					if(file.exists()) {
						//파일 삭제 기능
						UtilMgr.delete(SAVEFOLDER+rs.getString(1));
					}
				}
			}
			sql="delete from toBoard where num=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
	}
	
	//Board Update(name,subject,content 3개만 수정)
	public void updateBoard(BoardBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "update toBoard set name=?, subject=?, content=? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bean.getName());
			pstmt.setString(2, bean.getSubject());
			pstmt.setString(3, bean.getContent());
			pstmt.setInt(4, bean.getNum());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return;
	}
	
	//Board Reply(답변)
	public void replyBoard(BoardBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "insert toBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip)";
			sql += "values(?, ?, ?, ?, ?, ?, now(), ?, 0, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getContent());
			pstmt.setString(3, bean.getSubject());
			pstmt.setInt(4, bean.getRef());//원글의 ref저장
			pstmt.setInt(5, bean.getPos()+1);
			pstmt.setInt(6, bean.getDepth()+1);
			pstmt.setString(7, bean.getPass());
			pstmt.setString(8, bean.getIp());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//Board Reply Up(답변 위치값 증가)
	public void replyUpBoard(int ref, int pos) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "update toBoard set pos = pos +1 where ref = ? and pos > ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, pos);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//Post 1000
	//페이징 및 블럭 테스트를 위한 게시물 저장 메소드 
		public void post1000(){
			Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				con = pool.getConnection();
				sql = "insert toBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize)";
				sql+="values('aaa', 'bbb', 'ccc', 0, 0, 0, now(), '1111',0, '127.0.0.1', null, 0);";
				pstmt = con.prepareStatement(sql);
				for (int i = 0; i < 1000; i++) {
					pstmt.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
		}
	
	//main
	public static void main(String[] args) {
		BoardMgr mgr = new BoardMgr();
		mgr.post1000();
		System.out.println("성공~");
	}
}
