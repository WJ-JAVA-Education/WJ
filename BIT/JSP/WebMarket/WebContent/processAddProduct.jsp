<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ include file="dbconn.jsp" %>

<%
	request.setCharacterEncoding("UTF-8"); //한글처리
	
	// MultipartRequest 객체생성및 초기화(request,저장경로,파일사이즈,인코딩,파일저장방법)
	MultipartRequest multi = new MultipartRequest(request, "/upload/", 5 * 1024 * 1024, "utf-8",	new DefaultFileRenamePolicy());
	
	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	
	Integer price;
	
	if (unitPrice.isEmpty()) price = 0;
	else price = Integer.valueOf(unitPrice);
	
	long stock;
	
	if (unitsInStock.isEmpty()) stock = 0;
	else stock = Long.valueOf(unitsInStock);
	//파일의 이름을 가져온다.
	String filename = multi.getFilesystemName("productImage");
	
	//DB에 상품등록 페이지에서 받은 내용을 저장한다.
	
	String sql = "INSERT INTO product VALUES(?,?,?,?,?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, productId);
	pstmt.setString(2, name);
	pstmt.setInt(3, price);
	pstmt.setString(4, description);
	pstmt.setString(5, manufacturer);
	pstmt.setString(6, category);
	pstmt.setLong(7, stock);
	pstmt.setString(8, condition);
	pstmt.setString(9, filename);
	pstmt.executeUpdate(); 
	//닫기   
    if (pstmt != null)  pstmt.close();
    if (conn != null)   conn.close();
    
    //자바로 페이지를 이동
	response.sendRedirect("products.jsp");
%>
