package photoBlog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/photoBlog/pReplyPost")
public class PReplyPostServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		PReplyMgr rMgr = new PReplyMgr();
		//서블릿을 사용하면 jsp에 setProperty를 사용을 못함.
		PReplyBean rbean = new PReplyBean();
		rbean.setNum(Integer.parseInt(request.getParameter("num")));
		rbean.setId(request.getParameter("id"));
		rbean.setComment(request.getParameter("comment"));
		rMgr.insertPReply(rbean);
		String gid = request.getParameter("gid");
		//gid가 null이면 home.jsp에서 호출이고 아니면 guest.jsp에서 호출
		if(gid==null)
			response.sendRedirect("home.jsp");
		else
			response.sendRedirect("guest.jsp?gid="+gid);
			
	}

}






