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
		//��������Ʈ ����
		pMgr.deletePBlog(num);
		//��������Ʈ�� ���õ� ��� ��� ����
		rMgr.deleteAllPReply(num);
		response.sendRedirect("home.jsp");
	}
}





