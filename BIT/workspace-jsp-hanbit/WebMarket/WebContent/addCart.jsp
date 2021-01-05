<%@page import="java.util.ArrayList"%>
<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
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
	
	ProductRepository dao = ProductRepository.getInstance();	
	Product goods = dao.getProductById(id);
	
	if (goods == null) { //id로 제품을 못 찾았을 경우 
		response.sendRedirect("exceptionNoProductId.jsp");
	}
	
	//장바구니 세션 불러오기
	ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
	if (list == null) {  //list가 없다면 최초로 고른 상품이므로 새 장바구니(list) 생성
		list = new ArrayList<Product>();
		session.setAttribute("cartlist", list);
	}

	boolean isNotInList = true; //리스트에 없는 제품인가?
	for (Product product : list) {  //반복문 리스트에 제품을 하나씩 비교한다.

		if (product.getProductId().equals(id)) {
			product.setQuantity(product.getQuantity() + 1); //같은 제품일때 수량+1
			isNotInList = false; //똑같은 제품이 리스트에 있으니 false
		}
	}

	if (isNotInList) { //같은 제품이 없다. 
		goods.setQuantity(1); //갯수를 1로 
		list.add(goods);	//리스트에 추가
	}
	
	//다시 이전 페이지로 돌아감
	response.sendRedirect("product.jsp?id=" + id);
%>