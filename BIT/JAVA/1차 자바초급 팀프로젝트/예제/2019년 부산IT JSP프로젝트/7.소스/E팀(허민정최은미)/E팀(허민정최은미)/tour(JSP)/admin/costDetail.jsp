<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*, tour.*"%>
<jsp:useBean id="cMgr" class="tour.CostMgr" />
<%
		request.setCharacterEncoding("EUC-KR");
		int no = Integer.parseInt(request.getParameter("no"));
		CostBean cost = cMgr.getCost(no);
		int totalNum = cost.getAdultNum() + cost.getChildNum();
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
<title>tour cost pro</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
<script>
function costUpdate(form){
	form.flag.value="update"
	form.submit();
}

function costDelete(form) {
	form.flag.value="delete";
	form.submit();
}
</script>
</head>

<body bgcolor="#996600" topmargin="100">
<%@ include file="top.jsp"%>
	<!-- Page Content -->
  <div class="container">

    <div class="row">
    <%@ include file="left.jsp" %>
     <div class="col-lg-9">
     <br><br><br>
<table width="75%" align="center" >
	<tr>
		<td align="center" >
		<form method="post" name="cost" action="costProc.jsp">
		<table width="95%" align="center"  class="table">
			<tr bgcolor="black">
				<td colspan="2" align="center">
					<font color="#FFFFFF"><b>주문상세내역</b></font>
				</td>
			</tr>
			<tr align="center">
				<td>고객이름</td>
				<td><%=cost.getName()%></td>
			</tr>
			<tr align="center">
				<td>주문번호</td>
				<td><%=cost.getNum()%></td>
			</tr>
			<tr align="center">
				<td>상품1</td>
				<td><%=cost.getSaleitem11()%></td>
			</tr>
			<tr align="center">
				<td>상품2</td>
				<td><%=cost.getSaleitem22()%></td>
			</tr>
			<tr align="center">
				<td>상품3</td>
				<td><%=cost.getSaleitem33()%></td>
			</tr>
			<tr align="center">
				<td>상품4</td>
				<td><%=cost.getSaleitem44()%></td>
			</tr>
			<tr align="center">
				<td>어른인원</td>
				<td><%=cost.getAdultNum()+ ""%>명</td>
			</tr>
			<tr align="center">
				<td>어린이인원</td>
				<td><%=cost.getChildNum()+ ""%>명</td>
			</tr>
			<tr align="center">
				<td>총인원</td>
				<td><%= totalNum + ""%>명</td>
			</tr>
			<tr align="center">
				<td>아동생년월일</td>
				<td><%=cost.getChildbirth()%></td>
			</tr>
			<tr align="center">
				<td>주문날짜</td>
				<td><%=cost.getRegdate()%></td>
			</tr>
			<tr align="center">
				<td>투어날짜</td>
				<td><%=cost.getTourDay()%></td>
			</tr>
			<tr align="center">
				<td>이메일</td>
				<td><%=cost.getEmail()%></td>
			</tr>
					
			<tr align="center">
				<td>견적금액</td>
				<td><input name="fcost" value="<%=cost.getFcost()%>"  size = "5">원</td>
			</tr>
			<tr align="center">
			<td  colspan = "2"><font color="#FFFFFF"> 
			<a href="sendCostAccount.jsp?num=<%=cost.getNum()%>">메일보내기</a>
			</tr>
			<tr align="center">
				<td>주문상태</td>
				<td><select name="state">
					<option value="1">견적접수</option>
					<option value="2">견적발송</option>
					<option value="3">입금확인</option>
					<option value="4">투어진행</option>
					<option value="6">완료</option>
				</select> <script>
			document.cost.state.value=<%=cost.getState()%>
		</script></td>
			</tr>
			
			<tr align="center">
				<td colspan="2">
					<input type="button" value="수정"
					size="3" onclick="javascript:costUpdate(this.form)"> / <input
					type="button" value="삭제" size="3"
					onclick="javascript:costDelete(this.form)">
				</td>
			</tr>
		</table>
		<input type="hidden" name="no" value="<%=cost.getNum()%>"> 
		<input type="hidden" name="flag">
		</form>
		</td>
	</tr>
</table>
</div>
      <!-- /.col-lg-9 -->



    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->
 <%@ include file="bottom.jsp" %>
 <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
