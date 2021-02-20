package photoBlog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/photoBlog/pBlogDelete")
public class PBlogDeleteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		PBlogMgr pMgr = new PBlogMgr();
		PReplyMgr rMgr = new PReplyMgr();
		int num = Integer.parseInt(request.getParameter("num"));
		//포토포스트 삭제
		pMgr.deletePBlog(num);
		//포토포스트에 관련된 댓글 모두 삭제
		rMgr.deleteAllPReply(num);
		response.sendRedirect("home.jsp");
	}
}





