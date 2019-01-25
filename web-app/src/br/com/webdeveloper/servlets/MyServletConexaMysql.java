package br.com.webdeveloper.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="mysql", urlPatterns = { "/mysql" },
initParams={@WebInitParam(name = MyServletConexaMysql.PASS, value="12345678"),@WebInitParam(name=MyServletConexaMysql.USER,value="root") } )
public class MyServletConexaMysql extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String USER = "user";
	public static final String PASS = "pas";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.getWriter().append("URL : ").append( req.getAttribute( MyServletContexListner.URL).toString() );
		if( req.getParameter("cmd").equals("add") ){
		   req.getSession().setAttribute(USER, "eu vou passar na prova - certificao");
		}else {
			req.removeAttribute(USER);
		}
		
		resp.getWriter().append("objota : ").append( req.getSession().getAttribute(USER) + "" );
	}
}
