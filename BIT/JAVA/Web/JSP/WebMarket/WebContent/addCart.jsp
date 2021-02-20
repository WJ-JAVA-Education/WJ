<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="dbconn.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	//id 를 가져온다.
	String id = request.getParameter("id");
	//id가 널값이거나 없을경우 바로 products 페이지로 보낸다.
	if(id==null || id.trim().equals("")){
		response.sendRedirect("products.jsp");
		return;
	}
	
	//아이디로 그 제품정보를 가져온다.
	String sql = "select * from product where p_id=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	
	if (!rs.next()) { //id로 제품을 못 찾았을 경우 
		response.sendRedirect("exceptionNoProductId.jsp");
	}
	
	//장바구니 세션 불러오기
	ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
	if (list == null) {  //list가 없다면 최초로 고른 상품이므로 새 장바구니(list) 생성
		list = new ArrayList<Product>();
		session.setAttribute("cartlist", list);
	}

	boolean isNotInList = true; //리스트에 없는 제품인가?
	for (Product p : list) {  //반복문 리스트에 제품을 하나씩 비교한다.

		if (p.getProductId().equals(id)) {
			p.setQuantity(p.getQuantity() + 1); //같은 제품일때 수량+1
			isNotInList = false; //똑같은 제품이 리스트에 있으니 false
		}
	}

	if (isNotInList) { //같은 제품이 없다. 
		Product newProduct = new Product(); //빈 제품 객체
		
		newProduct.setProductId(rs.getString(1));
		newProduct.setPname(rs.getString(2));
		newProduct.setUnitPrice(rs.getInt(3));
		newProduct.setDescription(rs.getString(4));
		newProduct.setCategory(rs.getString(5));
		newProduct.setManufacturer(rs.getString(6));
		newProduct.setUnitsInStock(rs.getLong(7));
		newProduct.setCondition(rs.getString(8));
		newProduct.setFilename(rs.getString(9));		
		newProduct.setQuantity(1); //갯수를 1로 
		
		list.add(newProduct);	//장바구니에 추가
	}
	//DB연결을 닫는다.
	if (rs != null) 	rs.close();   
    if (pstmt != null)  pstmt.close();
    if (conn != null)   conn.close();
	
	//다시 이전 페이지로 돌아감
	response.sendRedirect("product.jsp?id=" + id);
%>