package br.com.webdeveloper.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;




@WebServlet(description = "Servlet Para gerenciar sessao", urlPatterns = { "/sessao" })
public class GerenciamentoSessao extends HttpServlet implements HttpSessionBindingListener {
	private static final long serialVersionUID = 1L;
	ArrayList<String> list = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie ck = new Cookie("mycooke", "Meu cookie");
		response.addCookie(ck);
		System.err.println(" cookie criado ");
		
		Cookie ckk[] = request.getCookies();
		for (int i = 0; i < ckk.length; i++) {
			Cookie c = ckk[i];
			response.getWriter().append("Cookie value : ").append( c.getValue() );
			response.setContentType("text/html");
			response.getWriter().write("<a href='sessao?cm=rm' >remover </a> <br>");
			response.getWriter().write("<a href='sessao?cm=add' >Add </a> <br> ");
		
		}
		response.getWriter().write("<br> <br> <br>");
		
		if( request.getParameter("cm").equals("rm")){
			request.getSession().removeAttribute("car");
		}if( request.getParameter("cm").equals("add")){
			list.add( new Date() .toString());
		    request.getSession().setAttribute("cat", list);
		}
		
		for (String object : list) {
			response.getWriter().write( object.toString() +"<br>" );
		 }
	}


	@Override
	public void valueBound(HttpSessionBindingEvent event) {
	}


	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
	}

}
