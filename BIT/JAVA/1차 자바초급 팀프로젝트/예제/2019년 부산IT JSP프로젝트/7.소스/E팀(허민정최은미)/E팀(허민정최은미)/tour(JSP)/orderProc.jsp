<%@page import="java.util.Enumeration"%>
<%@page import="tour.OrderBean"%>
<%@page import="java.util.Hashtable"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="cMgr" scope="session" class="tour.CartMgr"/>
<jsp:useBean id="pMgr" class="tour.ProductMgr"/>
<jsp:useBean id="orderMgr" class="tour.OrderMgr"/>
<%
		String msg ="";
		Hashtable<Integer, OrderBean> hCart = cMgr.getCartList();
		Enumeration<Integer> hCartKey = hCart.keys();
		if(!hCart.isEmpty()) {
			while(hCartKey.hasMoreElements()){
				//장바구니에 있었던 주문 객체
				OrderBean order = hCart.get(hCartKey.nextElement());
				//주문처리
				orderMgr.insertOrder(order);
				//장바구니 삭제
				cMgr.deleteCart(order);
			}
			msg = "주문처리 하였습니다.";
		}else {
			msg = "장바구니가 비었습니다.";
		}
%>
<script>
	alert("<%=msg%>");
	location.href = "orderList.jsp";
</script>
