<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ include file="dbconn.jsp" %>
<%
	//MultipartRequest 객체생성및 초기화(request,저장경로,파일사이즈,인코딩,파일저장방법)
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

	if (unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);

	long stock;

	if (unitsInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitsInStock);

	//이미지파일의 이름을 가져온다.
	String fileName = multi.getFilesystemName("productImage");	

	//DB에 상품편집 페이지에서 받은 내용을 업데이트한다.
		String sql = "select * from product where p_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, productId);
		rs = pstmt.executeQuery();

		if (rs.next()) {
			if (fileName != null) { //사진도 같이 업데이트 할 경우
				sql = "UPDATE product SET p_name=?, p_unitPrice=?, p_description=?, p_manufacturer=?, p_category=?, p_unitsInStock=?, p_condition=?, p_fileName=? WHERE p_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setString(4, manufacturer);
				pstmt.setString(5, category);
				pstmt.setLong(6, stock);
				pstmt.setString(7, condition);
				pstmt.setString(8, fileName);
				pstmt.setString(9, productId);
				pstmt.executeUpdate();
			} else { //사진이 없을 경우
				sql = "UPDATE product SET p_name=?, p_unitPrice=?, p_description=?, p_manufacturer=?, p_category=?, p_unitsInStock=?, p_condition=? WHERE p_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setString(4, manufacturer);
				pstmt.setString(5, category);
				pstmt.setLong(6, stock);
				pstmt.setString(7, condition);
				pstmt.setString(8, productId);
				pstmt.executeUpdate();
			}
		}
	if (rs != null)
		rs.close();
 	if (pstmt != null)
 		pstmt.close();
 	if (conn != null)
		conn.close();

	response.sendRedirect("editProduct.jsp?edit=update");
%>


