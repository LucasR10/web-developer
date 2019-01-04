package br.com.certificacao.webdeveloper.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="myServlet", urlPatterns = {"/my"})
public class MyServlet implements Servlet {

	private transient ServletConfig config;
	
	@Override
	public void destroy() {

	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "MyServlet";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
      this.config = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String servletName = this.config.getServletName();
		resp.setContentType("");
		PrintWriter writer = resp.getWriter();
		writer.println("<html> <head></head> <body> ola, "+servletName +" </body></html>");
         
	}

}
