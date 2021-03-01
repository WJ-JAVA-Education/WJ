package tour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class CostMgr {
	
	private DBConnectionMgr pool;
	
	public CostMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean insertCost(CostBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert toCost(name,childbirth,saleitem1,saleitem2,saleitem3,saleitem4,email,hp,adultNum,childNum,tourDay,tourTime,regdate,comment,state)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,now(),?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2,bean.getChildbirth());
			
			String saleitem1[] = bean.getSaleitem1();
			String textitem1 = "";
			for (int i = 0; i < saleitem1.length; i++) {
            	textitem1 += saleitem1[i] + " ";
            }
            pstmt.setString(3, new String(textitem1));
            
			/*char item1[] = {'0','0','0'};
			String lists1[] = {"호핑", "스쿠버다이빙", "파라세일링"}; 
			if(saleitem1!=null) { //
			for (int i = 0; i < saleitem1.length; i++) {
				for (int j = 0; j < lists1.length; j++) {
					if(saleitem1[i].equals(lists1[j])) {
						item1[j] = '1';
						break;
					}//---if
				}//---for2
			}//---for1
			//new String(char value[])
			}
			pstmt.setString(3, new String(item1));*/
			
			String saleitem2[] = bean.getSaleitem2();
			String textitem2 = "";
			for (int i = 0; i < saleitem2.length; i++) {
            	textitem2 += saleitem2[i] + " ";
            }
			pstmt.setString(4, new String(textitem2));
			
			String saleitem3[] = bean.getSaleitem3();
			String textitem3 = "";
			for (int i = 0; i < saleitem3.length; i++) {
            	textitem3 += saleitem3[i] + " ";
            }
			pstmt.setString(5, new String(textitem3));
			
			String saleitem4[] = bean.getSaleitem4();
			String textitem4 = "";
			for (int i = 0; i < saleitem4.length; i++) {
            	textitem4 += saleitem4[i] + " ";
            }
			pstmt.setString(6, new String(textitem4));
			
			pstmt.setString(7, bean.getEmail());
			pstmt.setString(8, bean.getHp());
			pstmt.setInt(9, bean.getAdultNum());
			pstmt.setInt(10, bean.getChildNum());
			pstmt.setString(11, bean.getTourDay());
			pstmt.setString(12, bean.getTourTime());
			pstmt.setString(13, bean.getComment());
			pstmt.setString(14, "1");//주문상태
			
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//Cost Detail
	public CostBean getCost(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		CostBean bean = new CostBean();
		try {
			con = pool.getConnection();
			sql = "select * from toCost where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setChildbirth(rs.getString("childbirth"));
				bean.setSaleitem11(rs.getString("saleitem1"));
				bean.setSaleitem22(rs.getString("saleitem2"));
				bean.setSaleitem33(rs.getString("saleitem3"));
				bean.setSaleitem44(rs.getString("saleitem4"));
				bean.setEmail(rs.getString("email"));
				bean.setHp(rs.getString("hp"));
				bean.setAdultNum(rs.getInt("adultNum"));
				bean.setChildNum(rs.getInt("childNum"));
				bean.setTourDay(rs.getString("tourDay"));
				bean.setTourTime(rs.getString("tourTime"));
				bean.setRegdate(rs.getString("regdate"));
				bean.setComment(rs.getString("comment"));
				bean.setFcost(rs.getString("fcost"));
				bean.setState(rs.getString("state"));//주문상태
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	//Cost List
	public Vector<CostBean> getCostList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<CostBean> vlist = new Vector<>();
		try {
			con = pool.getConnection();
			sql = "select * from toCost";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CostBean bean = new CostBean();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setChildbirth(rs.getString("childbirth"));
				bean.setSaleitem11(rs.getString("saleitem1"));
				bean.setSaleitem22(rs.getString("saleitem2"));
				bean.setSaleitem33(rs.getString("saleitem3"));
				bean.setSaleitem44(rs.getString("saleitem4"));
				bean.setEmail(rs.getString("email"));
				bean.setHp(rs.getString("hp"));
				bean.setAdultNum(rs.getInt("adultNum"));
				bean.setChildNum(rs.getInt("childNum"));
				bean.setTourDay(rs.getString("tourDay"));
				bean.setTourTime(rs.getString("tourTime"));
				bean.setComment(rs.getString("comment"));
				bean.setState(rs.getString("state"));
				vlist.addElement(bean);
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	//Cost Update
	public boolean updateCost(int no, String state, String fcost){
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update toCost set state=?, fcost =? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, state);
			pstmt.setString(2, fcost);
			pstmt.setInt(3, no);
			if(pstmt.executeUpdate()==1) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//Cost Delete
	public boolean deleteCost(int no){
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from toCost where num=?";
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
	
	//CostState List
		public Vector<CostBean> getCostStateList(String state) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			Vector<CostBean> vlist = new Vector<>();
			try {
				con = pool.getConnection();
				sql = "select * from toCost where state = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,state);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					CostBean bean = new CostBean();
					bean.setNum(rs.getInt("num"));
					bean.setName(rs.getString("name"));
					bean.setChildbirth(rs.getString("childbirth"));
					bean.setSaleitem11(rs.getString("saleitem1"));
					bean.setSaleitem22(rs.getString("saleitem2"));
					bean.setSaleitem33(rs.getString("saleitem3"));
					bean.setSaleitem44(rs.getString("saleitem4"));
					bean.setEmail(rs.getString("email"));
					bean.setHp(rs.getString("hp"));
					bean.setAdultNum(rs.getInt("adultNum"));
					bean.setChildNum(rs.getInt("childNum"));
					bean.setTourDay(rs.getString("tourDay"));
					bean.setTourTime(rs.getString("tourTime"));
					bean.setComment(rs.getString("comment"));
					bean.setState(rs.getString("state"));
					vlist.addElement(bean);
					}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return vlist;
		}
		
		//Send id,pwd
		public void sendAccount(int num) {
			CostBean bean = getCost(num);
			String name = bean.getName();
			String item1= bean.getSaleitem11();
			String item2= bean.getSaleitem22();
			String item3= bean.getSaleitem33();
			String item4= bean.getSaleitem44();
			String date = bean.getTourDay();
			String cost = bean.getFcost();
			String title ="여행 견적사이트에서" + name +" 님께 여행 견적 보내드립니다.";
			String content = "안녕하세요 "+ name + "님~~\n\r"+ " 요청하신 상품은" + item1 +item2 +item3 +item4 +
			"입니다.\n\r" + "투어 날짜는" + date  +"입니다. 날짜 확인 부탁드립니다." +
			"총 가격은" + cost + "입니다." ;
			String toEmail = bean.getEmail();
			Gmail_Mail.send(title, content, toEmail);
		}
	
}
