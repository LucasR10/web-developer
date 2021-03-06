package br.com.webdeveloper.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

public class MyServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
       System.err.println("Init servlet ");
	}
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		 javax.servlet.http.Cookie c = new javax.servlet.http.Cookie("valor", "val");
		 
		resp.setContentType("text/hml");
	    resp.getWriter().println(" N�o, n�o se trata so de tamanho");
	    resp.getWriter().println(" req.getAuthType() "+ req.getAuthType() );
	    resp.getWriter().println(" req.getCharacterEncoding() "+ req.getCharacterEncoding() );
	    resp.getWriter().println(" req.getContextPath() "+ req.getContextPath()  );
	    resp.getWriter().println(" req.getLocalAddr() "+ req.getLocalAddr() );
	    resp.getWriter().println(" req.getLocalName() "+ req.getLocalName());
	    resp.getWriter().println(" req.getRemoteUser() "+ req.getMethod() );
	    resp.getWriter().println(" req.getRemoteUser() "+ req.getRemoteUser() );
	    resp.getWriter().println(" resp.getContentType() "+ resp.getContentType() );
	    resp.getWriter().println(" resp.getStatus() "+  resp.getStatus() );
	    resp.getWriter().println(" resp.getStatus() "+  resp.getBufferSize());
	    resp.getWriter().println(" User-Agent "+  req.getHeader("User-Agent"));
	    ;
	    for (String iterable_element : req.getParameterValues("nome")) {
	    	resp.getWriter().println( iterable_element );
		}
	    resp.getWriter().append("email: ").append( getServletConfig().getInitParameter(LendoParamWebXml.EMAIL));  
	    resp.getWriter().append("email: ").append( getServletContext().getInitParameter(LendoParamWebXml.EMAIL)); 
	     //resp.sendRedirect("/WebApp/formulario.jsp");
	 }
	 
}
