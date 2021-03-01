<%@ page contentType="text/html;charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mMgr" class="tour.MemberMgr" />
<jsp:useBean id="mBean" class="tour.MemberBean" />
<jsp:setProperty name="mBean" property="*" />
<%
		boolean flag = mMgr.deleteMember(mBean);
		if (flag) {
		%>
		<script>
			alert("성공적으로 탈퇴되었습니다.");
			location.href = "guestLogin.jsp";
		</script>
		<%
			} else {
		%>
		<script>
			alert("탈퇴 중 에러가 발생하였습니다.");
			history.back();
		</script>
		<%
			}
%>
