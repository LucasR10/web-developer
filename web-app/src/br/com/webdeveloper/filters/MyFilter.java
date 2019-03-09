package br.com.webdeveloper.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

//@WebFilter(asyncSupported=true, urlPatterns="/myServlet")
@WebFilter(urlPatterns="/aaa", initParams={@WebInitParam(name="nome", value="mys servlet")})
public class MyFilter implements Filter{

	private FilterConfig config;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//Referência para o objeto FilterConfig.
	  this.config = filterConfig;
	}
	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Faz a logica aqui.
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO remover alguma coisa.
	}

}
