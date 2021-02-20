<%@page import="dto.Product"%>
<%@ page import="java.util.ArrayList"%>
<%@ include file="dbconn.jsp" %>

<%
	String id = request.getParameter("id");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}

	//아이디로 그 제품정보를 가져온다.
	String sql = "select * from product where p_id=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	
	if (!rs.next()) { // 제품이 없으므로 에러페이지로 보낸다.
		response.sendRedirect("exceptionNoProductId.jsp");
	}
	//장바구니 불러오기
	ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
	
	Product item; //새 제품 item을 선언
	for (int i = 0; i < cartList.size(); i++) { 
		item = cartList.get(i); //장바구니의 제품을 하나씩 꺼내기
		if (item.getProductId().equals(id)) {
			cartList.remove(item); //세션에 저장된 장바구니에서 item을 제거
		}
	}

	response.sendRedirect("cart.jsp");
%>
