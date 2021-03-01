<%@page contentType="text/html; charset=EUC-KR"%>
<%@page import="tour.BoardBean"%>
<%@page import="tour.BoardMgr"%>
<html>
<head>
<%
		request.setCharacterEncoding("EUC-KR");
		int num = Integer.parseInt(request.getParameter("num"));
		String nowPage = request.getParameter("nowPage");
		if(request.getParameter("pass")!=null){
			BoardBean bean = (BoardBean)session.getAttribute("bean");
			//삭제를 요청한 케이스
			String inPass= request.getParameter("pass");
			String dbPass = bean.getPass();
			//자바 기본형 type(8가지)의 비교는 == 이고
			//참조형(클래스타입) ==는 객체의 주소값 비교, String의 값의 비교는 반드시 equals 해야한다.
			if(inPass.equals(dbPass)){
				/* BoardMgr mgr = new BoardMgr();
				mgr.deleteBoard(num); */
				new BoardMgr().deleteBoard(num);
				String url="list.jsp?nowPage"+nowPage;
				response.sendRedirect(url);
			}else{
			%>
			<script type="text/javascript">
				alert("입력하신 비밀번호가 아닙니다.");
				history.back();
			</script>
			<% 	
			}
		}else{
%>
<title>JSP Board</title>

<script type="text/javascript">
	function check() {
		if (document.delFrm.pass.value == "") {
			alert("패스워드를 입력하세요.");
			document.delFrm.pass.focus();
			return false;
		}
		document.delFrm.submit();
	}
</script>
</head>
<body bgcolor="#FFFFCC">
	<%@ include file="top.jsp"%>
	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">
<div align="center"><br/><br/><br/>
	<table width="50%" cellspacing="0" cellpadding="3">
		<tr>
			<td bgcolor="black" height="21" align="center">
				<font color="#FFFFFF"><b>사용자의 비밀번호를 입력해주세요.</b>
			</td>
		</tr>
	</table>
	<form name="delFrm" method="post">
		<table width="70%" cellspacing="0" cellpadding="2">
			<tr>
				<td align="center">
					<table width=80%>
						<tr>
							<td align="center">
								<input type="password" name="pass" size="17" maxlength="15">
							</td>
						</tr>
						<tr>
							<td><hr size="1" color="#eeeeee"/></td>
						</tr>
						<tr>
							<td align="center">
								<input type="button" value="삭제완료" onClick="check()"> 
								<input type="reset" value="다시쓰기">
								<input type="button" value="뒤로" onClick="history.go(-1)">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
			<input type="hidden" name="nowPage" value="<%=nowPage%>"> 
			<input type="hidden" name="num" value="<%=num%>">
		</form>
	</div>
<%} %>
	</div>
			<!-- /.col-lg-9 -->



		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->
	<%@ include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
