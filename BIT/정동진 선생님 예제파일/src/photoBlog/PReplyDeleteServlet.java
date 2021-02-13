package photoBlog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/photoBlog/pReplyDelete")
public class PReplyDeleteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		PReplyMgr rMgr = new PReplyMgr();
		//삭제할 댓글의 rnum값
		int rnum = Integer.parseInt(request.getParameter("rnum"));
		rMgr.deletePReply(rnum);
		String gid = request.getParameter("gid");
		if(gid==null)
			response.sendRedirect("home.jsp");
		else
			response.sendRedirect("guest.jsp?gid="+gid);
	}

}






