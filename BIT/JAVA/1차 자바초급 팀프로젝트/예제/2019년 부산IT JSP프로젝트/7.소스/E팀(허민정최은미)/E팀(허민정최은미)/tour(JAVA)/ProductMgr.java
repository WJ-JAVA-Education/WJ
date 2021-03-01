package tour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import tour.ProductBean;

public class ProductMgr {
	
	private DBConnectionMgr pool;
	private static final String UPLOAD = "C:/Jsp/eclipse-workspace/myapp/WebContent/tour/";
	private static final String ENCTYPE = "EUC-KR";
	private static final int MAXSIZE = 10*1024*1024;
	
	public ProductMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//Product List
	public Vector<ProductBean> getProductList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ProductBean> vlist = new Vector<>();
		try {
			con = pool.getConnection();
			sql = "select no, proname, coname, adultprice, childprice,detail,category from toProduct";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductBean bean = new ProductBean();
				bean.setNo(rs.getInt(1));
				bean.setProName(rs.getString(2));
				bean.setCoName(rs.getString(3));
				bean.setAdultPrice(rs.getInt(4));
				bean.setChildPrice(rs.getInt(5));
				bean.setDetail(rs.getString(6));
				bean.setCategory(rs.getInt(7));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	public Vector<ProductBean> getcategoryList(int cate) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ProductBean> vlist = new Vector<>();
		try {
			con = pool.getConnection();
			sql = "select * from toProduct where category=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,cate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductBean bean = new ProductBean();
				bean.setNo(rs.getInt(1));
				bean.setProName(rs.getString(2));
				bean.setCoName(rs.getString(3));
				bean.setAdultPrice(rs.getInt(4));
				bean.setChildPrice(rs.getInt(5));
				bean.setDetail(rs.getString(6));
				bean.setCategory(rs.getInt(7));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	//Product Detail
	public ProductBean getProduct(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ProductBean bean = new ProductBean();
		try {
			con = pool.getConnection();
			sql = "select * from toProduct where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setNo(rs.getInt("no"));//상품번호
				bean.setProName(rs.getString("proname"));//상품이름
				bean.setCoName(rs.getString("coname"));//업체이름
				bean.setAdultPrice(rs.getInt("adultprice"));//어른가격
				bean.setChildPrice(rs.getInt("childprice"));//어린이가격
				bean.setDetail(rs.getString("detail"));//상품상세설명
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	/*//Product Stock Reduce(재고 수정)
	public void reduceProduct(OrderBean order){
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "update tblProduct set stock=stock-? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, order.getQuantity());
			pstmt.setInt(2, order.getProductNo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}*/
	
	/////admin mode///////
	
	//Product Insert
	public boolean insertProduct(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			MultipartRequest multi = 
					new MultipartRequest(req,UPLOAD,MAXSIZE,ENCTYPE,new DefaultFileRenamePolicy());
			con = pool.getConnection();
			sql = "insert toProduct(proname,coname,adultprice,childprice,detail,category) "
					+ " values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, multi.getParameter("proname"));
			pstmt.setString(2, multi.getParameter("coname"));
			pstmt.setInt(3, Integer.parseInt(multi.getParameter("adultprice")));
			pstmt.setInt(4, Integer.parseInt(multi.getParameter("childprice")));
			pstmt.setString(5, multi.getParameter("detail"));
			pstmt.setInt(6, Integer.parseInt(multi.getParameter("category")));
			if(pstmt.executeUpdate()==1)
				flag = true;
			} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//Product Update
	public boolean updateProduct(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			MultipartRequest multi = 
					new MultipartRequest(req,UPLOAD,MAXSIZE,ENCTYPE,new DefaultFileRenamePolicy());
			con = pool.getConnection();
				sql = "update toProduct set proname=?, coname=?, adultprice=?, childprice=?, detail=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, multi.getParameter("proname"));
				pstmt.setString(2, multi.getParameter("coname"));
				pstmt.setInt(3, Integer.parseInt(multi.getParameter("adultprice")));
				pstmt.setInt(4, Integer.parseInt(multi.getParameter("childprice")));
				pstmt.setString(5, multi.getParameter("detail"));
				pstmt.setInt(6, Integer.parseInt(multi.getParameter("no")));
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//Product Delete
	public boolean deleteProduct(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from toProduct where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
}
