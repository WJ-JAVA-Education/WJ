/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-05-15 01:21:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import shop.*;

public final class memberUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/shop/admin/top.jsp", Long.valueOf(1589505596064L));
    _jspx_dependants.put("/shop/admin/bottom.jsp", Long.valueOf(1589505596047L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("shop");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("EUC-KR");

      out.write('\r');
      out.write('\n');
      shop.MemberMgr mMgr = null;
      mMgr = (shop.MemberMgr) _jspx_page_context.getAttribute("mMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mMgr == null){
        mMgr = new shop.MemberMgr();
        _jspx_page_context.setAttribute("mMgr", mMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>회원수정</title>\r\n");
      out.write("<link href=\"../style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#996600\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

    String admin_id = (String)session.getAttribute("adminKey");

	if(admin_id == null) {
		response.sendRedirect("adminLogin.jsp");
	}

      out.write("\r\n");
      out.write("<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("  <tr bgcolor=\"#FFCC00\"> \r\n");
      out.write("    <th><a href=\"../index.jsp\">홈</a></th>\r\n");
      out.write("    <th><a href=\"adminLogout.jsp\">로그아웃</a></th>\r\n");
      out.write("    <th><a href=\"memberMgr.jsp\">회원관리</a></th>\r\n");
      out.write("    <th><a href=\"productMgr.jsp\">상품관리</a></th>\r\n");
      out.write("    <th><a href=\"orderMgr.jsp\">주문관리</a></th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table> ");
      out.write('\r');
      out.write('\n');
      out.write('	');

		String id = request.getParameter("id");
		MemberBean mBean = mMgr.getMember(id);
	
      out.write("\r\n");
      out.write("\t<form name=\"regForm\" method=\"post\" action=\"memberUpdateProc.jsp\">\r\n");
      out.write("\t\t<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFCC\">\r\n");
      out.write("\t\t\t\t\t<table width=\"95%\" align=\"center\" bgcolor=\"#FFFF99\" border=\"1\">\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\" bgcolor=\"#996600\">\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><font color=\"#FFFFFF\"><b> ");
      out.print(mBean.getName());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t회원님의 정보를 수정합니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(mBean.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>패스워드</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"pwd\" value=\"");
      out.print(mBean.getPwd());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>이름</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"name\" value=\"");
      out.print(mBean.getName());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>성별</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>남<input type=\"radio\" name=\"gender\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(mBean.getGender().equals("1") ? "checked" : "");
      out.write("> 여<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\" name=\"gender\" value=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(mBean.getGender().equals("2") ? "checked" : "");
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"email\" size=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(mBean.getEmail());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>생년월일</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"birthday\" value=\"");
      out.print(mBean.getBirthday());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>우편번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"zipcode\" value=\"");
      out.print(mBean.getZipcode());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"우편번호찾기\" onClick=\"zipCheck()\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>주소</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"address\" size=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(mBean.getAddress());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>직업</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"job\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"0\">선택하세요.</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"회사원\">회사원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"연구전문직\">연구전문직</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"교수학생\">교수학생</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"일반자영업\">일반자영업</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"공무원\">공무원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"의료인\">의료인</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"법조인\">법조인</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"종교,언론,에술인\">종교.언론/예술인</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"농,축,수산,광업인\">농/축/수산/광업인</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"주부\">주부</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"무직\">무직</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"기타\">기타</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\t<script>document.regForm.job.value=\"");
      out.print(mBean.getJob());
      out.write("\"</script>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>취미</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									String list[] = { "인터넷", "여행", "게임", "영화", "운동" };
									String hobbys[] = mBean.getHobby();
									for (int i = 0; i < list.length; i++) {
										out.println("<input type=checkbox name=hobby ");
										out.println("value=" + list[i] + " " + (hobbys[i].equals("1") ? "checked" : "") + ">" + list[i]);
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"수정완료\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"다시쓰기\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("  <tr bgcolor=\"#FFCC00\"> \r\n");
      out.write("  <th>\r\n");
      out.write("  \tSimple Shopping Mall 관리자 페이지 입니다.\r\n");
      out.write("  </th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table> ");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
