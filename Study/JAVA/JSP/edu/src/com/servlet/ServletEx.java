package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logincon")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
    public ServletEx() {
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String L_ID = request.getParameter("L_ID");
		String L_PW = request.getParameter("L_PW");
		
		out.print("L_ID :" + L_ID + "<BR>");
		out.print("L_PW :" + L_PW);
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
	
		
		for (Cookie c : cookies) {
		System.out.println( "+c.getName : "+c.getName() +" c.getValue: " + c.getValue());
		
		if (c.getName().equals("L_ID")) {
			cookie = c;
		}
		if (cookie == null) {
			System.out.println(" null");
			cookie = new Cookie("L_ID", L_ID);
		}
		response.addCookie(cookie);
		cookie.setMaxAge(60*60);
		
		response.sendRedirect("logincon.jsp");
		
	}
		
			
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
