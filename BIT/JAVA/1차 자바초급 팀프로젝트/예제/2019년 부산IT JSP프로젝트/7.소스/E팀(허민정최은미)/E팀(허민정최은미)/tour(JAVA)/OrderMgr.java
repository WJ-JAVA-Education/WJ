package tour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class OrderMgr {
	
	private DBConnectionMgr pool;
	
	public OrderMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//Order Insert
	public void insertOrder(OrderBean order) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "insert toOrder(id,productNo,quantity1,quantity2,quantitytotal,date,tourdate,tourtime,senddate,name,state) values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, order.getId());
			pstmt.setInt(2, order.getProductNo());
			pstmt.setInt(3,order.getQuantity1());
			pstmt.setInt(4,order.getQuantity2());
			pstmt.setInt(5,order.getQuantityTotal());
			//접수중,접수,입금확인,배송준비,배송중,완료
			pstmt.setString(6, UtilMgr.getDay());
			pstmt.setString(7, order.getTourdate());
			pstmt.setString(8, order.getTourtime());
			pstmt.setString(9, order.getSenddate());
			pstmt.setString(10, order.getName());
			pstmt.setString(11, "1");//주문상태
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//Order List
	public Vector<OrderBean> getOrder(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<OrderBean> vlist = new Vector<>();
		try {
			con = pool.getConnection();
			sql = "select * from toOrder where id=? order by no desc";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderBean order = new OrderBean();
				order.setNo(rs.getInt("no"));//주문번호
				order.setId(rs.getString("id"));//누가
				order.setProductNo(rs.getInt("productNo"));//어떤상품
				order.setQuantity1(rs.getInt("quantity1"));//어른몇개
				order.setQuantity2(rs.getInt("quantity2"));//어린이몇개
				order.setQuantityTotal(rs.getInt("quantityTotal"));//총 몇개
				order.setDate(rs.getString("date"));//상품주문일
				order.setTourdate(rs.getString("tourdate"));//원하는 여행일
				order.setTourtime(rs.getString("tourtime"));//원하는 여행시간
				order.setSenddate(rs.getString("senddate"));//환율기준일
				order.setState(rs.getString("state"));//주문상태
				vlist.addElement(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	/////Admin Mode//////
	
	//Order All List
		public Vector<OrderBean> getOrderList(){
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			Vector<OrderBean> vlist = new Vector<>();
			try {
				con = pool.getConnection();
				sql = "select * from toOrder order by no desc";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					OrderBean order = new OrderBean();
					order.setNo(rs.getInt("no"));
					order.setId(rs.getString("id"));
					order.setProductNo(rs.getInt("productNo"));
					order.setQuantity1(rs.getInt("quantity1"));
					order.setQuantity2(rs.getInt("quantity2"));
					order.setQuantityTotal(rs.getInt("quantityTotal"));
					order.setDate(rs.getString("date"));
					order.setTourdate(rs.getString("tourDate"));
					order.setSenddate(rs.getString("sendDate"));
					order.setState(rs.getString("state"));
					vlist.addElement(order);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return vlist;
		}
		
		//Order Detail
			public OrderBean getOrderDetail(int no){
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				String sql = null;
				OrderBean order = new OrderBean();
				try {
					con = pool.getConnection();
					sql = "select * from toOrder where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, no);
					rs = pstmt.executeQuery();
					if(rs.next()){
						order.setNo(rs.getInt("no"));
						order.setId(rs.getString("id"));
						order.setName(rs.getString("name"));
						order.setQuantity1(rs.getInt("quantity1"));
						order.setQuantity2(rs.getInt("quantity2"));
						order.setQuantityTotal(rs.getInt("quantitytotal"));
						order.setDate(rs.getString("date"));
						order.setTourdate(rs.getString("tourdate"));
						order.setState(rs.getString("state"));
						order.setProductNo(rs.getInt("productNo"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					pool.freeConnection(con, pstmt, rs);
				}
				return order;
			}
			
			//Order Update
			public boolean updateOrder(int no, String state){
				Connection con = null;
				PreparedStatement pstmt = null;
				String sql = null;
				boolean flag = false;
				try {
					con = pool.getConnection();
					sql = "update toOrder set state=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, state);
					pstmt.setInt(2, no);
					if(pstmt.executeUpdate()==1) flag = true;
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					pool.freeConnection(con, pstmt);
				}
				return flag;
			}
			
			//Order Delete
			public boolean deleteOrder(int no){
				Connection con = null;
				PreparedStatement pstmt = null;
				String sql = null;
				boolean flag = false;
				try {
					con = pool.getConnection();
					sql = "delete from toOrder where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, no);
					if(pstmt.executeUpdate()==1) flag = true;
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					pool.freeConnection(con, pstmt);
				}
				return flag;
			}
			
			//Order State List
			public Vector<OrderBean> getOrderStateList(String state){
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				String sql = null;
				Vector<OrderBean> vlist = new Vector<>();
				try {
					con = pool.getConnection();
					sql = "select * from toOrder where state = ? order by no desc";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1,state);
					rs = pstmt.executeQuery();
					while(rs.next()) {
						OrderBean order = new OrderBean();
						order.setNo(rs.getInt("no"));
						order.setId(rs.getString("id"));
						order.setProductNo(rs.getInt("productNo"));
						order.setQuantity1(rs.getInt("quantity1"));
						order.setQuantity2(rs.getInt("quantity2"));
						order.setQuantityTotal(rs.getInt("quantityTotal"));
						order.setDate(rs.getString("date"));
						order.setTourdate(rs.getString("tourDate"));
						order.setSenddate(rs.getString("sendDate"));
						order.setState(rs.getString("state"));
						vlist.addElement(order);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					pool.freeConnection(con, pstmt, rs);
				}
				return vlist;
			}
			
}
