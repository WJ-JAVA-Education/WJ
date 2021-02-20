/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-05-15 01:20:09 UTC
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

public final class memberMgr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      shop.MemberMgr mMgr = null;
      mMgr = (shop.MemberMgr) _jspx_page_context.getAttribute("mMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mMgr == null){
        mMgr = new shop.MemberMgr();
        _jspx_page_context.setAttribute("mMgr", mMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Simple Shopping Mall Admin</title>\r\n");
      out.write("<link href=\"../style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#996600\" topmargin=\"100\">\r\n");
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
      out.write(" \r\n");
      out.write("\t");
Vector<MemberBean> vlist = mMgr.getMemberList();
      out.write("\r\n");
      out.write("\t<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("\t<tr> \r\n");
      out.write("\t<td align=\"center\" bgcolor=\"#FFFFCC\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"95%\" align=\"center\" bgcolor=\"#FFFF99\" border=\"1\">\r\n");
      out.write("\t\t<tr align=\"center\" bgcolor=\"#996600\"> \r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">회원이름</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">회원아이디</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">패스워드</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">성별</font></td> \r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">생년월일</font></td> \r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">이메일</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">수정</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">메일보내기</font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		for(int i=0; i<vlist.size(); i++){
			MemberBean mBean = vlist.get(i);
		
      out.write("\r\n");
      out.write("\t\t<tr align=\"center\"> \r\n");
      out.write("\t\t\t<td>");
      out.print(mBean.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(mBean.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(mBean.getPwd());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print(mBean.getGender().equals("1")?"남자":"여자");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(mBean.getBirthday());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(mBean.getEmail());
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"javascript:update('");
      out.print(mBean.getId());
      out.write("')\">수정하기</a></td>\r\n");
      out.write("\t\t\t<td><font color=\"#FFFFFF\">\r\n");
      out.write("\t\t\t<a href=\"sendAccount.jsp?id=");
      out.print(mBean.getId());
      out.write("\">메일보내기</a>\r\n");
      out.write("\t\t\t</font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
      out.write("\t<form name=\"update\" method=\"post\" action=\"memberUpdate.jsp\">\r\n");
      out.write("\t<input type=hidden name=\"id\">\r\n");
      out.write("\t</form>\r\n");
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
