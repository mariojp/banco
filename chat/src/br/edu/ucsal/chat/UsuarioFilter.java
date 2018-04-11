package br.edu.ucsal.chat;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class UsuarioFilter
 */
@WebFilter("/*")
public class UsuarioFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UsuarioFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println(LocalDateTime.now());

		System.out.println(request.getRemoteHost());
		if(request.getRemoteHost().equals("10.8.173.4")) {
			((HttpServletResponse) response).sendRedirect("http://www.google.com");
		}else {
			chain.doFilter(request, response);
		}
		
		System.out.println(LocalDateTime.now());
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
