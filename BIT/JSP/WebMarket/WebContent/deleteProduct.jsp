<%@ include file="dbconn.jsp"%>
<%	
	//id를 가져온다. 
	String productId = request.getParameter("id");	
	
	//실제 그 아이디의 제품이 있는지 검사한다.
	String sql = "select * from product";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery(); //rs 결과

	if (rs.next()) { //결과가 있으면
		sql = "delete from product where p_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, productId);
		pstmt.executeUpdate(); //DB에서 제품을 삭제한다.
	} else //없으면
		out.println("일치하는 상품이 없습니다");
	//연결닫기
	if (rs != null)
		rs.close();
 	if (pstmt != null)
 		pstmt.close();
 	if (conn != null)
		conn.close();
	//다시 페이지를 삭제 페이지로 이동한다.
 	response.sendRedirect("editProduct.jsp?edit=delete");
%>
