package ch12.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class testFilter implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
	    throws IOException, ServletException {
	filterchain.doFilter(request, response);
	// JSP페이지로 가기전에 여기에 먼저 들린다. (request)
	
	// JSP에서 처리 후 나갈때 여기에 들린다. (response)
    }

    @Override
    public void destroy() {
	// 필터 종료
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
	// 필터 시작
	Filter.super.init(filterConfig);
    }

}
