<%@ page contentType="text/html;charset=EUC-KR"%>
<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<%@page import="java.util.Vector"%>
<jsp:useBean id="pMgr" class="tour.ProductMgr" />
<%
	Vector<ProductBean> pvlist = pMgr.getProductList();
%>
<html>
<head>
<title>Tour Mall</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#996600" topmargin="100">

	<table width="75%" align="center" bgcolor="#FFFF99">
		<tr>
			<td align="center" bgcolor="#FFFFCC">

				<table width="95%" align="center" bgcolor="#FFFF99" border="1">
					<form name="regForm" method="post" action="costInsert.jsp">
						<tr align="center" bgcolor="#996600">
							<td colspan="3"><font color="#FFFFFF"><b>간편 견적
										요청하기</b></font></td>
						</tr>
						<tr>
							<td>이름</td>
							<td><input name="name" size="15"></td>
						</tr>
						<tr>
							<td>이메일</td>
							<td><input name="email" size="27"></td>
						</tr>
						<tr>
							<td>핸드폰</td>
							<td><input name="hp" size="27"></td>
						</tr>

						<tr>
							<td>어른</td>
							<td><select name="adultNum">
									<option value="0" selected>선택하세요.</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
							</select></td>
						</tr>
						<tr>
							<td>어린이</td>
							<td><select name="childNum" onChange="getSelectValue();">
									<option value="0" selected>선택하세요.</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
							</select></td>
						</tr>
						<tr>
							<td>아동생년월일</td>
							<td><input type=text name="childbirth" size="6"></td>
						</tr>
						<% 
							for(int i =0; i<pvlist.size(); i++){
							ProductBean pbean = pvlist.get(i);
						%>
						<tr align="center">
							<td><input type="checkbox" name="saleitem" value="10000">
							<%=pbean.getProName()%>(<%=pbean.getCoName()%>)</td>
						</tr>
						<%}//--for %>
						
						<td>마사지</td>
						<td><input type="checkbox" name="saleitem2" value="드라이"
							checked>드라이 <input type="checkbox" name="saleitem2"
							value="오일">오일 <input type="checkbox" name="saleitem2"
							value="로션">로션 <input type="checkbox" name="saleitem2"
							value="스톤">스톤 <input type="checkbox" name="saleitem2"
							value="어린이">어린이(성장)</td>
						</tr>
						<tr>
							<td>투어</td>
							<td><input type="checkbox" name="saleitem3" value="시티투어"
								checked>시티투어 <input type="checkbox" name="saleitem3"
								value="캐녀닝">캐녀닝 <input type="checkbox" name="saleitem3"
								value="나이트투어">나이트투어</td>
						</tr>
						<tr>
							<td>기타</td>
							<td><input type="checkbox" name="saleitem4" value="픽업"
								checked>픽업 <input type="checkbox" name="saleitem4"
								value="드랍">드랍</td>
						</tr>

						<tr>
							<td>투어요청일</td>
							<td><input type="date" name="tourDay"></td>
						</tr>
						<tr>
							<td>투어요청시간</td>
							<td><input type="time" name="tourTime"></td>
						</tr>
						<tr>
							<td>기타요청사항</td>
							<td><textarea cols="20" rows="5" name="comment"></textarea></td>
						</tr>

						<tr>
							<td colspan="3" align="center"><input type="button"
								value="견적요청하기" onclick="inputCheck()"> &nbsp; &nbsp;
								&nbsp; &nbsp; &nbsp; &nbsp; <input type="reset" value="다시쓰기">
							</td>
						</tr>
					</form>
				</table>
			</td>
		</tr>
	</table>

</body>
</html>

