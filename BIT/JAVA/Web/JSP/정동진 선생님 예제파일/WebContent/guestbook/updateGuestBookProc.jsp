<!-- updateGuestBookProc.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mgr" class="guestbook.GuestBookMgr"/>
<jsp:useBean id="bean" class="guestbook.GuestBookBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		//secret 체크를 하면  secret=1 값이 넘어와서 빈즈 저장
		//그러니 체크하지 않으면 secret 값 자체가 넘어오지 않음.
		if(bean.getSecret()==null){
			bean.setSecret("0");
		}
		mgr.updateGuestBook(bean);
		//창은 close showGuestBook.jsp 새로고침
%>
<script>
	opener.location.reload();
	self.close();
</script>








